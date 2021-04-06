package SistemaNomina;

import javax.swing.JOptionPane;

public class Mantenimiento extends javax.swing.JFrame {
    public Mantenimiento() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icoX = new javax.swing.JLabel();
        icoMinimizar = new javax.swing.JLabel();
        etiMatenimiento = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMantUSUARIO = new javax.swing.JLabel();
        icoUser = new javax.swing.JLabel();
        etiMantDEPARTAMENTO = new javax.swing.JLabel();
        icoDepartamento = new javax.swing.JLabel();
        etiMantUSUARIO1 = new javax.swing.JLabel();
        etiMantUSUARIO2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 45, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icoX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        icoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoXMouseClicked(evt);
            }
        });
        jPanel1.add(icoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        icoMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        icoMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(icoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        etiMatenimiento.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimiento.setFont(new java.awt.Font("Gotham Thin", 0, 48)); // NOI18N
        etiMatenimiento.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimiento.setText("Mantenimiento");
        jPanel1.add(etiMatenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu principal");
        jPanel1.add(etiVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        icoFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Back_Arrow_50px_1.png"))); // NOI18N
        icoFlecha.setToolTipText("");
        icoFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoFlechaMouseClicked(evt);
            }
        });
        jPanel1.add(icoFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 340, 10));

        etiMantUSUARIO.setBackground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiMantUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMantUSUARIO.setText("Mantenimiento de Empleados");
        jPanel1.add(etiMantUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        icoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_User_100px_1.png"))); // NOI18N
        icoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoUserMouseClicked(evt);
            }
        });
        jPanel1.add(icoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        etiMantDEPARTAMENTO.setBackground(new java.awt.Color(255, 255, 255));
        etiMantDEPARTAMENTO.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiMantDEPARTAMENTO.setForeground(new java.awt.Color(255, 255, 255));
        etiMantDEPARTAMENTO.setText("Mantenimiento de Departamento");
        jPanel1.add(etiMantDEPARTAMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        icoDepartamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Building_100px.png"))); // NOI18N
        icoDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoDepartamentoMouseClicked(evt);
            }
        });
        jPanel1.add(icoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        etiMantUSUARIO1.setBackground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiMantUSUARIO1.setForeground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMantUSUARIO1.setText("Mantenimiento de Usuarios");
        jPanel1.add(etiMantUSUARIO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        etiMantUSUARIO2.setBackground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO2.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiMantUSUARIO2.setForeground(new java.awt.Color(255, 255, 255));
        etiMantUSUARIO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMantUSUARIO2.setText("Mantenimiento de Puestos");
        jPanel1.add(etiMantUSUARIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_User_Groups_100px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_User_Groups_100px_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(Mantenimiento.ICONIFIED);
    }//GEN-LAST:event_icoMinimizarMouseClicked

    private void icoXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoXMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Menu", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_icoXMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked
        
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void icoUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoUserMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new MantenimientoUsuarios().setVisible(true);
    }//GEN-LAST:event_icoUserMouseClicked

    private void icoDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoDepartamentoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new MantenimientoDepartamentos().setVisible(true);
    }//GEN-LAST:event_icoDepartamentoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new MantenimientoPuestos().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new MantenimientoEmpleados().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiMantDEPARTAMENTO;
    private javax.swing.JLabel etiMantUSUARIO;
    private javax.swing.JLabel etiMantUSUARIO1;
    private javax.swing.JLabel etiMantUSUARIO2;
    private javax.swing.JLabel etiMatenimiento;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoDepartamento;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel icoMinimizar;
    private javax.swing.JLabel icoUser;
    private javax.swing.JLabel icoX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
