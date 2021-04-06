
package SistemaNomina;

import javax.swing.JOptionPane;

public class Procesos extends javax.swing.JFrame {
    public Procesos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMENU = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMenu = new javax.swing.JLabel();
        etiReversarnomina = new javax.swing.JLabel();
        etiX = new javax.swing.JLabel();
        etiMinimizar = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        etiGenerarNomina = new javax.swing.JLabel();
        etiAgragarNomina = new javax.swing.JLabel();
        etiReversarNomina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMENU.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.setToolTipText("");
        PanelMENU.setPreferredSize(new java.awt.Dimension(710, 450));
        PanelMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMENU.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 210, 10));

        etiMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiMenu.setFont(new java.awt.Font("Gotham Thin", 0, 48)); // NOI18N
        etiMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMenu.setText("Procesos");
        etiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelMENU.add(etiMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        etiReversarnomina.setBackground(new java.awt.Color(255, 255, 255));
        etiReversarnomina.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiReversarnomina.setForeground(new java.awt.Color(255, 255, 255));
        etiReversarnomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Delete_Database_104px.png"))); // NOI18N
        PanelMENU.add(etiReversarnomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 100));

        etiX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        etiX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiXMouseClicked(evt);
            }
        });
        PanelMENU.add(etiX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 6, -1, -1));

        etiMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        etiMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiMinimizarMouseClicked(evt);
            }
        });
        PanelMENU.add(etiMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 6, -1, -1));

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu");
        PanelMENU.add(etiVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        icoFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Back_Arrow_50px_1.png"))); // NOI18N
        icoFlecha.setToolTipText("");
        icoFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoFlechaMouseClicked(evt);
            }
        });
        PanelMENU.add(icoFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        etiGenerarNomina.setBackground(new java.awt.Color(255, 255, 255));
        etiGenerarNomina.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiGenerarNomina.setForeground(new java.awt.Color(255, 255, 255));
        etiGenerarNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Add_New_100px.png"))); // NOI18N
        etiGenerarNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiGenerarNominaMouseClicked(evt);
            }
        });
        PanelMENU.add(etiGenerarNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 110));

        etiAgragarNomina.setBackground(new java.awt.Color(255, 255, 255));
        etiAgragarNomina.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiAgragarNomina.setForeground(new java.awt.Color(255, 255, 255));
        etiAgragarNomina.setText("Generar Nomina");
        PanelMENU.add(etiAgragarNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 200, 30));

        etiReversarNomina.setBackground(new java.awt.Color(255, 255, 255));
        etiReversarNomina.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiReversarNomina.setForeground(new java.awt.Color(255, 255, 255));
        etiReversarNomina.setText("Reversar Nomina");
        PanelMENU.add(etiReversarNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etiXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiXMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Menu", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_etiXMouseClicked

    private void etiMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_etiMinimizarMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked

        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void etiGenerarNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiGenerarNominaMouseClicked
        this.dispose();
        new GenerarNomina().setVisible(true);
    }//GEN-LAST:event_etiGenerarNominaMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Procesos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMENU;
    private javax.swing.JLabel etiAgragarNomina;
    private javax.swing.JLabel etiGenerarNomina;
    private javax.swing.JLabel etiMenu;
    private javax.swing.JLabel etiMinimizar;
    private javax.swing.JLabel etiReversarNomina;
    private javax.swing.JLabel etiReversarnomina;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel etiX;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
