package manejoestudiantes;

import java.util.Date;
import javax.swing.JOptionPane;

public class matricula {

    private int cantEstudiantes;
    private int cantMaterias;
    private estudiantes arregloEstudiantes[];
    private materias arregloMaterias[];

    //Construcor
    public matricula(int tam) {
        cantEstudiantes = tam;
        cantMaterias = 100;
        arregloEstudiantes = new estudiantes[tam];
        arregloMaterias = new materias[100];
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public int getCantMaterias() {
        return cantMaterias;
    }

    public void setCantMaterias(int cantMaterias) {
        this.cantMaterias = cantMaterias;
    }

    public estudiantes getArregloEstudiantes(int posicion) {
        return arregloEstudiantes[posicion];
    }

    public void setEstudiants(estudiantes est, int posicion) {
        this.arregloEstudiantes[posicion] = est;
    }

    public void setEstudents(int pos, String cod, String name, String sex, Date Fdn, String carr, String phone, String email) {
        estudiantes est = new estudiantes();
        arregloEstudiantes[pos] = est;
        est.setCodigoEstudiante(cod);
        est.setNombre(name);
        est.setSexo(sex);
        est.setFechaDeNacimiento(Fdn);
        est.setCarrera(carr);
        est.setTelefono(phone);
        est.setCorreo(email);
    }

    public void setEstudiantes(estudiantes est, int posicion) {
        this.arregloEstudiantes[posicion] = est;
    }

    public materias getArregloMaterias(int posicion) {
        return arregloMaterias[posicion];
    }

    public void setMaterias(materias mat, int posicion) {
        this.arregloMaterias[posicion] = mat;
    }

    //Metodo para buscar estudiante
    public int buscarEstudiante(String cod) {
        int i = 0;
        int res = -1;

        while (i < cantEstudiantes) {
            
            if(arregloEstudiantes[i] == null){
                continue;
            }
            
            if (cod.equals(arregloEstudiantes[i].getCodigoEstudiante())) {
                res = i;
                break;
            } else {
                i++;
            }
        }
        return res;
    }

    //Metodo para buscar materia
    public float buscarMaterias(String codigoEst, String materia) {
        int i = 0;
        float notafinal = 0;

        while (i < cantMaterias) {
            if (codigoEst.equals(arregloMaterias[i].getCodigoEstudiante()) && materia.equals(arregloMaterias[i].getMateria())) {
                notafinal = arregloMaterias[i].calcNotaFinal();
            } else if (notafinal == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro al estudiante");
            } else {
                i++;
            }
        }

        return notafinal;

    }

    public int obtenerPosicionMateria(String codigoEst, String materia) {
        int contador = 0;
        for (int i = 0; i < getCantMaterias(); i++) {
            if (codigoEst.equals(arregloMaterias[i].getCodigoEstudiante()) && materia.equals(arregloMaterias[i].getMateria())) {
                return contador;
            }
            contador++;
        }
        return 0;

    }

    //Metodo para validar si un estudiante ya fue guardado
    public boolean validarEstudiante(String codigo, int numest) {
        int i = 0;
        boolean encontrado = false;
        if (numest > 0) {
            for (i = 0; i < numest; i++) {
                if ((arregloEstudiantes[i].getCodigoEstudiante()).equals(codigo)) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    //Metodo para validad si una Materia no se repita en el estudiante
    public boolean validarMateria(String materia, int numest) {
        int i = 0;
        boolean encontrado = false;
        if (numest > 0) {
            for (i = 0; i < numest; i++) {
                if ((arregloMaterias[i].getMateria()).equals(materia)) {
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

}
