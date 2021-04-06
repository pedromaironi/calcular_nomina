package SistemaNomina;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class MantenimientoEmpleados extends javax.swing.JFrame {

    public MantenimientoEmpleados() {
        initComponents();

        setLocationRelativeTo(null);
        etiCreando.setVisible(false);
        etiModificando.setVisible(false);
        etiNomEmpleado.setVisible(false);
        textNomEmpleado.setVisible(false);
        etiApellidoMat.setVisible(false);
        textApellidoMat.setVisible(false);
        etiApellidoPat.setVisible(false);
        etiDireccion.setVisible(false);
        textIDDepartamento.setVisible(false);
        etiIDDepartamento.setVisible(false);
        etiTelefono.setVisible(false);
        textTelefono.setVisible(false);
        etiSexo.setVisible(false);
        ComboBoxSexo.setVisible(false);
        etiIDEmpleado.setVisible(true);
        textIDPuesto.setVisible(false);
        etiCooperativa.setVisible(false);
        ComboBoxCooperativa.setVisible(false);
        etiSueldo.setVisible(false);
        textSueldo.setVisible(false);
        etiIDPuesto.setVisible(false);
        textApellidoPat.setVisible(false);
        textDireccion.setVisible(false);
        btnCrearEmpleado.setVisible(false);
        btnModificarEmpleado.setVisible(false);
        Fecha.setVisible(false);
        etiFecha.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMantenimientoEmple = new javax.swing.JPanel();
        btnModificarEmpleado = new javax.swing.JButton();
        btnCrearEmpleado = new javax.swing.JButton();
        btnBuscarEmpleado = new javax.swing.JButton();
        etiFecha = new javax.swing.JLabel();
        icoX = new javax.swing.JLabel();
        icoMinimizar = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiCooperativa = new javax.swing.JLabel();
        etiIDPuesto = new javax.swing.JLabel();
        textIDPuesto = new javax.swing.JTextField();
        etiIDDepartamento = new javax.swing.JLabel();
        textIDDepartamento = new javax.swing.JTextField();
        etiDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        etiMatenimientoDepartamento = new javax.swing.JLabel();
        etiApellidoMat = new javax.swing.JLabel();
        textApellidoMat = new javax.swing.JTextField();
        textApellidoPat = new javax.swing.JTextField();
        etiApellidoPat = new javax.swing.JLabel();
        etiNomEmpleado = new javax.swing.JLabel();
        etiIDEmpleado = new javax.swing.JLabel();
        textNomEmpleado = new javax.swing.JTextField();
        textIDEmpleado = new javax.swing.JTextField();
        etiCreando = new javax.swing.JLabel();
        etiModificando = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        etiSexo = new javax.swing.JLabel();
        ComboBoxSexo = new javax.swing.JComboBox<>();
        ComboBoxCooperativa = new javax.swing.JComboBox<>();
        etiSueldo = new javax.swing.JLabel();
        textSueldo = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelMantenimientoEmple.setBackground(new java.awt.Color(32, 45, 60));
        jPanelMantenimientoEmple.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificarEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        btnModificarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarEmpleado.setText("Modificar empleado");
        btnModificarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEmpleadoMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(btnModificarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 190, 50));

        btnCrearEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        btnCrearEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearEmpleado.setText("Crear empleado");
        btnCrearEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(btnCrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 190, 50));

        btnBuscarEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        btnBuscarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarEmpleado.setText("Buscar empleado");
        btnBuscarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 190, 50));

        etiFecha.setBackground(new java.awt.Color(255, 255, 255));
        etiFecha.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiFecha.setText("Fecha");
        jPanelMantenimientoEmple.add(etiFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 190, 20));

        icoX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        icoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoXMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(icoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        icoMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        icoMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMinimizarMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(icoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu");
        jPanelMantenimientoEmple.add(etiVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        icoFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Back_Arrow_50px_1.png"))); // NOI18N
        icoFlecha.setToolTipText("");
        icoFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoFlechaMouseClicked(evt);
            }
        });
        jPanelMantenimientoEmple.add(icoFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));
        jPanelMantenimientoEmple.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 510, 10));

        etiCooperativa.setBackground(new java.awt.Color(255, 255, 255));
        etiCooperativa.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiCooperativa.setForeground(new java.awt.Color(255, 255, 255));
        etiCooperativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCooperativa.setText("Cooperativa");
        jPanelMantenimientoEmple.add(etiCooperativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 190, 20));

        etiIDPuesto.setBackground(new java.awt.Color(255, 255, 255));
        etiIDPuesto.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiIDPuesto.setForeground(new java.awt.Color(255, 255, 255));
        etiIDPuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIDPuesto.setText("ID Puesto");
        jPanelMantenimientoEmple.add(etiIDPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 190, 20));

        textIDPuesto.setBackground(new java.awt.Color(32, 45, 60));
        textIDPuesto.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDPuesto.setForeground(new java.awt.Color(255, 255, 255));
        textIDPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textIDPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 190, 30));

        etiIDDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        etiIDDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiIDDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        etiIDDepartamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIDDepartamento.setText("ID Departamento");
        jPanelMantenimientoEmple.add(etiIDDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 190, 20));

        textIDDepartamento.setBackground(new java.awt.Color(32, 45, 60));
        textIDDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        textIDDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textIDDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 190, 30));

        etiDireccion.setBackground(new java.awt.Color(255, 255, 255));
        etiDireccion.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiDireccion.setForeground(new java.awt.Color(255, 255, 255));
        etiDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiDireccion.setText("Direccion");
        jPanelMantenimientoEmple.add(etiDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 190, 20));

        textDireccion.setBackground(new java.awt.Color(32, 45, 60));
        textDireccion.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textDireccion.setForeground(new java.awt.Color(255, 255, 255));
        textDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 190, 30));

        etiMatenimientoDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiMatenimientoDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setText("Mantenimiento de Empleados");
        jPanelMantenimientoEmple.add(etiMatenimientoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        etiApellidoMat.setBackground(new java.awt.Color(255, 255, 255));
        etiApellidoMat.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiApellidoMat.setForeground(new java.awt.Color(255, 255, 255));
        etiApellidoMat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiApellidoMat.setText("Apellido materno");
        jPanelMantenimientoEmple.add(etiApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 190, 20));

        textApellidoMat.setBackground(new java.awt.Color(32, 45, 60));
        textApellidoMat.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textApellidoMat.setForeground(new java.awt.Color(255, 255, 255));
        textApellidoMat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 190, 30));

        textApellidoPat.setBackground(new java.awt.Color(32, 45, 60));
        textApellidoPat.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textApellidoPat.setForeground(new java.awt.Color(255, 255, 255));
        textApellidoPat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 190, 30));

        etiApellidoPat.setBackground(new java.awt.Color(255, 255, 255));
        etiApellidoPat.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiApellidoPat.setForeground(new java.awt.Color(255, 255, 255));
        etiApellidoPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiApellidoPat.setText("Apellido paterno");
        jPanelMantenimientoEmple.add(etiApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 190, 20));

        etiNomEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        etiNomEmpleado.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiNomEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        etiNomEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNomEmpleado.setText("Nombre");
        jPanelMantenimientoEmple.add(etiNomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 190, 20));

        etiIDEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        etiIDEmpleado.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiIDEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        etiIDEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIDEmpleado.setText("ID del empleado");
        jPanelMantenimientoEmple.add(etiIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 190, 20));

        textNomEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        textNomEmpleado.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textNomEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        textNomEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textNomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 190, 30));

        textIDEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        textIDEmpleado.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        textIDEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 190, 30));

        etiCreando.setBackground(new java.awt.Color(255, 255, 255));
        etiCreando.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiCreando.setForeground(new java.awt.Color(255, 255, 255));
        etiCreando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCreando.setText("Creando");
        jPanelMantenimientoEmple.add(etiCreando, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 210));

        etiModificando.setBackground(new java.awt.Color(255, 255, 255));
        etiModificando.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiModificando.setForeground(new java.awt.Color(255, 255, 255));
        etiModificando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiModificando.setText("Modificando");
        jPanelMantenimientoEmple.add(etiModificando, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 300, 200));

        etiTelefono.setBackground(new java.awt.Color(255, 255, 255));
        etiTelefono.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etiTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiTelefono.setText("Telefono");
        jPanelMantenimientoEmple.add(etiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 190, 20));

        textTelefono.setBackground(new java.awt.Color(32, 45, 60));
        textTelefono.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textTelefono.setForeground(new java.awt.Color(255, 255, 255));
        textTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 190, 30));

        etiSexo.setBackground(new java.awt.Color(255, 255, 255));
        etiSexo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiSexo.setForeground(new java.awt.Color(255, 255, 255));
        etiSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiSexo.setText("Sexo");
        jPanelMantenimientoEmple.add(etiSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 190, 20));

        ComboBoxSexo.setBackground(new java.awt.Color(32, 45, 60));
        ComboBoxSexo.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));
        jPanelMantenimientoEmple.add(ComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 190, 30));

        ComboBoxCooperativa.setBackground(new java.awt.Color(32, 45, 60));
        ComboBoxCooperativa.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        ComboBoxCooperativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanelMantenimientoEmple.add(ComboBoxCooperativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 190, 30));

        etiSueldo.setBackground(new java.awt.Color(255, 255, 255));
        etiSueldo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiSueldo.setForeground(new java.awt.Color(255, 255, 255));
        etiSueldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiSueldo.setText("Sueldo");
        jPanelMantenimientoEmple.add(etiSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 190, 20));

        textSueldo.setBackground(new java.awt.Color(32, 45, 60));
        textSueldo.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textSueldo.setForeground(new java.awt.Color(255, 255, 255));
        textSueldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoEmple.add(textSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 190, 30));

        Fecha.setBackground(new java.awt.Color(32, 45, 60));
        Fecha.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        Fecha.setMaxSelectableDate(new java.util.Date(253370782873000L));
        jPanelMantenimientoEmple.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 580, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMantenimientoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMantenimientoEmple, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icoXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoXMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Menu", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_icoXMouseClicked

    private void icoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(MantenimientoEmpleados.ICONIFIED);
    }//GEN-LAST:event_icoMinimizarMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void btnBuscarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseClicked
        // TODO add your handling code here:
        File file = new File("Empleados.txt");
        String cadena = "", cadena1 = "";
        FileReader leer;
        BufferedReader almacenamiento;
        FileWriter escribirArchivo;
        PrintWriter escribir;
        boolean band = false, band2 = false, band3 = false, band_for = false;
        int opcion;
        ArrayList<String> Array = new ArrayList<>();
        String idEmpleado = String.valueOf(textIDEmpleado.getText());
        if (!file.exists()) {
            try {
                JOptionPane.showMessageDialog(null, "EL Archivo fue creado correctamente",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                if ("".equals(textIDEmpleado.getText())) {
                    JOptionPane.showMessageDialog(null, "Campos vacios",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    band = true;
                }
                if (band == true) {
                    leer = new FileReader(file);
                    almacenamiento = new BufferedReader(leer);
                    if ((cadena = (almacenamiento.readLine())) == null) {
                        opcion = JOptionPane.showConfirmDialog(
                                null,
                                "¿Desea crear un Empleado?\n" + "No existe ningun Empleado",
                                "¿Pregunta?",
                                JOptionPane.YES_NO_OPTION);
                        if (opcion == 0) {
                            band2 = true;
                        } else {
                            this.dispose();
                            new Menu().setVisible(true);
                        }
                        almacenamiento.close();
                        leer.close();

                    } else {
                        leer = new FileReader(file);
                        almacenamiento = new BufferedReader(leer);
                        while ((cadena = (almacenamiento.readLine())) != null) {
                            if (cadena != null) {
                                String[] arreglo1 = cadena.split(",");
                                Array.addAll(Arrays.asList(arreglo1));
                            }
                        }
                        almacenamiento.close();
                        leer.close();
                        for (int i = 0; i < Array.size(); i++) {
                            if (idEmpleado.equals(Array.get(i))) {
                                textNomEmpleado.setText(Array.get(i + 1));
                                textApellidoMat.setText(Array.get(i + 2));
                                textApellidoPat.setText(Array.get(i + 3));
                                textDireccion.setText(Array.get(i + 4));
                                textTelefono.setText(Array.get(i + 5));
                                String sexo2 = Array.get(i + 6);
                                int index = 0, index2 = 0;
                                if ("Masculino".equals(sexo2)) {
                                    index = 0;
                                } else if ("Femenino".equals(sexo2)) {
                                    index = 1;
                                }
                                ComboBoxSexo.setSelectedIndex(index);
                                textIDDepartamento.setText(Array.get(i + 7));
                                textIDPuesto.setText(Array.get(i + 8));
                                String coop = Array.get(i + 9);
                                if ("Si".equals(coop)) {
                                    index2 = 0;
                                } else if ("No".equals(coop)) {
                                    index2 = 1;
                                }
                                ComboBoxCooperativa.setSelectedIndex(index2);
                                textSueldo.setText(Array.get(i + 11));
                                band3 = true;
                                band_for = true;
                                break;
                            }
                        }
                        if (band_for == false) {
                            opcion = JOptionPane.showConfirmDialog(
                                    null,
                                    "¿Desea crear un Empleado?\n" + "No existe ningun Empleado",
                                    "¿Pregunta?",
                                    JOptionPane.YES_NO_OPTION);

                            if (opcion == 0) {
                                band2 = true;
                            } else {
                                this.dispose();
                                new Menu().setVisible(true);
                            }
                        }
                    }

                    if (band3 == true) {
                        textIDEmpleado.setEnabled(false);
                        btnBuscarEmpleado.setEnabled(false);
                        etiModificando.setVisible(true);
                        etiCreando.setVisible(false);
                        etiNomEmpleado.setVisible(true);
                        textNomEmpleado.setVisible(true);
                        etiApellidoMat.setVisible(true);
                        textApellidoMat.setVisible(true);
                        etiApellidoPat.setVisible(true);
                        etiDireccion.setVisible(true);
                        textIDDepartamento.setVisible(true);
                        etiIDDepartamento.setVisible(true);
                        etiTelefono.setVisible(true);
                        textTelefono.setVisible(true);
                        etiSexo.setVisible(true);
                        ComboBoxSexo.setVisible(true);
                        etiIDEmpleado.setVisible(true);
                        textIDPuesto.setVisible(true);
                        etiCooperativa.setVisible(true);
                        ComboBoxCooperativa.setVisible(true);
                        etiSueldo.setVisible(true);
                        textSueldo.setVisible(true);
                        etiIDPuesto.setVisible(true);
                        textApellidoPat.setVisible(true);
                        textDireccion.setVisible(true);
                        btnModificarEmpleado.setVisible(true);
                        Fecha.setVisible(true);
                        etiFecha.setVisible(true);

                    }
                    if (band2 == true) {
                        textIDEmpleado.setEnabled(false);
                        btnBuscarEmpleado.setEnabled(false);
                        etiCreando.setVisible(true);
                        etiNomEmpleado.setVisible(true);
                        textNomEmpleado.setVisible(true);
                        etiApellidoMat.setVisible(true);
                        textApellidoMat.setVisible(true);
                        etiApellidoPat.setVisible(true);
                        etiDireccion.setVisible(true);
                        textIDDepartamento.setVisible(true);
                        etiIDDepartamento.setVisible(true);
                        etiTelefono.setVisible(true);
                        textTelefono.setVisible(true);
                        etiSexo.setVisible(true);
                        ComboBoxSexo.setVisible(true);
                        etiIDEmpleado.setVisible(true);
                        textIDPuesto.setVisible(true);
                        etiCooperativa.setVisible(true);
                        ComboBoxCooperativa.setVisible(true);
                        etiSueldo.setVisible(true);
                        textSueldo.setVisible(true);
                        etiIDPuesto.setVisible(true);
                        textApellidoPat.setVisible(true);
                        textDireccion.setVisible(true);
                        btnCrearEmpleado.setVisible(true);
                        etiFecha.setVisible(true);
                        Fecha.setVisible(true);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBuscarEmpleadoMouseClicked


    private void btnCrearEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMouseClicked
        File file = new File("Empleados.txt");
        String cadena = "", cadena1 = "";
        boolean band = false, band2 = false, band3 = true, band4 = false, band5 = false, bandera = false, band_verificar = false;
        int opcion, opcion1;
        ArrayList<String> Array = new ArrayList<>();
        String NombreEmpleado = textNomEmpleado.getText();
        String PrimerApellido = textApellidoPat.getText();
        String SegundoApellido = textApellidoMat.getText();
        String Direccion = String.valueOf(textDireccion.getText());
        String Telefono = textTelefono.getText();
        String IDDepartamento = "";
        String IDPuesto = "";
        String dia = Integer.toString(Fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String Mes = Integer.toString(Fecha.getCalendar().get(Calendar.MONTH) + 1);
        String Año = Integer.toString(Fecha.getCalendar().get(Calendar.YEAR));
        String Fecha = (Año + "-" + Mes + "-" + dia);
        String idEmpleado = "1";
        int Index = ComboBoxSexo.getSelectedIndex();
        boolean bandera1 = false, bandera_loop = true;

        String sexo;
        if (Index == 0) {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }
        if (verificarExistencia()) {
            IDDepartamento += String.valueOf(textIDDepartamento.getText());
            band4 = true;
        } else {
            JOptionPane.showMessageDialog(null, "EL Archivo Departamentos no existe",
                    ("ERROR"), JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new MantenimientoEmpleados().setVisible(true);
        }
        if (verificarExistencia1()) {
            IDPuesto += String.valueOf(textIDPuesto.getText());
            band5 = true;
        } else {
            JOptionPane.showMessageDialog(null, "EL Archivo puestos no existe",
                    ("ERROR"), JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new MantenimientoEmpleados().setVisible(true);
        }
        /*String IDdepartamento1 = String.valueOf(textIDDepartamento);
        String IDpuesto1 = String.valueOf(textIDPuesto);
        if (IDDepartamento_verificar(IDdepartamento1) && IDPuesto_verificar(IDpuesto1)) {
            band_verificar = true;
        } else {
            JOptionPane.showMessageDialog(null, "Introdujo el id del Departamento incorrecto\n" + "Introdujo el id del Puesto incorrecto", "Error",
                     JOptionPane.INFORMATION_MESSAGE);
            band_verificar = false;
        }*/
        if (band4 == true && band5 == true) {
            int index = ComboBoxCooperativa.getSelectedIndex();
            String Cooperativa;
            boolean si = true;
            if (index == 0) {
                Cooperativa = "Si";
                si = true;
            } else {
                Cooperativa = "No";
            }

            String Sueldo = String.valueOf(textSueldo.getText());
            int validar = Integer.parseInt(Sueldo);
            if (validar < 1) {
                JOptionPane.showMessageDialog(null, "El sueldo debe ser mayor a 0",
                        ("Intente de nuevo"), JOptionPane.INFORMATION_MESSAGE);
                bandera = false;
            } else {
                bandera = true;
            }
            if (bandera == false) {
                this.dispose();
                new Mantenimiento().setVisible(true);
            } else {
                if (!file.exists()) {
                    try {
                        JOptionPane.showMessageDialog(null, "EL Archivo fue creado correctamente",
                                (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    if ("".equals(textNomEmpleado.getText()) || "".equals(textApellidoMat.getText()) || "".equals(textApellidoPat.getText())
                            || "".equals(textApellidoPat.getText()) || "".equals(textDireccion.getText()) || "".equals(textIDDepartamento.getText())
                            || "".equals(textIDPuesto.getText()) || "".equals(textSueldo.getText()) || "".equals(textTelefono.getText())) {
                        JOptionPane.showMessageDialog(null, "Campos vacios",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        band = true;
                    }
                    if (band == true) {
                        try {
                            FileReader leer = new FileReader(file);
                            BufferedReader almacenamiento = new BufferedReader(leer);
                            FileWriter escritura = new FileWriter(file);
                            PrintWriter escribir = new PrintWriter(escritura);
                            if ((cadena = (almacenamiento.readLine())) == null) {
                                escribir.print(idEmpleado + ",");
                                escribir.print(NombreEmpleado + ",");
                                escribir.print(PrimerApellido + ",");
                                escribir.print(SegundoApellido + ",");
                                escribir.print(Direccion + ",");
                                escribir.print(Telefono + ",");
                                escribir.print(sexo + ",");
                                escribir.print(IDDepartamento + ",");
                                escribir.print(IDPuesto + ",");
                                escribir.print(Cooperativa + ",");
                                switch (ComboBoxCooperativa.getSelectedIndex()) {
                                    case 0:
                                        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje",
                                                "Porcentaje", JOptionPane.QUESTION_MESSAGE));
                                        Cooperativa(idEmpleado, porcentaje, 0.0);
                                        break;
                                    case 1:
                                        porcentaje = 0.0;
                                        Cooperativa(idEmpleado, porcentaje, 0.0);
                                        break;
                                }
                                escribir.print(Fecha + ",");
                                escribir.print(Sueldo + ",");
                                JOptionPane.showMessageDialog(null, "1Empleado creado con exito", "Creando", JOptionPane.INFORMATION_MESSAGE);
                                bandera_loop = false;
                                this.dispose();
                                new Mantenimiento().setVisible(true);
                            }
                            escritura.close();
                            escribir.close();
                            almacenamiento.close();
                            leer.close();
                            if (bandera_loop == true) {
                                try {
                                    ArrayList Array1 = new ArrayList<>();
                                    FileReader leer1 = new FileReader(file);
                                    BufferedReader almacenamiento1 = new BufferedReader(leer1);
                                    while ((cadena = (almacenamiento.readLine())) != null) {
                                        if (cadena != null) {
                                            String[] arreglo = cadena.split(",");
                                            Array1.addAll(Arrays.asList(arreglo));
                                        }
                                    }
                                    almacenamiento1.close();
                                    leer1.close();
                                    for (int i = 0; i < Array.size(); i++) {
                                        long x = Array.size();
                                        x -= 1;
                                        if (i == x) {
                                            String IDempleado1 = String.valueOf(Array.get(i - 11));
                                            int Indice;
                                            Indice = Integer.parseInt(IDempleado1);
                                            Indice += 2;
                                            Array.add(String.valueOf(Indice));
                                            Array.add(NombreEmpleado);
                                            Array.add(PrimerApellido);
                                            Array.add(SegundoApellido);
                                            Array.add(Direccion);
                                            Array.add(Telefono);
                                            Array.add(IDDepartamento);
                                            Array.add(IDPuesto);
                                            Array.add(Cooperativa);
                                            switch (ComboBoxCooperativa.getSelectedIndex()) {
                                                case 0:
                                                    double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el porcentaje",
                                                            "Porcentaje", JOptionPane.QUESTION_MESSAGE));
                                                    Cooperativa(idEmpleado, porcentaje, 0.0);
                                                    break;
                                                case 1:
                                                    porcentaje = 0.0;
                                                    Cooperativa(idEmpleado, porcentaje, 0.0);
                                                    break;

                                            }
                                            Array.add(Fecha);
                                            Array.add(Sueldo);
                                            break;
                                        }

                                    }
                                    file.delete();
                                    try {
                                        file.createNewFile();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    FileWriter escritura1 = new FileWriter(file, true);
                                    PrintWriter escribir1 = new PrintWriter(escritura1);
                                    for (int i = 0; i < Array1.size(); i++) {
                                        escribir1.print(Array1.get(i) + ",");
                                        band3 = true;
                                    }
                                    escribir1.close();
                                    escritura1.close();
                                    if (band3 == true) {
                                        JOptionPane.showMessageDialog(null, "aaEmpleado creado con exito", "Creando", JOptionPane.INFORMATION_MESSAGE);
                                        this.dispose();
                                        new Menu().setVisible(true);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnCrearEmpleadoMouseClicked

    private void btnModificarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoMouseClicked
        String idEmpleado = (String.valueOf(textIDEmpleado));
        File file = new File("Empleados.txt");
        String cadena = "";
        boolean band = false, band3 = false, band2 = false, band4 = false, band5 = false, bandera = false;
        int opcion;
        ArrayList<String> Array = new ArrayList<>();
        String NombreEmpleado = textNomEmpleado.getText();
        String PrimerApellido = textApellidoPat.getText();
        String SegundoApellido = textApellidoMat.getText();
        String Direccion = String.valueOf(textDireccion.getText());
        String Telefono = textTelefono.getText();
        String IDDepartamento = "";
        String IDPuesto = "";
        int Index = ComboBoxSexo.getSelectedIndex();
        String sexo;
        String dia = Integer.toString(Fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String Mes = Integer.toString(Fecha.getCalendar().get(Calendar.MONTH) + 1);
        String Año = Integer.toString(Fecha.getCalendar().get(Calendar.YEAR));
        String Fecha = (Año + "-" + Mes + "-" + dia);
        boolean bandera1 = false;
        if (Index == 0) {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }
        if (verificarExistencia()) {
            IDDepartamento += String.valueOf(textIDDepartamento.getText());
            band4 = true;
        } else {
            JOptionPane.showMessageDialog(null, "EL Archivo Departamentos no existe",
                    ("ERROR"), JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new MantenimientoEmpleados().setVisible(true);
        }
        if (verificarExistencia1()) {
            IDPuesto += String.valueOf(textIDPuesto.getText());
            band5 = true;
        } else {
            JOptionPane.showMessageDialog(null, "EL Archivo puestos no existe",
                    ("ERROR"), JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new MantenimientoEmpleados().setVisible(true);
        }
        if (band4 == true && band5 == true) {
            int index = ComboBoxCooperativa.getSelectedIndex();
            String Cooperativa;
            if (index == 0) {
                Cooperativa = "Si";
                bandera1 = true;
            } else {
                Cooperativa = "No";
                bandera1 = false;
            }
            String Sueldo = String.valueOf(textSueldo.getText());
            int validar = Integer.parseInt(Sueldo);
            if (validar < 1) {
                JOptionPane.showMessageDialog(null, "El sueldo debe ser mayor a 0",
                        ("Intente de nuevo"), JOptionPane.INFORMATION_MESSAGE);
                bandera = false;
            } else {
                bandera = true;
            }
            if (bandera == false) {
                this.dispose();
                new Mantenimiento().setVisible(true);
            } else {
                if (!file.exists()) {
                    try {
                        JOptionPane.showMessageDialog(null, "EL Archivo fue creado correctamente",
                                (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        if ("".equals(textNomEmpleado.getText()) || "".equals(textApellidoMat.getText()) || "".equals(textApellidoPat.getText())
                                || "".equals(textApellidoPat.getText()) || "".equals(textDireccion.getText()) || "".equals(textIDDepartamento.getText())
                                || "".equals(textIDPuesto.getText()) || "".equals(textSueldo.getText()) || "".equals(textTelefono.getText())) {
                            JOptionPane.showMessageDialog(null, "Campos vacios",
                                    "ERROR", JOptionPane.ERROR_MESSAGE);
                        } else {
                            band = true;
                        }
                        if (band == true) {
                            FileReader leer = new FileReader(file);
                            BufferedReader almacenamiento = new BufferedReader(leer);
                            while ((cadena = (almacenamiento.readLine())) != null) {
                                if (cadena != null) {
                                    String[] arreglo = cadena.split(",");
                                    Array.addAll(Arrays.asList(arreglo));
                                }
                            }
                            almacenamiento.close();
                            leer.close();
                            for (int i = 0; i < Array.size(); i++) {
                                Array.set(i, String.valueOf(textIDEmpleado.getText()));
                                Array.set(i + 1, NombreEmpleado);
                                Array.set(i + 2, PrimerApellido);
                                Array.set(i + 3, SegundoApellido);
                                Array.set(i + 4, Direccion);
                                Array.set(i + 5, Telefono);
                                Array.set(i + 6, sexo);
                                Array.set(i + 7, IDDepartamento);
                                Array.set(i + 8, IDPuesto);
                                Array.set(i + 9, Cooperativa);
                                Array.set(i + 10, Fecha);
                                Array.set(i + 11, Sueldo);
                                break;
                            }
                            file.delete();
                            try {
                                file.createNewFile();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            try {
                                FileWriter escritura = new FileWriter(file);
                                PrintWriter escribir = new PrintWriter(escritura);
                                for (int i = 0; i < Array.size(); i++) {
                                    escribir.print(Array.get(i) + ",");
                                    band3 = true;
                                }
                                escritura.close();
                                escribir.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (band3 == true) {
                            JOptionPane.showMessageDialog(null, "Empleado modificado con exito", "Modificando", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            new Menu().setVisible(true);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnModificarEmpleadoMouseClicked
    void Cooperativa(String idEmpleado, double porcentaje, double acumulado) {
        File file = new File("Cooperativa.txt");
        String cadena = "";
        boolean band = false;
        int opcion;
        boolean band3 = false;
        ArrayList<String> Array = new ArrayList<>();
        if (!file.exists()) {
            try {
                JOptionPane.showMessageDialog(null, "EL Archivo fue creado correctamente",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileReader leer = new FileReader(file);
                BufferedReader almacenamiento = new BufferedReader(leer);
                FileWriter escritura = new FileWriter(file);
                PrintWriter escribir = new PrintWriter(escritura);
                if ((cadena = (almacenamiento.readLine())) == null) {
                    escribir.print(idEmpleado + ",");
                    escribir.print(porcentaje + ",");
                    escribir.print(acumulado + ",");
                    leer.close();
                    almacenamiento.close();
                    escritura.close();
                    escribir.close();
                } else {
                    FileReader leer1 = new FileReader(file);
                    BufferedReader almacenamiento1 = new BufferedReader(leer1);
                    while ((cadena = (almacenamiento1.readLine())) != null) {
                        if (cadena != null) {
                            String[] arreglo = cadena.split(",");
                            Array.addAll(Arrays.asList(arreglo));
                        }
                        band = true;
                    }
                    almacenamiento.close();
                    leer.close();
                    if (band == true) {
                        for (int i = 0; i < Array.size(); i++) {
                            long x = Array.size();
                            x -= 1;
                            if (i == x) {
                                int IDcooperativa = Integer.parseInt(Array.get(i - 2));
                                IDcooperativa += 1;
                                Array.add(String.valueOf(IDcooperativa));
                                Array.add(String.valueOf(porcentaje));
                                Array.add(String.valueOf(acumulado));
                                break;
                            }
                        }
                        file.delete();
                        file.createNewFile();
                        FileWriter escritura2 = new FileWriter(file);
                        PrintWriter escribir2 = new PrintWriter(escritura2);
                        for (int i = 0; i < Array.size(); i++) {
                            escribir2.print(Array.get(i) + ",");
                            band3 = true;
                        }
                        escritura2.close();
                        escribir2.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    boolean verificarExistencia() {
        File file = new File("Departamentos.txt");
        boolean band = true;
        if (!file.exists()) {

            band = false;
            return band;
        } else {
            band = true;
            return band;
        }
    }

    boolean verificarExistencia1() {
        File file = new File("Puestos.txt");
        boolean band = true;

        if (!file.exists()) {

            band = false;
            return band;
        } else {
            band = true;
            return band;
        }
    }

    boolean IDDepartamento_verificar(String IDdepartamento1
    ) {
        File file = new File("Departamentos.txt");
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        boolean band = true;
        ArrayList<String> Array1 = new ArrayList<>();

        try {
            leer = new FileReader(file);
            almacenamiento = new BufferedReader(leer);
            if ((cadena = (almacenamiento.readLine())) == null) {
                JOptionPane.showMessageDialog(null, "No existe ningun Departamento",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                leer.close();
                almacenamiento.close();
            } else {
                leer = new FileReader(file);
                almacenamiento = new BufferedReader(leer);
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    if (cadena != null) {
                        String[] arreglo1 = cadena.split(",");
                        Array1.addAll(Arrays.asList(arreglo1));
                    }
                    for (int i = 0; i < Array1.size(); i++) {
                        if (IDdepartamento1.equals(Array1.get(i))) {
                            band = true;
                        }
                    }
                }
                almacenamiento.close();
                leer.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }
        return band;
    }

    boolean verificarExistencia3() {
        File file = new File("Departamentos.txt");
        boolean band = true;
        if (!file.exists()) {

            band = false;
            return band;
        } else {
            band = true;
            return band;
        }
    }

    boolean verificarExistencia2() {
        File file = new File("Puestos.txt");
        boolean band = true;
        if (!file.exists()) {

            band = false;
            return band;
        } else {
            band = true;
            return band;
        }
    }

    boolean IDPuesto_verificar(String IDpuesto1
    ) {
        File file = new File("Puestos.txt");
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        boolean band = true;
        ArrayList<String> Array2 = new ArrayList<>();
        try {
            leer = new FileReader(file);
            almacenamiento = new BufferedReader(leer);
            if ((cadena = (almacenamiento.readLine())) == null) {
                JOptionPane.showMessageDialog(null, "No existe ningun Puesto",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
                leer.close();
                almacenamiento.close();
            } else {
                leer = new FileReader(file);
                almacenamiento = new BufferedReader(leer);
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    if (cadena != null) {
                        String[] arreglo1 = cadena.split(",");
                        Array2.addAll(Arrays.asList(arreglo1));
                    }
                    for (int i = 0; i < Array2.size(); i++) {
                        if (IDpuesto1.equals(Array2.get(i))) {
                            band = true;
                        }
                    }
                }
                almacenamiento.close();
                leer.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return band;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoEmpleados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantenimientoEmpleados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCooperativa;
    private javax.swing.JComboBox<String> ComboBoxSexo;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JLabel etiApellidoMat;
    private javax.swing.JLabel etiApellidoPat;
    private javax.swing.JLabel etiCooperativa;
    private javax.swing.JLabel etiCreando;
    private javax.swing.JLabel etiDireccion;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiIDDepartamento;
    private javax.swing.JLabel etiIDEmpleado;
    private javax.swing.JLabel etiIDPuesto;
    private javax.swing.JLabel etiMatenimientoDepartamento;
    private javax.swing.JLabel etiModificando;
    private javax.swing.JLabel etiNomEmpleado;
    private javax.swing.JLabel etiSexo;
    private javax.swing.JLabel etiSueldo;
    private javax.swing.JLabel etiTelefono;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel icoMinimizar;
    private javax.swing.JLabel icoX;
    private javax.swing.JPanel jPanelMantenimientoEmple;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textApellidoMat;
    private javax.swing.JTextField textApellidoPat;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textIDDepartamento;
    private javax.swing.JTextField textIDEmpleado;
    private javax.swing.JTextField textIDPuesto;
    private javax.swing.JTextField textNomEmpleado;
    private javax.swing.JTextField textSueldo;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
