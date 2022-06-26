
package banco;


public class clientView extends javax.swing.JFrame {
    
    administrador admin = new administrador();

    
    public clientView(administrador admin) {
        initComponents();
        this.admin = admin;
    }
    
    public void initWindow() {
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarDeCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        retirarDineroCliente = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        montoMovimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRecibosCliente = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        saldoVistaCliente = new javax.swing.JLabel();
        pagarCredito = new javax.swing.JButton();
        textoDeudaCredito = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCantidadCredito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estadoDeCredito = new javax.swing.JButton();
        cantidadCuotasCreditos = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        clienteSolicitarCredito = new javax.swing.JButton();
        textoEstado = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(64, 154, 243));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion Bancaria");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        regresarDeCliente.setBackground(new java.awt.Color(64, 154, 243));
        regresarDeCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/134leftarrow_100014.png"))); // NOI18N
        regresarDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarDeClienteActionPerformed(evt);
            }
        });
        jPanel1.add(regresarDeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estado de CDT:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NNNN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Identificación:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefono:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Sexo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ocupación:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Dirección:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tipo de cuenta:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nombre:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("NNNN");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("NNNN");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("NNNN");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 100, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("NNNN");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("NNNN");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("NNNN");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("NNNN");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("NNNN");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("NNNN");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 100, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco/images/icono de usuario 2.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jTabbedPane1.addTab("Datos de la Cuenta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(64, 154, 243));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CDT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        jTabbedPane1.addTab("Inscribir CDT", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(64, 154, 243));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Movimientos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        retirarDineroCliente.setBackground(new java.awt.Color(64, 154, 243));
        retirarDineroCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        retirarDineroCliente.setForeground(new java.awt.Color(0, 0, 0));
        retirarDineroCliente.setText("Retirar");
        jPanel3.add(retirarDineroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Recibo del movimiento");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 140, -1));

        montoMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(montoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        areaRecibosCliente.setEditable(false);
        areaRecibosCliente.setBackground(new java.awt.Color(255, 255, 255));
        areaRecibosCliente.setColumns(20);
        areaRecibosCliente.setRows(5);
        jScrollPane1.setViewportView(areaRecibosCliente);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 300, 220));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Monto:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Saldo:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        saldoVistaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saldoVistaCliente.setForeground(new java.awt.Color(0, 0, 0));
        saldoVistaCliente.setText("NNNNN");
        jPanel3.add(saldoVistaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 140, -1));

        pagarCredito.setBackground(new java.awt.Color(64, 154, 243));
        pagarCredito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pagarCredito.setForeground(new java.awt.Color(0, 0, 0));
        pagarCredito.setText("Pagar Credito");
        jPanel3.add(pagarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        textoDeudaCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDeudaCredito.setForeground(new java.awt.Color(0, 0, 0));
        textoDeudaCredito.setText("NNNNN");
        jPanel3.add(textoDeudaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 110, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Deuda Crediticia:");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jTabbedPane1.addTab("Movimimientos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(64, 154, 243));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Solicitud de Credito");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad del credito:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, -1));

        campoCantidadCredito.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(campoCantidadCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("meses");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 130, 20));

        estadoDeCredito.setBackground(new java.awt.Color(64, 154, 243));
        estadoDeCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estadoDeCredito.setForeground(new java.awt.Color(0, 0, 0));
        estadoDeCredito.setText("Ver estado");
        jPanel4.add(estadoDeCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 150, 30));

        cantidadCuotasCreditos.setBackground(new java.awt.Color(255, 255, 255));
        cantidadCuotasCreditos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cantidadCuotasCreditos.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCuotasCreditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "8", "12", "14", "24" }));
        cantidadCuotasCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadCuotasCreditosActionPerformed(evt);
            }
        });
        jPanel4.add(cantidadCuotasCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 120, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Cuotas:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, -1));

        clienteSolicitarCredito.setBackground(new java.awt.Color(64, 154, 243));
        clienteSolicitarCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clienteSolicitarCredito.setForeground(new java.awt.Color(0, 0, 0));
        clienteSolicitarCredito.setText("Solicitar Credito");
        jPanel4.add(clienteSolicitarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, 30));

        textoEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoEstado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(textoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 180, 30));

        jTabbedPane1.addTab("Solicitud de Credito", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tarjeta de Credito", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarDeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarDeClienteActionPerformed

    private void cantidadCuotasCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadCuotasCreditosActionPerformed
    }//GEN-LAST:event_cantidadCuotasCreditosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea areaRecibosCliente;
    public javax.swing.JTextField campoCantidadCredito;
    public javax.swing.JComboBox<String> cantidadCuotasCreditos;
    public javax.swing.JButton clienteSolicitarCredito;
    public javax.swing.JButton estadoDeCredito;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField montoMovimiento;
    public javax.swing.JButton pagarCredito;
    public javax.swing.JButton regresarDeCliente;
    public javax.swing.JButton retirarDineroCliente;
    public javax.swing.JLabel saldoVistaCliente;
    public javax.swing.JLabel textoDeudaCredito;
    public javax.swing.JLabel textoEstado;
    // End of variables declaration//GEN-END:variables
}
