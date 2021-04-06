package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MantenimientoPuestos extends javax.swing.JFrame {

    public MantenimientoPuestos() {
        initComponents();
        setLocationRelativeTo(null);
        etiNombrePuesto.setVisible(false);
        textNombrePuesto.setVisible(false);
        btnCrearPuesto.setVisible(false);
        etiModificando.setVisible(false);
        etiCreando.setVisible(false);
        btnModificarPuesto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMantenimientoDept = new javax.swing.JPanel();
        icoX = new javax.swing.JLabel();
        icoMinimizar = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        textNombrePuesto = new javax.swing.JTextField();
        textIDPuesto = new javax.swing.JTextField();
        icoFlecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMatenimientoDepartamento = new javax.swing.JLabel();
        etiNombrePuesto = new javax.swing.JLabel();
        btnModificarPuesto = new javax.swing.JButton();
        btnCrearPuesto = new javax.swing.JButton();
        btnBuscarNomPuesto = new javax.swing.JButton();
        etiCreando = new javax.swing.JLabel();
        etiModificando = new javax.swing.JLabel();
        etiIDPuesto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelMantenimientoDept.setBackground(new java.awt.Color(32, 45, 60));
        jPanelMantenimientoDept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icoX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        icoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoXMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(icoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        icoMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        icoMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMinimizarMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(icoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu");
        jPanelMantenimientoDept.add(etiVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        textNombrePuesto.setBackground(new java.awt.Color(32, 45, 60));
        textNombrePuesto.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textNombrePuesto.setForeground(new java.awt.Color(255, 255, 255));
        textNombrePuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoDept.add(textNombrePuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 190, 30));

        textIDPuesto.setBackground(new java.awt.Color(32, 45, 60));
        textIDPuesto.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDPuesto.setForeground(new java.awt.Color(255, 255, 255));
        textIDPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoDept.add(textIDPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 190, 30));

        icoFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Back_Arrow_50px_1.png"))); // NOI18N
        icoFlecha.setToolTipText("");
        icoFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoFlechaMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(icoFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));
        jPanelMantenimientoDept.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 460, 10));

        etiMatenimientoDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiMatenimientoDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setText("Mantenimiento de Puestos");
        jPanelMantenimientoDept.add(etiMatenimientoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        etiNombrePuesto.setBackground(new java.awt.Color(255, 255, 255));
        etiNombrePuesto.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiNombrePuesto.setForeground(new java.awt.Color(255, 255, 255));
        etiNombrePuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNombrePuesto.setText("Nombre del puesto");
        jPanelMantenimientoDept.add(etiNombrePuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 190, 20));

        btnModificarPuesto.setBackground(new java.awt.Color(32, 45, 60));
        btnModificarPuesto.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarPuesto.setText("Modificar puesto");
        btnModificarPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarPuestoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(btnModificarPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 190, 50));

        btnCrearPuesto.setBackground(new java.awt.Color(32, 45, 60));
        btnCrearPuesto.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearPuesto.setText("Crear puesto");
        btnCrearPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPuestoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(btnCrearPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 190, 50));

        btnBuscarNomPuesto.setBackground(new java.awt.Color(32, 45, 60));
        btnBuscarNomPuesto.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarNomPuesto.setText("Buscar puesto");
        btnBuscarNomPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarNomPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarNomPuestoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(btnBuscarNomPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 190, 50));

        etiCreando.setBackground(new java.awt.Color(255, 255, 255));
        etiCreando.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiCreando.setForeground(new java.awt.Color(255, 255, 255));
        etiCreando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCreando.setText("Creando");
        jPanelMantenimientoDept.add(etiCreando, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 280, 210));

        etiModificando.setBackground(new java.awt.Color(255, 255, 255));
        etiModificando.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiModificando.setForeground(new java.awt.Color(255, 255, 255));
        etiModificando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiModificando.setText("Modificando");
        jPanelMantenimientoDept.add(etiModificando, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 300, 200));

        etiIDPuesto.setBackground(new java.awt.Color(255, 255, 255));
        etiIDPuesto.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiIDPuesto.setForeground(new java.awt.Color(255, 255, 255));
        etiIDPuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIDPuesto.setText("ID del puesto");
        jPanelMantenimientoDept.add(etiIDPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMantenimientoDept, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMantenimientoDept, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
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
        this.setState(MantenimientoPuestos.ICONIFIED);
    }//GEN-LAST:event_icoMinimizarMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked

        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void btnBuscarNomPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNomPuestoMouseClicked
        // TODO add your handling code here:
        File file = new File("Puestos.txt");
        String IDpuesto = String.valueOf(textIDPuesto.getText());
        String cadena = "", cadena1 = "";
        FileReader leer;
        BufferedReader almacenamiento;
        FileWriter escribirArchivo;
        PrintWriter escribir;
        boolean band = false, band2 = false, band3 = false;
        int opcion, opcion1;
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
                if ("".equals(textIDPuesto.getText())) {
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
                                "¿Desea crear un Puesto?\n" + "No existe ningun puesto con este ID",
                                "¿Pregunta?",
                                JOptionPane.YES_NO_OPTION);
                        leer.close();
                        almacenamiento.close();
                        if (opcion == 0) {
                            band2 = true;
                        } else {
                            this.dispose();
                            new Menu().setVisible(true);
                        }

                    } else {
                        while (cadena1 != null) {
                            cadena1 = (almacenamiento.readLine());
                            String[] arreglo = cadena.split(",");
                            Array.addAll(Arrays.asList(arreglo));
                            for (int i = 0; i < Array.size(); i++) {
                                if (IDpuesto.equals(Array.get(i))) {
                                    etiNombrePuesto.setVisible(true);
                                    textNombrePuesto.setVisible(true);
                                    textIDPuesto.setEnabled(false);
                                    btnBuscarNomPuesto.setEnabled(false);
                                    etiModificando.setVisible(true);
                                    textNombrePuesto.setText(Array.get(i + 1));
                                    btnModificarPuesto.setVisible(true);
                                    break;
                                }
                                if (IDpuesto == null ? (Array.get(i)) != null : !IDpuesto.equals(Array.get(i))) {
                                    opcion1 = JOptionPane.showConfirmDialog(
                                            null,
                                            "¿Desea crear un Puesto?\n" + "No existe ningun puesto con este ID",
                                            "¿Pregunta?",
                                            JOptionPane.YES_NO_OPTION);
                                    if (opcion1 == 0) {
                                        band3 = true;
                                    } else {
                                        this.dispose();
                                        new Menu().setVisible(true);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    almacenamiento.close();
                    leer.close();
                    if (band2 == true) {
                        etiNombrePuesto.setVisible(true);
                        textNombrePuesto.setVisible(true);
                        btnCrearPuesto.setVisible(true);
                        textIDPuesto.setEnabled(false);
                        btnBuscarNomPuesto.setEnabled(false);
                        etiCreando.setVisible(true);
                    }
                    if (band3 == true) {
                        etiNombrePuesto.setVisible(true);
                        textNombrePuesto.setVisible(true);
                        btnCrearPuesto.setVisible(true);
                        textIDPuesto.setEnabled(false);
                        btnBuscarNomPuesto.setEnabled(false);
                        etiCreando.setVisible(true);
                    }
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }

    }//GEN-LAST:event_btnBuscarNomPuestoMouseClicked
    }
    private void btnCrearPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPuestoMouseClicked
        File file = new File("Puestos.txt");
        String IDpuesto = String.valueOf(textIDPuesto.getText());
        String cadena = "";
        FileReader leer;
        BufferedReader almacenamiento;
        boolean band = false, band3 = false, band2 = false;
        int opcion;
        ArrayList<String> Array = new ArrayList<>();
        String NombrePuesto = textNombrePuesto.getText();
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
                if ("".equals(textNombrePuesto.getText())) {
                    JOptionPane.showMessageDialog(null, "Campos vacios",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    band = true;
                }
                leer = new FileReader(file);
                almacenamiento = new BufferedReader(leer);
                if (band == true) {
                    FileWriter escribirArchivo;
                    PrintWriter escribir;
                    if ((cadena = (almacenamiento.readLine())) == null) {
                        escribirArchivo = new FileWriter(file);
                        escribir = new PrintWriter(escribirArchivo);
                        escribir.print("1" + ",");
                        etiNombrePuesto.setVisible(true);
                        textNombrePuesto.setVisible(true);
                        escribir.print(NombrePuesto + ",");
                        escribirArchivo.close();
                        escribir.close();
                        JOptionPane.showMessageDialog(
                                null,
                                "Puesto creado correctamente",
                                "Creando",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        new Menu().setVisible(true);
                    }
                    almacenamiento.close();
                    leer.close();
                    leer = new FileReader(file);
                    almacenamiento = new BufferedReader(leer);
                    while (cadena != null) {
                        cadena = (almacenamiento.readLine());
                        if (cadena != null) {
                            String[] arreglo1 = cadena.split(",");
                            for (String cad : arreglo1) {
                                Array.add(cad);
                            }
                        }
                    }
                    almacenamiento.close();
                    leer.close();
                    for (int i = 0; i < Array.size(); i++) {
                        long x = Array.size();
                        x -= 1;
                        if (i == x) {
                            int IDpuesto1 = Integer.parseInt(Array.get(i - 1));
                            IDpuesto1 = IDpuesto1 + 1;
                            Array.add(String.valueOf(IDpuesto1));
                            Array.add(NombrePuesto);
                            //System.out.println("Elementos:"+Array);
                            break;
                        }
                    }
                    file.delete();
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        FileWriter escritura1 = new FileWriter(file);
                        PrintWriter escribir1 = new PrintWriter(escritura1);
                        for (int i = 0; i < Array.size(); i++) {
                            escribir1.print(Array.get(i) + ",");
                            band3 = true;
                        }
                        escritura1.close();
                        escribir1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (band3 == true) {
                    JOptionPane.showMessageDialog(null, "Puesto modificado con exito", "Modificando", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Menu().setVisible(true);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCrearPuestoMouseClicked

    private void btnModificarPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPuestoMouseClicked
        File file = new File("Puestos.txt");
        String IDpuesto = String.valueOf(textIDPuesto.getText());
        String cadena = "";
        FileReader leer;
        BufferedReader almacenamiento;
        boolean band = false, band3 = false, band2 = false;
        int opcion;
        ArrayList<String> Array = new ArrayList<>();
        String NombrePuesto = textNombrePuesto.getText();

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
                if ("".equals(textNombrePuesto.getText())) {
                    JOptionPane.showMessageDialog(null, "Campos vacios",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    band = true;
                }
                if (band == true) {
                    leer = new FileReader(file);
                    almacenamiento = new BufferedReader(leer);
                    while (cadena != null) {
                        cadena = (almacenamiento.readLine());
                        if (cadena != null) {
                            String[] arreglo1 = cadena.split(",");
                            for (String cad : arreglo1) {
                                Array.add(cad);
                            }
                        }
                    }
                    almacenamiento.close();
                    leer.close();
                    for (int i = 0; i < Array.size(); i++) {
                        //System.out.println("2.ArraySize:"+i);

                        if (IDpuesto.equals(Array.get(i))) {
                            Array.set(i, IDpuesto);
                            Array.set(i + 1, NombrePuesto);
                            System.out.println("Elementos:" + Array);
                        }
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
                    JOptionPane.showMessageDialog(null, "Puesto modificado con exito", "Modificando", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Menu().setVisible(true);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnModificarPuestoMouseClicked

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
            java.util.logging.Logger.getLogger(MantenimientoPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantenimientoPuestos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarNomPuesto;
    private javax.swing.JButton btnCrearPuesto;
    private javax.swing.JButton btnModificarPuesto;
    private javax.swing.JLabel etiCreando;
    private javax.swing.JLabel etiIDPuesto;
    private javax.swing.JLabel etiMatenimientoDepartamento;
    private javax.swing.JLabel etiModificando;
    private javax.swing.JLabel etiNombrePuesto;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel icoMinimizar;
    private javax.swing.JLabel icoX;
    private javax.swing.JPanel jPanelMantenimientoDept;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textIDPuesto;
    private javax.swing.JTextField textNombrePuesto;
    // End of variables declaration//GEN-END:variables
}
