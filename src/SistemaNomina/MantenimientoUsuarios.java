package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MantenimientoUsuarios extends javax.swing.JFrame {
    public MantenimientoUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
        etiContrasenaM.setVisible(false);
        etiCrearUsuario2.setVisible(false);
        etiNivelAccesoM.setVisible(false);
        etiRegistrarUsuario.setVisible(false);
        textUsuarioM2.setVisible(false);
        NivelAccesoM.setVisible(false);
        textContrasenaM.setVisible(false);
        btnAceptar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiMatenimiento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiVolverAlMenu = new javax.swing.JLabel();
        icoFlecha = new javax.swing.JLabel();
        icoMinimizar = new javax.swing.JLabel();
        icoX = new javax.swing.JLabel();
        etiCrearUsuario2 = new javax.swing.JLabel();
        textUsuarioM2 = new javax.swing.JTextField();
        etiContrasenaM = new javax.swing.JLabel();
        etiNivelAccesoM = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        NivelAccesoM = new javax.swing.JComboBox<>();
        textContrasenaM = new javax.swing.JPasswordField();
        etiID = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        ModUsuario = new javax.swing.JTextField();
        etiMatenimiento1 = new javax.swing.JLabel();
        etiCrearUsuario = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        etiRegistrarUsuario = new javax.swing.JLabel();
        etiContrasena = new javax.swing.JLabel();
        CrearUsuario = new javax.swing.JButton();
        etiNivelAcceso = new javax.swing.JLabel();
        NivelAcceso = new javax.swing.JComboBox<>();
        textContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 45, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiMatenimiento.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimiento.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiMatenimiento.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimiento.setText("Modificar un usuario");
        jPanel1.add(etiMatenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 470, 10));

        etiVolverAlMenu.setBackground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        etiVolverAlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiVolverAlMenu.setText("Volver al menu ");
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

        icoMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        icoMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(icoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        icoX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        icoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoXMouseClicked(evt);
            }
        });
        jPanel1.add(icoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        etiCrearUsuario2.setBackground(new java.awt.Color(255, 255, 255));
        etiCrearUsuario2.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiCrearUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        etiCrearUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCrearUsuario2.setText("Usuario");
        jPanel1.add(etiCrearUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 190, -1));

        textUsuarioM2.setBackground(new java.awt.Color(32, 45, 60));
        textUsuarioM2.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textUsuarioM2.setForeground(new java.awt.Color(255, 255, 255));
        textUsuarioM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(textUsuarioM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 190, 30));

        etiContrasenaM.setBackground(new java.awt.Color(255, 255, 255));
        etiContrasenaM.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiContrasenaM.setForeground(new java.awt.Color(255, 255, 255));
        etiContrasenaM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiContrasenaM.setText("Contraseña");
        jPanel1.add(etiContrasenaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, -1));

        etiNivelAccesoM.setBackground(new java.awt.Color(255, 255, 255));
        etiNivelAccesoM.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiNivelAccesoM.setForeground(new java.awt.Color(255, 255, 255));
        etiNivelAccesoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNivelAccesoM.setText("Nivel de acceso");
        jPanel1.add(etiNivelAccesoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 170, -1));

        Modificar.setBackground(new java.awt.Color(32, 45, 60));
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar Usuario");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 190, 50));

        NivelAccesoM.setBackground(new java.awt.Color(32, 45, 60));
        NivelAccesoM.setFont(new java.awt.Font("Gotham Extra Light", 1, 14)); // NOI18N
        NivelAccesoM.setForeground(new java.awt.Color(0, 0, 0));
        NivelAccesoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        NivelAccesoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelAccesoMActionPerformed(evt);
            }
        });
        jPanel1.add(NivelAccesoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 170, 30));

        textContrasenaM.setBackground(new java.awt.Color(32, 45, 60));
        textContrasenaM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textContrasenaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContrasenaMActionPerformed(evt);
            }
        });
        jPanel1.add(textContrasenaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 190, 30));

        etiID.setBackground(new java.awt.Color(255, 255, 255));
        etiID.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiID.setForeground(new java.awt.Color(255, 255, 255));
        etiID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiID.setText("Nombre del usuario");
        jPanel1.add(etiID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 190, -1));

        btnAceptar.setBackground(new java.awt.Color(32, 45, 60));
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 190, 50));

        ModUsuario.setBackground(new java.awt.Color(32, 45, 60));
        ModUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        ModUsuario.setForeground(new java.awt.Color(255, 255, 255));
        ModUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(ModUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, 30));

        etiMatenimiento1.setBackground(new java.awt.Color(255, 255, 255));
        etiMatenimiento1.setFont(new java.awt.Font("Gotham Thin", 0, 36)); // NOI18N
        etiMatenimiento1.setForeground(new java.awt.Color(255, 255, 255));
        etiMatenimiento1.setText("Mantenimiento de Usuarios");
        jPanel1.add(etiMatenimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        etiCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        etiCrearUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiCrearUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCrearUsuario.setText("Usuario");
        jPanel1.add(etiCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 190, -1));

        textUsuario.setBackground(new java.awt.Color(32, 45, 60));
        textUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 30));

        etiRegistrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        etiRegistrarUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        etiRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiRegistrarUsuario.setText("Registrar un usuario");
        jPanel1.add(etiRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        etiContrasena.setBackground(new java.awt.Color(255, 255, 255));
        etiContrasena.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiContrasena.setForeground(new java.awt.Color(255, 255, 255));
        etiContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiContrasena.setText("Contraseña");
        jPanel1.add(etiContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, -1));

        CrearUsuario.setBackground(new java.awt.Color(32, 45, 60));
        CrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        CrearUsuario.setText("Crear Usuario");
        CrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(CrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, 50));

        etiNivelAcceso.setBackground(new java.awt.Color(255, 255, 255));
        etiNivelAcceso.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        etiNivelAcceso.setForeground(new java.awt.Color(255, 255, 255));
        etiNivelAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNivelAcceso.setText("Nivel de acceso");
        jPanel1.add(etiNivelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 170, -1));

        NivelAcceso.setBackground(new java.awt.Color(32, 45, 60));
        NivelAcceso.setFont(new java.awt.Font("Gotham Extra Light", 1, 14)); // NOI18N
        NivelAcceso.setForeground(new java.awt.Color(255, 255, 255));
        NivelAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        NivelAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelAccesoActionPerformed(evt);
            }
        });
        jPanel1.add(NivelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 170, 30));

        textContrasena.setBackground(new java.awt.Color(32, 45, 60));
        textContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(textContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
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
        this.setState(MantenimientoUsuarios.ICONIFIED);
    }//GEN-LAST:event_icoMinimizarMouseClicked

    private void icoFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFlechaMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Mantenimiento().setVisible(true);
        
    }//GEN-LAST:event_icoFlechaMouseClicked

    private void NivelAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelAccesoActionPerformed

    private void textContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContrasenaActionPerformed
    
    private void CrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearUsuarioMouseClicked
        // TODO add your handling code here:
        File file = new File("usuarios.txt");
        String usuario = textUsuario.getText();
        String clave = textContrasena.getText();
        String cadena ="";
        String Nivel_Acceso="";
        String[] arreglo;
        FileReader leer;
        boolean band1 = false;
        boolean band3 = false;
        BufferedReader almacenamiento;
        FileWriter escribirArchivo;
        PrintWriter escribir;
        if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "EL Archivo no fue creado correctamente",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(("".equals(textUsuario.getText())) ||(textContrasena.getText().equals(""))){
                JOptionPane.showMessageDialog(null, "Campos vacios",
                        "ERROR",JOptionPane.ERROR_MESSAGE);
                band3=false;
            }else{
                band3=true;
            }
                    
            if(band3==true){
            try {
                if(textUsuario.getText()==null){
                    JOptionPane.showMessageDialog(null, "Campos vacios",
                         "ERROR",JOptionPane.ERROR_MESSAGE);
                }
                leer = new FileReader(file);
                almacenamiento = new BufferedReader(leer);
                while((cadena=(almacenamiento.readLine())) != null){
                    if(cadena!=null){
                    arreglo = cadena.split(",");
                    int i = arreglo.length;
                            for(int k=0 ; k<i ; k++){          
                                if(arreglo[k].equals(usuario)){
                                    band1 = true;
                                }
                            }
                    }
                }
                if(band1==true){
                    JOptionPane.showMessageDialog(null,
                                        "El usuario ya existe",
                                        "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                almacenamiento.close();
                leer.close();
                
                int index = NivelAcceso.getSelectedIndex();
                if(index==0){
                    Nivel_Acceso += "0";
                }else{
                    Nivel_Acceso += "1";
                }
                
                escribirArchivo = new FileWriter(file,true);
                //almacenarEscritura = new BufferedWriter(escribirArchivo);
                escribir = new PrintWriter(escribirArchivo);
                if(band1==false){
                
                escribir.print(","+usuario);
                escribir.print(","+clave);
                escribir.print(","+Nivel_Acceso);
                textUsuario.setEnabled(false);
                textContrasena.setEnabled(false);
                }
                escribirArchivo.close();
                escribir.close();
                
            
            }catch (IOException ex) {
                ex.printStackTrace();
            }
            }
    }//GEN-LAST:event_CrearUsuarioMouseClicked
    }   
    private void NivelAccesoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelAccesoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelAccesoMActionPerformed

    private void textContrasenaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContrasenaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContrasenaMActionPerformed

    
    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        File file = new File("Usuarios.txt");
        FileReader escribirArchivo;
        BufferedReader almacenamiento;
        String usuario = ModUsuario.getText();
        String usuario1 = textUsuarioM2.getText();
        String clave = textContrasenaM.getText();
        ArrayList<String> Array = new ArrayList<>();
        int k=0;
        boolean band3=false;
        textUsuario.setEnabled(false);
        textContrasena.setEnabled(false);
        NivelAcceso.setEnabled(false);
        CrearUsuario.setEnabled(false);
        if(("".equals(ModUsuario.getText()))){
                JOptionPane.showMessageDialog(null, "Campos vacios",
                        "ERROR",JOptionPane.ERROR_MESSAGE);
                band3=false;
            }else{
                band3=true;
            }
        if(band3==true){
        try{
            escribirArchivo = new FileReader(file);
            almacenamiento = new BufferedReader(escribirArchivo);
            String cadena="";
            boolean band4=false;
            while((cadena = (almacenamiento.readLine())) != null){
                String[] arreglo = cadena.split(",");
                for(k=0; k<arreglo.length ; k++){
                    if(usuario.equals(arreglo[k])){
                        etiContrasenaM.setVisible(true);
                        etiCrearUsuario2.setVisible(true);
                        etiNivelAccesoM.setVisible(true);
                        etiRegistrarUsuario.setVisible(true);
                        textUsuarioM2.setVisible(true);
                        NivelAccesoM.setVisible(true);
                        textContrasenaM.setVisible(true);
                        btnAceptar.setVisible(true);
                        textUsuario.setText("");
                        band4=true;
                    }
                }
                if(band4!=true){
                    JOptionPane.showMessageDialog(null, "Usuario inexistente",
                        "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            escribirArchivo.close();
            almacenamiento.close();
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error","IOException",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        File file = new File("Usuarios.txt");
        FileReader escribirArchivo;
        BufferedReader almacenamiento;
        String usuario1 = textUsuarioM2.getText();
        String clave = textContrasenaM.getText();
        ArrayList<String> Array = new ArrayList<>();
        String Nivel_Acceso="";
        int k=0;
        try{
            escribirArchivo = new FileReader(file);
            almacenamiento = new BufferedReader(escribirArchivo);
            String cadena="";
            while((cadena = (almacenamiento.readLine())) != null){
                String[] arreglo = cadena.split(",");
                Array.addAll(Arrays.asList(arreglo));
                }
            
            
            escribirArchivo.close();
            almacenamiento.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error","IOException",JOptionPane.ERROR_MESSAGE);
        }
        int index = NivelAccesoM.getSelectedIndex();
                if(index==0){
                    Nivel_Acceso += "0";
                }else{
                    Nivel_Acceso += "1";
                }
        boolean band=false;
        for(int i=0; i<Array.size() ; i++){
            if(ModUsuario.getText().equals(Array.get(i))){
                Array.set(i, usuario1);
                Array.set(i+1, clave);
                Array.set(i+2,Nivel_Acceso);
                band=true;
            }
        }
        if(band==true){
            JOptionPane.showMessageDialog(null, "El usuario ha sido modificado correctamente","Usuario",JOptionPane.INFORMATION_MESSAGE);
            file.delete();
        }
            try {
                    file.createNewFile();
                } catch (IOException e) {
                    JOptionPane.showConfirmDialog(null, "No existe el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
        for(int i=0; i<Array.size() ; i++){
            try {
                    FileWriter escritura = new FileWriter(file, true);
                    PrintWriter escribir = new PrintWriter(escritura);
                    escribir.print(","+Array.get(i));
                    escribir.close();
                    escritura.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnAceptarMouseClicked
    JOptionPane.showMessageDialog(null, "Archivo modificado","Archivo",JOptionPane.INFORMATION_MESSAGE);
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MantenimientoUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearUsuario;
    private javax.swing.JTextField ModUsuario;
    private javax.swing.JButton Modificar;
    private javax.swing.JComboBox<String> NivelAcceso;
    private javax.swing.JComboBox<String> NivelAccesoM;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etiContrasena;
    private javax.swing.JLabel etiContrasenaM;
    private javax.swing.JLabel etiCrearUsuario;
    private javax.swing.JLabel etiCrearUsuario2;
    private javax.swing.JLabel etiID;
    private javax.swing.JLabel etiMatenimiento;
    private javax.swing.JLabel etiMatenimiento1;
    private javax.swing.JLabel etiNivelAcceso;
    private javax.swing.JLabel etiNivelAccesoM;
    private javax.swing.JLabel etiRegistrarUsuario;
    private javax.swing.JLabel etiVolverAlMenu;
    private javax.swing.JLabel icoFlecha;
    private javax.swing.JLabel icoMinimizar;
    private javax.swing.JLabel icoX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField textContrasena;
    private javax.swing.JPasswordField textContrasenaM;
    private javax.swing.JTextField textUsuario;
    private javax.swing.JTextField textUsuarioM2;
    // End of variables declaration//GEN-END:variables
}
