package banco;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class Controlador {

    private administrador baseDeDatos = new administrador();
    private clientView clientView = new clientView(baseDeDatos);
    private adminView vistaAdministrador = new adminView(baseDeDatos);
    private login log = new login(baseDeDatos, vistaAdministrador);

    public Controlador() {
        log.initWindow();

        vistaAdministrador.regresar.addActionListener((ActionEvent evt) -> regresar(evt));
        clientView.regresarDeCliente.addActionListener((ActionEvent evt) -> regresarDeCliente(evt));
        log.botonUsuario.addActionListener((ActionEvent evt) -> botonUsuario(evt));
        vistaAdministrador.eliminarCuenta.addActionListener((ActionEvent evt) -> eliminarCuenta(evt));
        vistaAdministrador.consignarAdmin.addActionListener((ActionEvent evt) -> consignarAdmin(evt));
        vistaAdministrador.buscarClienteCreditos.addActionListener((ActionEvent evt) -> buscarClienteCreditos(evt));
        vistaAdministrador.aprobarCredito.addActionListener((ActionEvent evt) -> aprobarCredito(evt));
        vistaAdministrador.rechazarCredito.addActionListener((ActionEvent evt) -> rechazarCredito(evt));
        clientView.estadoDeCredito.addActionListener((ActionEvent evt) -> estadoDeCredito(evt));
        clientView.retirarDineroCliente.addActionListener((ActionEvent evt) -> retirarDineroCliente(evt));
        clientView.clienteSolicitarCredito.addActionListener((ActionEvent evt) -> clienteSolicitarCredito(evt));

        clientView.pagarCredito.addActionListener((ActionEvent evt) -> pagarCredito(evt));
    }

    private void regresar(java.awt.event.ActionEvent evt) {
        vistaAdministrador.setVisible(false);
        log.setVisible(true);
    }

    private void regresarDeCliente(java.awt.event.ActionEvent evt) {
        clientView.setVisible(false);
        log.setVisible(true);
    }

    private void pagarCredito(java.awt.event.ActionEvent evt) {

    }

    private void estadoDeCredito(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = log.usuario.getText();
            int buscarClientes = buscarCliente(identificacion);

            boolean estado = baseDeDatos.getArregloDeClientes(buscarClientes).isEstaAprobado();

            if (estado) {
                clientView.textoEstado.setText("Credito Aprobado");
            } else {
                clientView.textoEstado.setText("Credito Rechazado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void aprobarCredito(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = vistaAdministrador.idSolicitandoCredito.getSelectedItem().toString();
            int buscarClientes = buscarCliente(identificacion);

            float saldo = baseDeDatos.getArregloDeClientes(buscarClientes).getSaldo();
            float credito = baseDeDatos.getArregloDeClientes(buscarClientes).getCredito();
            baseDeDatos.getArregloDeClientes(buscarClientes).setSaldo(saldo + credito);
            baseDeDatos.getArregloDeClientes(buscarClientes).setEstaAprobado(true);
            baseDeDatos.getArregloDeClientes(buscarClientes).calcularDeuda(credito);

            vistaAdministrador.areaCreditos.setText("EL CREDITO HA SIDO APROVADO CON EXITO!!");
            float deuda = baseDeDatos.getArregloDeClientes(buscarClientes).getDeuda();
            clientView.textoDeudaCredito.setText(String.valueOf(deuda));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void rechazarCredito(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = vistaAdministrador.idSolicitandoCredito.getSelectedItem().toString();
            int buscarClientes = buscarCliente(identificacion);

            baseDeDatos.getArregloDeClientes(buscarClientes).setCredito(0);
            baseDeDatos.getArregloDeClientes(buscarClientes).setCuotas(0);
            baseDeDatos.getArregloDeClientes(buscarClientes).setEstaAprobado(false);

            vistaAdministrador.areaCreditos.setText("EL CREDITO HA SIDO RECHAZADO CON EXITO!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void buscarClienteCreditos(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = vistaAdministrador.idSolicitandoCredito.getSelectedItem().toString();
            int buscarClientes = buscarCliente(identificacion);

            vistaAdministrador.areaCreditos.setText("Nombre: " + baseDeDatos.getArregloDeClientes(buscarClientes).getNombre() + "\n"
                    + "Cantidad del credito: $ " + String.valueOf(baseDeDatos.getArregloDeClientes(buscarClientes).getCredito()) + "\n"
                    + "Cuotas: " + String.valueOf(baseDeDatos.getArregloDeClientes(buscarClientes).getCuotas()) + "\n");

        } catch (Exception e) {
            vistaAdministrador.mensajeError("Error 101 - No hay usuarios para buscar");
        }
    }

    private void clienteSolicitarCredito(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = log.usuario.getText();
            vistaAdministrador.idSolicitandoCredito.addItem(identificacion);
            int buscarClientes = buscarCliente(identificacion);

            float montoCredito = Float.parseFloat(clientView.campoCantidadCredito.getText());
            baseDeDatos.getArregloDeClientes(buscarClientes).setCredito(montoCredito);

            int cuotas = Integer.parseInt(clientView.cantidadCuotasCreditos.getSelectedItem().toString());
            baseDeDatos.getArregloDeClientes(buscarClientes).setCuotas(cuotas);

            clientView.campoCantidadCredito.setText("");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void consignarAdmin(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = vistaAdministrador.identificacionMovimientos.getSelectedItem().toString();
            int buscarClientes = buscarCliente(identificacion);

            float monto = Float.parseFloat(vistaAdministrador.montoMovimiento.getText());
            float saldo = baseDeDatos.getArregloDeClientes(buscarClientes).getSaldo();
            baseDeDatos.getArregloDeClientes(buscarClientes).setSaldo(saldo + monto);

            clientView.saldoVistaCliente.setText(String.valueOf(mostrarSaldo(buscarClientes)));

            LocalDate diaDeHoy = LocalDate.now();

            vistaAdministrador.areaMovimientosAdmin.setText("- Fecha:" + String.valueOf(diaDeHoy) + "\n"
                    + "- Nombre: " + baseDeDatos.getArregloDeClientes(buscarClientes).getNombre() + "\n"
                    + "- Identificación:" + baseDeDatos.getArregloDeClientes(buscarClientes).getIdentificacion() + "\n"
                    + "- Valor Consignado: $ " + String.valueOf(monto)
            );

        } catch (Exception e) {
            vistaAdministrador.mensajeError("Error 101 - No hay usuarios para consignar!");
        }
    }

    private void retirarDineroCliente(java.awt.event.ActionEvent evt) {
        try {

            String identificacion = log.usuario.getText();
            int buscarClientes = buscarCliente(identificacion);
            float montoARetirar = Float.parseFloat(clientView.montoMovimiento.getText());
            float saldo = baseDeDatos.getArregloDeClientes(buscarClientes).getSaldo();

            if (montoARetirar > saldo) {
                vistaAdministrador.mensajeError("El monto a retirar supera su saldo");
            } else {
                baseDeDatos.getArregloDeClientes(buscarClientes).setSaldo(saldo - montoARetirar);
                clientView.saldoVistaCliente.setText(String.valueOf(mostrarSaldo(buscarClientes)));
                LocalDate diaDeHoy = LocalDate.now();

                clientView.areaRecibosCliente.setText("- Fecha: " + String.valueOf(diaDeHoy) + "\n"
                        + "- Nombre: " + baseDeDatos.getArregloDeClientes(buscarClientes).getNombre() + "\n"
                        + "- Identificacion: " + baseDeDatos.getArregloDeClientes(buscarClientes).getIdentificacion() + "\n"
                        + "- Valor Retirado: " + String.valueOf(montoARetirar)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public float mostrarSaldo(int pos) {
        return baseDeDatos.getArregloDeClientes(pos).getSaldo();
    }

    private void botonUsuario(java.awt.event.ActionEvent evt) {
        try {
            for (int i = 0; i < baseDeDatos.getCantClientes(); i++) {

                if (log.usuario.getText().equals(baseDeDatos.getArregloDeClientes(i).getIdentificacion()) && log.contraseñaUsuario.getText().equals(baseDeDatos.getArregloDeClientes(i).getContaseña())) {
                    log.mensajePanel("Inicio de sesión correcto");
                    log.setVisible(false);

                    clientView.initWindow();
                    int pos = buscarCliente(log.usuario.getText());
                    clientView.saldoVistaCliente.setText(String.valueOf(mostrarSaldo(pos)));

                    break;
                } else {
                    log.mensajePanel("Usuario y/o contraseña incorrectos");
                }
            }
        } catch (Exception e) {
            log.mensajePanel("Complete los campos");
        }
    }

    private int buscarCliente(String identificacion) {
        int i = 0;
        int res = -1;

        while (i < baseDeDatos.getCantClientes()) {

            if (baseDeDatos.getArregloDeClientes(i) == null) {
                continue;
            }

            if (identificacion.equals(baseDeDatos.getArregloDeClientes(i).getIdentificacion())) {
                res = i;
                break;
            } else {
                i++;
            }
        }
        return res;
    }

    private void eliminarCuenta(java.awt.event.ActionEvent evt) {
        try {
            String identificacion = vistaAdministrador.comboIdentificacion.getSelectedItem().toString();

            if (vistaAdministrador.comboIdentificacion.getSelectedItem().toString() == null) {
                vistaAdministrador.mensajeError("No tiene clientes");
            } else {
                int index = buscarCliente(identificacion);
                Clientes[] listado = baseDeDatos.listaDeClientes();
                listado[index] = null;

                for (int i = index; i < baseDeDatos.getCantClientes() - 1; i++) {

                    Clientes clienteSig = listado[i + 1];
                    listado[i] = clienteSig;
                    clienteSig = null;
                }
                vistaAdministrador.contadorDeClientes--;
                vistaAdministrador.comboIdentificacion.removeItem(vistaAdministrador.comboIdentificacion.getSelectedItem());
                vistaAdministrador.identificacionMovimientos.removeItem(vistaAdministrador.identificacionMovimientos.getSelectedItem());
                vistaAdministrador.areaCancelarCuenta.setText("");
                vistaAdministrador.mensajeError("La cuenta ha sido eliminada con exito!");
            }

        } catch (NumberFormatException e) {
            System.out.println(e);

        }
    }

}
