/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Suarez
 */
public class adminView extends javax.swing.JFrame {
        
    int contadorDeClientes = 0;
    administrador baseDeDatos;
    
    /**
     * Creates new form adminView
     */
    public adminView(administrador admin) {    
        this.baseDeDatos = admin;
        initComponents();
    }

    public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void limpiarCampos() {
        name.setText("");
        id.setText("");
        nacimiento.setText("");
        email.setText("");
        phone.setText("");
        direc.setText("");
        password.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nacimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ocupation = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        corriente = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        direc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboIdentificacionCDT = new javax.swing.JComboBox<>();
        buscarParaCDT = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        aprobarCDT = new javax.swing.JButton();
        montoIniciarCDT = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        plazoCDT = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        montoMovimiento = new javax.swing.JTextField();
        consignarAdmin = new javax.swing.JButton();
        pagarCreditoAdmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMovimientosAdmin = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        identificacionMovimientos = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        idSolicitandoCredito = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        buscarClienteCreditos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaCreditos = new javax.swing.JTextArea();
        rechazarCredito = new javax.swing.JButton();
        aprobarCredito = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboIdentificacion = new javax.swing.JComboBox<>();
        buscarParaEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCancelarCuenta = new javax.swing.JTextArea();
        eliminarCuenta = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(64, 154, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apertura de Cuentas");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 938, -1));

        crearUsuario.setBackground(new java.awt.Color(64, 154, 243));
        crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/add-user.png"))); // NOI18N
        crearUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(crearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres y Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 40, 137, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Identificacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 74, 137, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 106, -1, -1));
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 102, 137, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, -1, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 193, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ocupacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, -1, -1));

        ocupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Universitario/a", "Trabajador/a" }));
        jPanel1.add(ocupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 227, 91, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de cuenta:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 304, -1, -1));

        corriente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(corriente);
        corriente.setForeground(new java.awt.Color(0, 0, 0));
        corriente.setText("Corriente");
        corriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrienteActionPerformed(evt);
            }
        });
        jPanel1.add(corriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 301, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Ahorros");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 301, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("dd/mm/aaaa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 106, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 130, 137, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Telefono:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, -1, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 159, 137, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Dirección:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 265, -1, -1));
        jPanel1.add(direc, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 261, 137, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Contraseña:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 44, -1, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 40, 137, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/cliente.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 303, 307));

        regresar.setBackground(new java.awt.Color(64, 154, 243));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/134leftarrow_100014.png"))); // NOI18N
        regresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 60, 40));

        jTabbedPane1.addTab("Apertura", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(64, 154, 243));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CDT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Identificacion:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        comboIdentificacionCDT.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(comboIdentificacionCDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 140, -1));

        buscarParaCDT.setBackground(new java.awt.Color(64, 154, 243));
        buscarParaCDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarParaCDT.setForeground(new java.awt.Color(0, 0, 0));
        buscarParaCDT.setText("Buscar");
        buscarParaCDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarParaCDTActionPerformed(evt);
            }
        });
        jPanel2.add(buscarParaCDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Cliente:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Identificacion:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("NNNN");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("NNNN");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 90, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/cdt-img.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Monto Inicial:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        aprobarCDT.setBackground(new java.awt.Color(64, 154, 243));
        aprobarCDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aprobarCDT.setForeground(new java.awt.Color(0, 0, 0));
        aprobarCDT.setText("Registrar CDT");
        jPanel2.add(aprobarCDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        montoIniciarCDT.setBackground(new java.awt.Color(255, 255, 255));
        montoIniciarCDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        montoIniciarCDT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(montoIniciarCDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Plazo:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        plazoCDT.setBackground(new java.awt.Color(255, 255, 255));
        plazoCDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plazoCDT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(plazoCDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, -1));

        jTabbedPane1.addTab("CDT", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(64, 154, 243));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Movimientos Bancarios");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Monto:");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        montoMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        montoMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(montoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, -1));

        consignarAdmin.setBackground(new java.awt.Color(64, 154, 243));
        consignarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        consignarAdmin.setText("Consignar");
        jPanel7.add(consignarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        pagarCreditoAdmin.setBackground(new java.awt.Color(64, 154, 243));
        pagarCreditoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        pagarCreditoAdmin.setText("Pagar Credito");
        jPanel7.add(pagarCreditoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        areaMovimientosAdmin.setBackground(new java.awt.Color(255, 255, 255));
        areaMovimientosAdmin.setColumns(20);
        areaMovimientosAdmin.setRows(5);
        jScrollPane2.setViewportView(areaMovimientosAdmin);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 380, 200));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Recibo del Movimiento");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Usuario ID:");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        identificacionMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        identificacionMovimientos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(identificacionMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 120, -1));

        jTabbedPane1.addTab("Movimientos", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(64, 154, 243));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Aprobaciones Crediticias");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Datos del solicitante");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        idSolicitandoCredito.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(idSolicitandoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Id. Solicitando:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        buscarClienteCreditos.setBackground(new java.awt.Color(64, 154, 243));
        buscarClienteCreditos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarClienteCreditos.setForeground(new java.awt.Color(0, 0, 0));
        buscarClienteCreditos.setText("Buscar");
        jPanel9.add(buscarClienteCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        areaCreditos.setEditable(false);
        areaCreditos.setBackground(new java.awt.Color(255, 255, 255));
        areaCreditos.setColumns(20);
        areaCreditos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        areaCreditos.setRows(5);
        jScrollPane3.setViewportView(areaCreditos);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 270, 120));

        rechazarCredito.setBackground(new java.awt.Color(255, 43, 61));
        rechazarCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rechazarCredito.setForeground(new java.awt.Color(0, 0, 0));
        rechazarCredito.setText("Rechazar Credito");
        jPanel9.add(rechazarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 180, 30));

        aprobarCredito.setBackground(new java.awt.Color(64, 154, 243));
        aprobarCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aprobarCredito.setForeground(new java.awt.Color(0, 0, 0));
        aprobarCredito.setText("Aprobar Credito");
        jPanel9.add(aprobarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, 30));

        jTabbedPane1.addTab("Aprobaciones de Creditos", jPanel9);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(64, 154, 243));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cancelar Cuenta");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Identificacion:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        comboIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(comboIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 140, -1));

        buscarParaEliminar.setBackground(new java.awt.Color(64, 154, 243));
        buscarParaEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarParaEliminar.setForeground(new java.awt.Color(0, 0, 0));
        buscarParaEliminar.setText("Buscar");
        buscarParaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarParaEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(buscarParaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 50, 90, -1));

        areaCancelarCuenta.setEditable(false);
        areaCancelarCuenta.setBackground(new java.awt.Color(255, 255, 255));
        areaCancelarCuenta.setColumns(20);
        areaCancelarCuenta.setRows(5);
        jScrollPane1.setViewportView(areaCancelarCuenta);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 260));

        eliminarCuenta.setBackground(new java.awt.Color(64, 154, 243));
        eliminarCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eliminarCuenta.setForeground(new java.awt.Color(0, 0, 0));
        eliminarCuenta.setText("Eliminar Cuenta");
        jPanel3.add(eliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jTabbedPane1.addTab("Cancelar Cuenta", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        if (contadorDeClientes < baseDeDatos.getCantClientes()) {
            try {
                Clientes clientes = new Clientes();

                String nombre = name.getText();
                clientes.setNombre(nombre);

                String pass = password.getText();
                clientes.setContaseña(pass);

                String identificacion = id.getText();
                clientes.setIdentificacion(identificacion);

                String fechaNacimiento = nacimiento.getText();
                clientes.setFecchaDeNacimiento(fechaNacimiento);

                String correo = email.getText();
                clientes.setEmail(correo);

                String telefono = phone.getText();
                clientes.setTelefono(telefono);

                String sexo = sex.getSelectedItem().toString();
                clientes.setSexo(sexo);

                String ocupacion = ocupation.getSelectedItem().toString();
                clientes.setOcupacion(ocupacion);

                String direccion = direc.getText();
                clientes.setDireccion(direccion);

                String tipoDeCuenta;
                if (corriente.isSelected()) {
                    tipoDeCuenta = "Corriente";
                } else {
                    tipoDeCuenta = "Ahorros";
                }
                clientes.setTipoDeCuenta(tipoDeCuenta);

                baseDeDatos.setArregloDeClientes(clientes, contadorDeClientes);
                
                identificacionMovimientos.addItem(identificacion);
                comboIdentificacion.addItem(identificacion);

                contadorDeClientes++;

                limpiarCampos();

            } catch (Exception e) {
                mensajeError("Faltan campos por completar");
            }
        } else {
            mensajeError("Has registrado muchas personas hoy");
        }
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void corrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corrienteActionPerformed

    private void buscarParaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarParaEliminarActionPerformed
        for (int i = 0; i < baseDeDatos.getCantClientes(); i++) {
            
            if (baseDeDatos.getArregloDeClientes(i) == null) {
                    continue;
            }
            
            if (comboIdentificacion.getSelectedItem().toString().equals(baseDeDatos.getArregloDeClientes(i).getIdentificacion())) {
         
                areaCancelarCuenta.setText("Nombre: " + baseDeDatos.getArregloDeClientes(i).getNombre() + "\n"
                        + "Contraseña: " + baseDeDatos.getArregloDeClientes(i).getContaseña() + "\n"
                        + "Tipo de Cuenta: " + baseDeDatos.getArregloDeClientes(i).getTipoDeCuenta() + "\n"
                        + "Identificacion: " + baseDeDatos.getArregloDeClientes(i).getIdentificacion() + "\n"
                        + "Fecha de Nacimiento: " + baseDeDatos.getArregloDeClientes(i).getFecchaDeNacimiento() + "\n"
                        + "Email: " + baseDeDatos.getArregloDeClientes(i).getEmail() + "\n"
                        + "Telefono: " + baseDeDatos.getArregloDeClientes(i).getTelefono() + "\n"
                        + "Sexo: " + baseDeDatos.getArregloDeClientes(i).getSexo() + "\n"
                        + "Ocupacion: " + baseDeDatos.getArregloDeClientes(i).getOcupacion() + "\n"
                        + "Direccion: " + baseDeDatos.getArregloDeClientes(i).getDireccion());

            } else {

            }
        }

    }//GEN-LAST:event_buscarParaEliminarActionPerformed

    private void buscarParaCDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarParaCDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarParaCDTActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aprobarCDT;
    public javax.swing.JButton aprobarCredito;
    public javax.swing.JTextArea areaCancelarCuenta;
    public javax.swing.JTextArea areaCreditos;
    public javax.swing.JTextArea areaMovimientosAdmin;
    public javax.swing.JButton buscarClienteCreditos;
    private javax.swing.JButton buscarParaCDT;
    private javax.swing.JButton buscarParaEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> comboIdentificacion;
    private javax.swing.JComboBox<String> comboIdentificacionCDT;
    public javax.swing.JButton consignarAdmin;
    private javax.swing.JRadioButton corriente;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JTextField direc;
    public javax.swing.JButton eliminarCuenta;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    public javax.swing.JComboBox<String> idSolicitandoCredito;
    public javax.swing.JComboBox<String> identificacionMovimientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField montoIniciarCDT;
    public javax.swing.JTextField montoMovimiento;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> ocupation;
    public javax.swing.JButton pagarCreditoAdmin;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField plazoCDT;
    public javax.swing.JButton rechazarCredito;
    public javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}