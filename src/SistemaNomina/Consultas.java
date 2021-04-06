package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Consultas extends javax.swing.JFrame {

    public Consultas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMENU = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMantenimiento1 = new javax.swing.JLabel();
        etiMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        Consultas = new javax.swing.JComboBox<>();
        Consulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMENU.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.setToolTipText("");
        PanelMENU.setPreferredSize(new java.awt.Dimension(710, 450));
        PanelMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMENU.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 129, 230, 10));

        etiMantenimiento1.setBackground(new java.awt.Color(255, 255, 255));
        etiMantenimiento1.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiMantenimiento1.setForeground(new java.awt.Color(255, 255, 255));
        etiMantenimiento1.setText("Menu");
        etiMantenimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelMENU.add(etiMantenimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 210, 30));

        etiMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiMenu.setFont(new java.awt.Font("Gotham Thin", 0, 48)); // NOI18N
        etiMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMenu.setText("Consultas");
        etiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelMENU.add(etiMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        PanelMENU.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        PanelMENU.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 6, -1, -1));

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

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu");
        PanelMENU.add(etiVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        Consultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta por Departamentos", "Consulta por Puestos", "Consulta por Empleados", "Consulta de Empleados por Departamento" }));
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });
        PanelMENU.add(Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 230, -1));

        Consulta.setBackground(new java.awt.Color(32, 45, 60));
        Consulta.setForeground(new java.awt.Color(0, 0, 0));
        Consulta.setText("Generar consulta");
        Consulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaMouseClicked(evt);
            }
        });
        PanelMENU.add(Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMENU, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Menu", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked

        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultasActionPerformed

    private void ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaMouseClicked
        int opcion = 0;
        int consulta = Consultas.getSelectedIndex();
        switch (consulta) {
            case 0:
                ConsultaPorDepartamentos();
                break;
            case 1:
                ConsultaPorPuestos();
                break;
            case 2:
                ConsultaPorEmpleados();
                break;
            case 3:
                ConsultaDeEmpleadosPorDepartamento();
                break;
            /*case 4:
                ConsultaDeEmpleadosPorPuestos();
                break;
            case 5:
                ConsultaDeEmpleadosPorFechaDeIngreso();
                break;
            case 6:
                ConsultaDeNominaPorFecha();
                break;
            case 7:
                ConsultaDeNominaPorIdEmpleado();
                break;*/
        }
    }//GEN-LAST:event_ConsultaMouseClicked

    public void ConsultaPorDepartamentos() {
        File file = new File("Departamentos.txt");
        String cadena = "";
        FileReader leer;

        PrintWriter escribir;
        boolean band = false;
        ArrayList<String> Array = new ArrayList<>();
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "El Departamento no existe\n" + "Consulte con el Departamento de Computos",
                    (file.getName()), JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                FileReader Lectura = new FileReader(file);
                BufferedReader almacenamiento = new BufferedReader(Lectura);
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    JOptionPane.showMessageDialog(null, cadena, "Consulta por Departamento", JOptionPane.INFORMATION_MESSAGE);
                    almacenamiento.close();
                    Lectura.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ConsultaPorPuestos() {

        File file = new File("Puestos.txt");
        String cadena = "";
        FileReader leer;

        PrintWriter escribir;
        boolean band = false;
        ArrayList<String> Array = new ArrayList<>();
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "EL no existe\n" + "Consulte con el Departamento de Computos",
                    (file.getName()), JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                FileReader Lectura = new FileReader(file);
                BufferedReader almacenamiento = new BufferedReader(Lectura);
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    JOptionPane.showMessageDialog(null, cadena, "Consulta por Departamento", JOptionPane.INFORMATION_MESSAGE);
                }
                almacenamiento.close();
                Lectura.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ConsultaPorEmpleados() {

        File file = new File("Empleados.txt");
        String cadena = "";
        FileReader leer;

        PrintWriter escribir;
        boolean band = false;
        ArrayList<String> Array = new ArrayList<>();
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "Consulte con el Departamento de Computos",
                    (file.getName()), JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                FileReader Lectura = new FileReader(file);
                BufferedReader almacenamiento = new BufferedReader(Lectura);
                while (cadena != null) {
                    cadena = (almacenamiento.readLine());
                    JOptionPane.showMessageDialog(null, cadena, "Consulta por Empleados", JOptionPane.INFORMATION_MESSAGE);
                }
                almacenamiento.close();
                Lectura.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ConsultaDeEmpleadosPorDepartamento() {
        File Empleados = new File("Empleados.txt");
        File Departamentos = new File("Departamentos.txt");
        String cadena = "";
        String idDepartamento = "";
        PrintWriter escribir;
        boolean band = false;
        ArrayList<String> Array = new ArrayList<>();

        if (!Empleados.exists() && !Departamentos.exists()) {
            JOptionPane.showMessageDialog(null, "Consulte con el Departamento de Computos",
                    "Empleados y Departamentos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int Departamento;
            Departamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el id del Departamento",
                    "Departamento", JOptionPane.INFORMATION_MESSAGE));
            idDepartamento = String.valueOf(Departamento);
            if (IDDepartamento_verificar(idDepartamento)) {
                try {
                    FileReader Lectura = new FileReader(Departamentos);
                    BufferedReader almacenamiento = new BufferedReader(Lectura);
                    while ((cadena = (almacenamiento.readLine())) != null) {
                        if (cadena != null) {
                            String[] arreglo = cadena.split(",");
                            Array.addAll(Arrays.asList(arreglo));
                        }
                    }
                    Lectura.close();
                    almacenamiento.close();
                    for (int i = 0; i < Array.size(); i++) {
                        if (idDepartamento.equals(Array.get(i))) {
                            System.out.println("Existe");
                            band = true;
                            break;
                        } else {
                            band = false;
                            break;
                        }
                    }
                    ArrayList<String> Array1 = new ArrayList<>();
                    FileReader Lectura1 = new FileReader(Empleados);
                    BufferedReader almacenamiento1 = new BufferedReader(Lectura1);
                    if (band == true) {
                        while ((cadena = (almacenamiento1.readLine())) != null) {
                            if (cadena != null) {
                                String[] arreglo1 = cadena.split(",");
                                Array1.addAll(Arrays.asList(arreglo1));
                            }

                            System.out.println(Array1.size());
                            String vector[] = null;
                            for (int i = 0; i < Array1.size(); i++) {
                                long x = Array1.size();

                                if (idDepartamento.equals(Array1.get(i))) {
                                    System.out.println(i);
                                    vector[i] = Array.get(i);
                                    break;
                                }
                            }
                        }
                    }
                    Lectura1.close();
                    almacenamiento1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Consulte con el Departamento de Computos",
                        "Empleados y Departamentos", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Menu().setVisible(true);
            }
        }
    }

    boolean IDDepartamento_verificar(String IDdepartamento1) {
        File file = new File("Departamentos.txt");
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        boolean band = true;
        ArrayList<String> Array1 = new ArrayList<>();
        try {
            leer = new FileReader(file);
            almacenamiento = new BufferedReader(leer);
            while ((cadena = (almacenamiento.readLine())) != null) {
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
        } catch (IOException ex) {
            ex.printStackTrace();

        }
        return band;
    }

    void DeEmpleadosPorPuestos(String idPuesto) {
        File Empleados = new File("Empleados.txt");
        File Departamentos = new File("Departamentos.txt");
        String cadena = "";
        String idDepartamento = "";
        PrintWriter escribir;
        boolean band = false;
        ArrayList<String> Array = new ArrayList<>();

        if (!Empleados.exists() && !Departamentos.exists()) {
            JOptionPane.showMessageDialog(null, "Consulte con el Departamento de Computos",
                    "Empleados y Departamentos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int Departamento;
            Departamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el id del Departamento",
                    "Departamento", JOptionPane.INFORMATION_MESSAGE));
            idDepartamento = String.valueOf(Departamento);
            if (IDDepartamento_verificar(idDepartamento)) {
                try {
                    FileReader Lectura = new FileReader(Departamentos);
                    BufferedReader almacenamiento = new BufferedReader(Lectura);
                    while ((cadena = (almacenamiento.readLine())) != null) {
                        if (cadena != null) {
                            String[] arreglo = cadena.split(",");
                            Array.addAll(Arrays.asList(arreglo));
                        }
                    }
                    Lectura.close();
                    almacenamiento.close();
                    for (int i = 0; i < Array.size(); i++) {
                        if (idDepartamento.equals(Array.get(i))) {
                            System.out.println("Existe");
                            band = true;
                        } else {
                            band = false;
                        }
                    }
                    ArrayList<String> Array1 = new ArrayList<>();
                    if (band == true) {
                        FileReader Lectura1 = new FileReader(Empleados);
                        BufferedReader almacenamiento1 = new BufferedReader(Lectura1);
                        while ((cadena = (almacenamiento1.readLine())) != null) {
                            if (cadena != null) {
                                String[] arreglo1 = cadena.split(",");
                                Array1.addAll(Arrays.asList(arreglo1));
                            }
                        }
                        Lectura1.close();
                        almacenamiento1.close();
                        System.out.println(Array1.size());
                        ArrayList<String> Array2 = new ArrayList<>();
                        for (int i = 0; i < Array1.size(); i++) {
                            if (idDepartamento.equals(Array1.get(i))) {
                                Array2.add(i = 0, Array1.get(i - 5));
                                Array2.add(i = 1, Array1.get(i - 4));
                                Array2.add(i = 2, Array1.get(i - 3));
                                Array2.add(i = 3, Array1.get(i - 2));
                                Array2.add(i = 4, Array1.get(i - 1));
                                Array2.add(i = 5, Array1.get(i));
                                Array2.add(i = 6, Array1.get(i + 1));
                                Array2.add(i = 7, Array1.get(i + 2));
                                Array2.add(i = 8, Array1.get(i + 4));
                                Array2.add(i = 9, "True");
                            }
                        }
                        System.out.println(Array2);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Consulte con el Departamento de Computos",
                        "Empleados y Departamentos", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Menu().setVisible(true);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Consultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consulta;
    private javax.swing.JComboBox<String> Consultas;
    private javax.swing.JPanel PanelMENU;
    private javax.swing.JLabel etiMantenimiento1;
    private javax.swing.JLabel etiMenu;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
