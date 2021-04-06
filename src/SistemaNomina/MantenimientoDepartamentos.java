package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MantenimientoDepartamentos extends javax.swing.JFrame {

    public MantenimientoDepartamentos() {
        initComponents();
        setLocationRelativeTo(null);
        DescripcionDepart.setVisible(false);
        etiNombreDepart.setVisible(false);
        textNombreDepart.setVisible(false);
        btnCrearDepartamento.setVisible(false);
        etiCreando.setVisible(false);
        jScrollPane2.setVisible(false);
        etiModificando.setVisible(false);
        btnModificando.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMantenimientoDept = new javax.swing.JPanel();
        icoX = new javax.swing.JLabel();
        icoMinimizar = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMatenimientoDepartamento = new javax.swing.JLabel();
        etiIDDepartamento = new javax.swing.JLabel();
        textIDDepartamento = new javax.swing.JTextField();
        BuscarDepartamento = new javax.swing.JButton();
        etiNombreDepart = new javax.swing.JLabel();
        textNombreDepart = new javax.swing.JTextField();
        btnModificando = new javax.swing.JButton();
        btnCrearDepartamento = new javax.swing.JButton();
        etiModificando = new javax.swing.JLabel();
        etiCreando = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescripcionDepart = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelMantenimientoDept.setBackground(new java.awt.Color(32, 45, 60));
        jPanelMantenimientoDept.setPreferredSize(new java.awt.Dimension(1110, 670));
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

        icoFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesMenu/icons8_Back_Arrow_50px_1.png"))); // NOI18N
        icoFlecha.setToolTipText("");
        icoFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoFlechaMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(icoFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanelMantenimientoDept.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 59, 590, 10));

        etiMatenimientoDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiMatenimientoDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimientoDepartamento.setText("Mantenimiento de Departamentos");
        jPanelMantenimientoDept.add(etiMatenimientoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 16, -1, -1));

        etiIDDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        etiIDDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiIDDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        etiIDDepartamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIDDepartamento.setText("ID del Departamento");
        jPanelMantenimientoDept.add(etiIDDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 240, -1));

        textIDDepartamento.setBackground(new java.awt.Color(32, 45, 60));
        textIDDepartamento.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        textIDDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoDept.add(textIDDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 155, 240, 30));

        BuscarDepartamento.setBackground(new java.awt.Color(32, 45, 60));
        BuscarDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        BuscarDepartamento.setText("Buscar Departamento");
        BuscarDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarDepartamentoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(BuscarDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 203, 240, 50));

        etiNombreDepart.setBackground(new java.awt.Color(255, 255, 255));
        etiNombreDepart.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiNombreDepart.setForeground(new java.awt.Color(255, 255, 255));
        etiNombreDepart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNombreDepart.setText("Nombre del Departamento");
        jPanelMantenimientoDept.add(etiNombreDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 297, -1, -1));

        textNombreDepart.setBackground(new java.awt.Color(32, 45, 60));
        textNombreDepart.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textNombreDepart.setForeground(new java.awt.Color(255, 255, 255));
        textNombreDepart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelMantenimientoDept.add(textNombreDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 334, 240, 30));

        btnModificando.setBackground(new java.awt.Color(32, 45, 60));
        btnModificando.setForeground(new java.awt.Color(0, 0, 0));
        btnModificando.setText("Modificar Departamento");
        btnModificando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificandoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(btnModificando, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 223, 50));

        btnCrearDepartamento.setBackground(new java.awt.Color(32, 45, 60));
        btnCrearDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearDepartamento.setText("Crear Departamento");
        btnCrearDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearDepartamentoMouseClicked(evt);
            }
        });
        jPanelMantenimientoDept.add(btnCrearDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 223, 50));

        etiModificando.setBackground(new java.awt.Color(255, 255, 255));
        etiModificando.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiModificando.setForeground(new java.awt.Color(255, 255, 255));
        etiModificando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiModificando.setText("Modificando...");
        jPanelMantenimientoDept.add(etiModificando, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 188, -1));

        etiCreando.setBackground(new java.awt.Color(255, 255, 255));
        etiCreando.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiCreando.setForeground(new java.awt.Color(255, 255, 255));
        etiCreando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCreando.setText("Creando...");
        jPanelMantenimientoDept.add(etiCreando, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 188, -1));

        jScrollPane2.setBackground(new java.awt.Color(32, 45, 60));

        DescripcionDepart.setBackground(new java.awt.Color(32, 45, 60));
        DescripcionDepart.setColumns(20);
        DescripcionDepart.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionDepart.setRows(5);
        DescripcionDepart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(DescripcionDepart);

        jPanelMantenimientoDept.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 630, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMantenimientoDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMantenimientoDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.setState(Mantenimiento.ICONIFIED);
    }//GEN-LAST:event_icoMinimizarMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked

        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void BuscarDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarDepartamentoMouseClicked
        // TODO add your handling code here:
        File file = new File("Departamentos.txt");
        String cadena = "", cadena1 = "";
        String[] arreglo;
        FileReader leer;
        BufferedReader almacenamiento;
        boolean band = false, band1 = false, band2 = false, band3 = false;
        int opcion = 0;
        ArrayList<String> ArrayDescripcion = new ArrayList<>();
        String NombreDepart = textNombreDepart.getText();
        String idDepartamento = textIDDepartamento.getText();
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
                int opc = 0;
                if ("".equals(textIDDepartamento.getText())) {
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
                                "¿Desea crear un departamento?\n" + "No existe ningun Departamento",
                                "¿Pregunta?",
                                JOptionPane.YES_NO_OPTION);
                        if (opcion == 0) {
                            band2 = true;
                        }
                    } else {
                        while (cadena1 != null) {
                            cadena1 = (almacenamiento.readLine());
                            String[] arreglo1 = cadena.split(",");
                            for (String cad : arreglo1) {
                                ArrayDescripcion.add(cad);
                            }
                            for (int i = 0; i < ArrayDescripcion.size(); i++) {
                                if (idDepartamento.equals(ArrayDescripcion.get(i))) {
                                    textNombreDepart.setText(ArrayDescripcion.get(i + 1));
                                    DescripcionDepart.setText(ArrayDescripcion.get(i + 2));
                                    band3 = true;
                                    break;
                                }
                                if (NombreDepart == null ? (ArrayDescripcion.get(i)) != null : !NombreDepart.equals(ArrayDescripcion.get(i))) {
                                    opcion = JOptionPane.showConfirmDialog(
                                            null,
                                            "¿Desea crear un departamento?\n" + "No existe ningun Departamento con este Nombre",
                                            "¿Pregunta?",
                                            JOptionPane.YES_NO_OPTION);
                                    if (opcion == 0) {
                                        band2 = true;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    almacenamiento.close();
                    leer.close();
                    if (band2 == true) {
                        if (opcion == 0) {
                            textIDDepartamento.setEnabled(false);
                            BuscarDepartamento.setEnabled(false);
                            textNombreDepart.setVisible(true);
                            etiNombreDepart.setVisible(true);
                            DescripcionDepart.setVisible(true);
                            btnCrearDepartamento.setVisible(true);
                            jScrollPane2.setVisible(true);
                            etiCreando.setVisible(true);
                        }
                    } else if (band3 == true) {
                        textIDDepartamento.setEnabled(false);
                        BuscarDepartamento.setEnabled(false);
                        textNombreDepart.setVisible(true);
                        etiNombreDepart.setVisible(true);
                        DescripcionDepart.setVisible(true);
                        jScrollPane2.setVisible(true);
                        etiModificando.setVisible(true);
                        btnModificando.setVisible(true);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_BuscarDepartamentoMouseClicked
    }
    private void btnCrearDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearDepartamentoMouseClicked
        File file = new File("Departamentos.txt");
        String cadena = "";
        boolean band = false, band1 = false, band2 = false, band5 = false;
        int opcion = 0;
        String nombreDepartamento = textNombreDepart.getText();
        String textoArea = DescripcionDepart.getText();
        FileWriter escritura;
        PrintWriter escribir;
        ArrayList<String> Array = new ArrayList<>();
        if ("".equals(textNombreDepart.getText()) || "".equals(DescripcionDepart.getText())) {
            JOptionPane.showMessageDialog(null, "Campos vacios",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            band5 = true;

        }
        try {
            if (band5 == true) {
                FileReader leer = new FileReader(file);
                BufferedReader almacenamiento = new BufferedReader(leer);
                while ((cadena = (almacenamiento.readLine())) == null) {
                    escritura = new FileWriter(file);
                    escribir = new PrintWriter(escritura);
                    escribir.print("1,");
                    escribir.print(nombreDepartamento + ",");
                    escribir.print(textoArea+ ",");
                    JOptionPane.showMessageDialog(null, "Departamento creado con exito", "Creando", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Mantenimiento().setVisible(true);
                    escritura.close();
                    escribir.close();
                    break;
                }
                leer.close();
                almacenamiento.close();
                FileReader leer1 = new FileReader(file);
                BufferedReader almacenamiento1 = new BufferedReader(leer1);
                String cadena2 = "";
                while ((cadena2 = (almacenamiento1.readLine())) != null) {
                    if (cadena2 != null) {
                        String[] arreglo1 = cadena2.split(",");
                        Array.addAll(Arrays.asList(arreglo1));
                    }
                    break;
                }
                almacenamiento1.close();
                leer1.close();
                for (int i = 0; i < Array.size(); i++) {
                    long x = Array.size();
                    x -= 1;
                    if (i == x) {
                        String IDDempartamento1 = String.valueOf(Array.get(i - 2));
                        int Indice;
                        Indice = Integer.parseInt(IDDempartamento1);
                        Indice += 1;
                        Array.add(String.valueOf(Indice));
                        Array.add(nombreDepartamento);
                        Array.add(textoArea);
                        break;
                    }
                }

                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                boolean band3 = false;
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
                if (band3 == true) {
                    JOptionPane.showMessageDialog(null, "Puesto modificado con exito", "Modificando", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Menu().setVisible(true);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnCrearDepartamentoMouseClicked

    private void btnModificandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificandoMouseClicked
        File file = new File("Departamentos.txt");
        String cadena = "", cadena1 = "";
        FileReader leer;
        BufferedReader almacenamiento;
        boolean band = false, band1 = true, band3 = false;
        int opcion = 0;
        String IDDepartamento = textIDDepartamento.getText();
        String nombreDepartamentoModificar = textNombreDepart.getText();
        String textoAreaModificar = DescripcionDepart.getText();
        ArrayList<String> ArrayDescripcion = new ArrayList<>();
        try {
            if ("".equals(textNombreDepart.getText()) || "".equals(DescripcionDepart.getText())) {
                JOptionPane.showMessageDialog(null, "Campos vacios",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                band = true;
            }
            leer = new FileReader(file);
            almacenamiento = new BufferedReader(leer);
            if (band == true) {
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    if (cadena != null) {
                        String[] arreglo1 = cadena.split(",");
                        ArrayDescripcion.addAll(Arrays.asList(arreglo1));
                    }
                }
                almacenamiento.close();
                leer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ArrayDescripcion.size(); i++) {
            if (IDDepartamento.equals(ArrayDescripcion.get(i))) {
                ArrayDescripcion.set(i + 1, nombreDepartamentoModificar);
                ArrayDescripcion.set(i + 2, textoAreaModificar);
            }
        }
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ArrayDescripcion.size(); i++) {
            try {
                FileWriter escritura = new FileWriter(file, true);
                PrintWriter escribir = new PrintWriter(escritura);
                escribir.print(ArrayDescripcion.get(i) + ",");
                escritura.close();
                escribir.close();
                band3 = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "Departamento modificado con exito", "Modificando", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new Menu().setVisible(true);
        }
    }//GEN-LAST:event_btnModificandoMouseClicked

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
            java.util.logging.Logger.getLogger(MantenimientoDepartamentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantenimientoDepartamentos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarDepartamento;
    private javax.swing.JTextArea DescripcionDepart;
    private javax.swing.JButton btnCrearDepartamento;
    private javax.swing.JButton btnModificando;
    private javax.swing.JLabel etiCreando;
    private javax.swing.JLabel etiIDDepartamento;
    private javax.swing.JLabel etiMatenimientoDepartamento;
    private javax.swing.JLabel etiModificando;
    private javax.swing.JLabel etiNombreDepart;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel icoMinimizar;
    private javax.swing.JLabel icoX;
    private javax.swing.JPanel jPanelMantenimientoDept;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textIDDepartamento;
    private javax.swing.JTextField textNombreDepart;
    // End of variables declaration//GEN-END:variables

    private String BuscarDepartamentoMouseClicked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
