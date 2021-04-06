package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class GenerarNomina extends javax.swing.JFrame {

    public GenerarNomina() {

        initComponents();
        ComboBoxMeses.setSelectedIndex(11);
        //Tabla.getMgetModel();
        setLocationRelativeTo(null);
        Dia.setValue(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMENU = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        etiMenu = new javax.swing.JLabel();
        etiIDNomina = new javax.swing.JLabel();
        etiFecha = new javax.swing.JLabel();
        etiX = new javax.swing.JLabel();
        etiMinimizar = new javax.swing.JLabel();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        btnAgregarNomina = new javax.swing.JButton();
        textIDEmpleado = new javax.swing.JTextField();
        Dia = new com.toedter.components.JSpinField();
        Ano = new com.toedter.calendar.JYearChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ComboBoxMeses = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMENU.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.setToolTipText("");
        PanelMENU.setPreferredSize(new java.awt.Dimension(710, 450));
        PanelMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMENU.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 370, 10));

        etiMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiMenu.setFont(new java.awt.Font("Gotham Thin", 0, 48)); // NOI18N
        etiMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMenu.setText("Generar Nómina");
        etiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelMENU.add(etiMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        etiIDNomina.setBackground(new java.awt.Color(255, 255, 255));
        etiIDNomina.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiIDNomina.setForeground(new java.awt.Color(255, 255, 255));
        etiIDNomina.setText("ID Empleado");
        PanelMENU.add(etiIDNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 160, 30));

        etiFecha.setBackground(new java.awt.Color(255, 255, 255));
        etiFecha.setFont(new java.awt.Font("Gotham Extra Light", 0, 24)); // NOI18N
        etiFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiFecha.setText("Fecha");
        PanelMENU.add(etiFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 80, 30));

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

        btnAgregarNomina.setBackground(new java.awt.Color(32, 45, 60));
        btnAgregarNomina.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarNomina.setText("Agregar Nómina");
        btnAgregarNomina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarNominaMouseClicked(evt);
            }
        });
        PanelMENU.add(btnAgregarNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 190, 50));

        textIDEmpleado.setBackground(new java.awt.Color(32, 45, 60));
        textIDEmpleado.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textIDEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        textIDEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelMENU.add(textIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 30));

        Dia.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 40, 30));

        Ano.setBackground(new java.awt.Color(32, 45, 60));
        PanelMENU.add(Ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, 30));

        Tabla.setBackground(new java.awt.Color(32, 45, 60));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        Tabla.setRowHeight(25);
        jScrollPane2.setViewportView(Tabla);

        PanelMENU.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1110, 120));

        ComboBoxMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        PanelMENU.add(ComboBoxMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 140, 30));

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
    private void btnAgregarNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarNominaMouseClicked
        String titulos[] = {"ID Nomina", "ID Empleado", "Fecha", "Salario Bruto", "Valor AFP", "Valor ARS", "Valor Coop", "Valor ISR", "Sueldo Neto", "Status no"};
        DefaultTableModel Tabla_Default = new DefaultTableModel();
        Tabla_Default.setColumnIdentifiers(titulos);
        Tabla.setModel(Tabla_Default);
        String[] vector = new String[10];
        String IDEmpleado_Nomina = textIDEmpleado.getText();
        double AFP = 0;
        double ISR = 0;
        double ARS = 0;
        Dia.setValue(30);
        Dia.setEnabled(false);
        String mes = (String) ComboBoxMeses.getSelectedItem();
        int ano = Ano.getValue();
        int dia = Dia.getValue();
        String Fecha = (dia + "/" + mes + "/" + ano);
        boolean band = false;
        File Empleados = new File("Empleados.txt");
        File Cooperativa = new File("Cooperativa.txt");
        File Nomina = new File("Nomina.txt");
        FileReader lector;
        BufferedReader almacenamiento;
        FileWriter escritura;
        String cadena = "";
        double sueldo_bruto = 0;
        ArrayList<String> Array = new ArrayList<>();
        boolean bandera_cooperativa = false, banderaIDEmpleado = false, band2 = false;
        String si = "Si";
        String no = "No";
        String coop = "";
        int opcion = 0;
        double valorCoop = 0, totalDed, sueldoNeto = 0, porcentaje;
        if (!Empleados.exists() || !Cooperativa.exists() || !Nomina.exists()) {
            JOptionPane.showMessageDialog(null, "La Base de datos esta fallando");
            try {
                Nomina.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            if (IDEmpleado_Nomina.isEmpty() || dia <= 0 || ano <= 0) {
                band = false;
                JOptionPane.showMessageDialog(null, "Campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                band = true;
            }
            if (band == true) {
                try {
                    lector = new FileReader(Empleados);
                    almacenamiento = new BufferedReader(lector);
                    while (cadena != null) {
                        cadena = (almacenamiento.readLine());
                        if (cadena != null) {
                            String[] arreglo1 = cadena.split(",");
                            Array.addAll(Arrays.asList(arreglo1));
                        }
                    }
                    almacenamiento.close();
                    lector.close();
                    for (int i = 0; i < Array.size(); i++) {
                        if (IDEmpleado_Nomina.equals(Array.get(i))) {
                            banderaIDEmpleado = true;
                            coop = Array.get(i + 9);
                            String sueldo_bruto1 = Array.get(i + 11);
                            sueldo_bruto = Double.parseDouble(sueldo_bruto1);
                            break;
                        } else {
                            banderaIDEmpleado = false;
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                if (banderaIDEmpleado == true) {
                    AFP = sueldo_bruto * 0.0287;
                      ISR = 0.00;
                    }
                    if (renta >= 34685.01 && renta <= 52027.42) {
                        excedente = renta - 34685.00;
                        ISR = excedente * 0.15;
                    }
                    if (renta >= 52027.43 && renta <= 72260.25) {
                        excedente = renta - 52027.43;
                        ISR = excedente + (excedente * (0.20));
                    }

                    if (renta >= 72260.26) {
                        excedente = renta - 72260.26;
                        ISR = (6643.00) + (excedente * (0.25));
                    }
                    try {ARS = sueldo_bruto * 0.0304;
                    double renta = sueldo_bruto - AFP - ARS;
                    double excedente;
                    if (renta <= 34685.00) {
                        ISR = 0.00;
                    }
                    if (renta >= 34685.01 && renta <= 52027.42) {
                        excedente = renta - 34685.00;
                        ISR = excedente * 0.15;
                    }
                    if (renta >= 52027.43 && renta <= 72260.25) {
                        excedente = renta - 52027.43;
                        ISR = excedente + (excedente * (0.20));
                    }

                    if (renta >= 72260.26) {
                        excedente = renta - 72260.26;
                        ISR = (6643.00) + (excedente * (0.25));
                    }
                    try {
                        FileReader lector1 = new FileReader(Cooperativa);
                        BufferedReader almacenamiento1 = new BufferedReader(lector1);
                        ArrayList<String> Array2 = new ArrayList<>();
                        while (cadena != null) {
                            cadena = (almacenamiento1.readLine());
                            if (cadena != null) {
                                String[] arreglo1 = cadena.split(",");
                                Array2.addAll(Arrays.asList(arreglo1));
                            }
                        }
                        almacenamiento1.close();
                        lector1.close();
                        for (int i = 0; i < Array2.size(); i++) {
                            if (IDEmpleado_Nomina.equals(Array2.get(i))) {
                                porcentaje = Double.parseDouble(Array.get(i + 1));
                                if (coop.equals(si)) {
                                    valorCoop = Double.parseDouble(Array2.get(i + 2));
                                } else {
                                    valorCoop = 0.0;
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    totalDed = (valorCoop + AFP + ARS + ISR);
                    sueldoNeto = (sueldo_bruto - totalDed);
                    vector[0] = ("1");
                    vector[1] = (IDEmpleado_Nomina);
                    vector[2] = (Fecha);
                    vector[3] = (String.valueOf(sueldo_bruto));
                    vector[4] = (String.valueOf(AFP));
                    vector[5] = (String.valueOf(ARS));
                    vector[6] = (String.valueOf(valorCoop));
                    vector[7] = (String.valueOf(ISR));
                    vector[8] = (String.valueOf(sueldoNeto));
                    vector[9] = "True";
                    Tabla_Default.addRow(vector);
                    /*try {
                        boolean band5=false;
                        File nomina = new File("Nomina.txt");
                        FileReader lector2 = new FileReader(nomina);
                        BufferedReader leer = new BufferedReader(lector2);
                        FileWriter escritor1 = new FileWriter(nomina);
                        PrintWriter escribir1 = new PrintWriter(escritor1);
                        while ((cadena = (leer.readLine())) == null) {
                            for(int i = 0 ; i<vector.length ; i++){
                                escribir1.print(vector[i]);
                                escribir1.print(",");
                                band5=true;
                            }
                        }
                        lector2.close();
                        leer.close();
                        escritor1.close();
                        escribir1.close();
                        if(band5==true){
                            JOptionPane.showMessageDialog(null,"Se ha generado la nomina correctamente","Nomina",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Error","Nomina",JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            new Menu().setVisible(true);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/
                } else {
                    opcion = JOptionPane.showConfirmDialog(
                            null,
                            "Intentelo de nuevo?\n" + "No existe este Empleado",
                            "¿Pregunta?",
                            JOptionPane.YES_NO_OPTION);

                    if (opcion == 0) {
                        band2 = true;
                    } else {
                        this.dispose();
                        new Menu().setVisible(true);
                    }
                }
                try {
                    ArrayList<String> Array_Nomina = new ArrayList<>();
                    FileReader lector_nomina = new FileReader(Nomina);
                    BufferedReader almacenamiento_nomina = new BufferedReader(lector_nomina);
                    String cadena_nomina = "";
                    FileWriter escritor_nomina = new FileWriter(Nomina, true);
                    PrintWriter escribir_nomina = new PrintWriter(escritor_nomina);
                    if ((cadena_nomina = (almacenamiento_nomina.readLine())) == null) {
                        escribir_nomina.print("1,");
                        escribir_nomina.print(IDEmpleado_Nomina + ",");
                        escribir_nomina.print(Fecha + ",");
                        escribir_nomina.print(sueldo_bruto + ",");
                        escribir_nomina.print(AFP + ",");
                        escribir_nomina.print(ARS + ",");
                        escribir_nomina.print(valorCoop + ",");
                        escribir_nomina.print(ISR + ",");
                        escribir_nomina.print(sueldoNeto + ",");
                        escribir_nomina.print("True" + ",");
                    }
                    almacenamiento_nomina.close();
                    lector_nomina.close();
                    escritor_nomina.close();
                    escribir_nomina.close();
                    lector_nomina = new FileReader(Nomina);
                    almacenamiento_nomina = new BufferedReader(lector_nomina);
                    while ((cadena_nomina = (almacenamiento_nomina.readLine())) != null) {
                        if (cadena_nomina != null) {
                            String[] arreglo1 = cadena_nomina.split(",");
                            Array_Nomina.addAll(Arrays.asList(arreglo1));
                        }
                    }
                    almacenamiento_nomina.close();
                    lector_nomina.close();
                    for (int i = 0; i < Array_Nomina.size(); i++) {
                        long x = Array_Nomina.size();
                        x -= 1;
                        if (i == x) {
                            int IDNomina1 = Integer.parseInt(Array.get(i - 9));
                            IDNomina1 += 1;
                            Array.add(String.valueOf(IDNomina1));
                            Array.add(IDEmpleado_Nomina);
                            Array.add(String.valueOf(Fecha));
                            Array.add(String.valueOf(sueldo_bruto));
                            Array.add(String.valueOf(AFP));
                            Array.add(String.valueOf(ARS));
                            Array.add(String.valueOf(valorCoop));
                            Array.add(String.valueOf(ISR));
                            Array.add(String.valueOf(sueldoNeto));
                            Array.add("True");
                            break;
                        }
                    }
                    boolean band3=false;
                    Nomina.delete();
                    Nomina.createNewFile();
                    FileWriter escritura3 = new FileWriter(Nomina,true);
                    PrintWriter escribir3 = new PrintWriter(escritura3);
                    for (int i = 0; i <Array_Nomina.size(); i++) {
                        escribir3.print(Array_Nomina.get(i) + ",");
                        band3 = true;
                    }
                    escritura3.close();
                    escribir3.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
    }//GEN-LAST:event_btnAgregarNominaMouseClicked
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new GenerarNomina().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser Ano;
    private javax.swing.JComboBox<String> ComboBoxMeses;
    private com.toedter.components.JSpinField Dia;
    private javax.swing.JPanel PanelMENU;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregarNomina;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiIDNomina;
    private javax.swing.JLabel etiMenu;
    private javax.swing.JLabel etiMinimizar;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel etiX;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textIDEmpleado;
    // End of variables declaration//GEN-END:variables
}
