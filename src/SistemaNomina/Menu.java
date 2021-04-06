package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMENU = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        icoMantenimiento = new javax.swing.JLabel();
        icoProceso = new javax.swing.JLabel();
        etiMenu = new javax.swing.JLabel();
        icoConsultas = new javax.swing.JLabel();
        etiConsultas = new javax.swing.JLabel();
        etiProcesos = new javax.swing.JLabel();
        etiMantenimiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        PanelMENU.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.setToolTipText("");
        PanelMENU.setPreferredSize(new java.awt.Dimension(710, 450));
        PanelMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMENU.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 129, 450, 10));
        PanelMENU.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 359, 230, 10));
        PanelMENU.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 359, 160, 10));
        PanelMENU.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 359, 160, 10));

        icoMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Maintenance_100px_1.png"))); // NOI18N
        icoMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMantenimientoMouseClicked(evt);
            }
        });
        PanelMENU.add(icoMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 369, 160, 140));

        icoProceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Process_100px_2.png"))); // NOI18N
        icoProceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoProcesoMouseClicked(evt);
            }
        });
        PanelMENU.add(icoProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 369, 160, 140));

        etiMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiMenu.setFont(new java.awt.Font("Gotham Thin", 0, 48)); // NOI18N
        etiMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMenu.setText("Sistema de Nomina");
        etiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelMENU.add(etiMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 79, -1, -1));

        icoConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Information_96px_1.png"))); // NOI18N
        icoConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoConsultasMouseClicked(evt);
            }
        });
        PanelMENU.add(icoConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 369, 160, 140));

        etiConsultas.setBackground(new java.awt.Color(255, 255, 255));
        etiConsultas.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiConsultas.setForeground(new java.awt.Color(255, 255, 255));
        etiConsultas.setText("CONSULTAS");
        PanelMENU.add(etiConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 329, 160, 30));

        etiProcesos.setBackground(new java.awt.Color(255, 255, 255));
        etiProcesos.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiProcesos.setForeground(new java.awt.Color(255, 255, 255));
        etiProcesos.setText("PROCESOS");
        PanelMENU.add(etiProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 329, 150, 30));

        etiMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        etiMantenimiento.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        etiMantenimiento.setText("MANTENIMIENTO");
        PanelMENU.add(etiMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 329, 220, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        PanelMENU.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 6, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        PanelMENU.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icoProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoProcesoMouseClicked
        this.dispose();
        new Procesos().setVisible(true);
    }//GEN-LAST:event_icoProcesoMouseClicked

    private void icoMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoMantenimientoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Mantenimiento().setVisible(true);
    }//GEN-LAST:event_icoMantenimientoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Menu", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void icoConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoConsultasMouseClicked
        this.dispose();
        new Consultas().setVisible(true);
    }//GEN-LAST:event_icoConsultasMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMENU;
    private javax.swing.JLabel etiConsultas;
    private javax.swing.JLabel etiMantenimiento;
    private javax.swing.JLabel etiMenu;
    private javax.swing.JLabel etiProcesos;
    private javax.swing.JLabel icoConsultas;
    private javax.swing.JLabel icoMantenimiento;
    private javax.swing.JLabel icoProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
