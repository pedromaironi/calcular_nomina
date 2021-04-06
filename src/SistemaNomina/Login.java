package SistemaNomina;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiMinimizar = new javax.swing.JLabel();
        EtiUsuario = new javax.swing.JLabel();
        etiIniciarSesion = new javax.swing.JLabel();
        EtiContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        icoUsuario = new javax.swing.JLabel();
        icoContrasena = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        recuerdame = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();
        etiX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 45, 60));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Expand_Arrow_25px.png"))); // NOI18N
        etiMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(etiMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 20));

        EtiUsuario.setFont(new java.awt.Font("Gotham Extra Light", 0, 14)); // NOI18N
        EtiUsuario.setForeground(new java.awt.Color(255, 255, 255));
        EtiUsuario.setText("Usuario");
        jPanel1.add(EtiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, -1));

        etiIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        etiIniciarSesion.setFont(new java.awt.Font("Gotham Extra Light", 0, 36)); // NOI18N
        etiIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        etiIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiIniciarSesion.setText("Iniciar Sesión");
        jPanel1.add(etiIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 70));

        EtiContrasena.setFont(new java.awt.Font("Gotham Extra Light", 0, 14)); // NOI18N
        EtiContrasena.setForeground(new java.awt.Color(255, 255, 255));
        EtiContrasena.setText("Contraseña");
        jPanel1.add(EtiContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, -1));

        txtUsuario.setBackground(new java.awt.Color(32, 45, 60));
        txtUsuario.setFont(new java.awt.Font("Gotham Extra Light", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        txtPassword.setBackground(new java.awt.Color(32, 45, 60));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 30));

        icoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_User_25px_2.png"))); // NOI18N
        jPanel1.add(icoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 20, 34));

        icoContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_Lock_25px.png"))); // NOI18N
        jPanel1.add(icoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 20, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 10));

        recuerdame.setBackground(new java.awt.Color(32, 45, 60));
        recuerdame.setFont(new java.awt.Font("Gotham Extra Light", 0, 12)); // NOI18N
        recuerdame.setForeground(new java.awt.Color(255, 255, 255));
        recuerdame.setText("Recuerdame");
        recuerdame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuerdameActionPerformed(evt);
            }
        });
        jPanel1.add(recuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, 40));

        etiX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaNomina/imagesLogin/icons8_X_Coordinate_25px_1.png"))); // NOI18N
        etiX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiXMouseClicked(evt);
            }
        });
        jPanel1.add(etiX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recuerdameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuerdameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recuerdameActionPerformed

    private void etiXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiXMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_etiXMouseClicked

    private void etiMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_etiMinimizarMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        File file = new File("usuarios.txt");
        String usuario = txtUsuario.getText(), clave = txtPassword.getText(), cadena = "", cadena1 = "";
        String[] arreglo;
        FileReader leer;
        boolean band1 = false, band2 = false;
        BufferedReader almacenamiento;
        String administrador;
        String usuario_menu;
        if (!file.exists()) {
            try {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente",
                        (file.getName()), JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showConfirmDialog(null, "No existe el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                leer = new FileReader(file);
                almacenamiento = new BufferedReader(leer);
                if(usuario.length()==0 && clave.length()==0 ){
                    JOptionPane.showMessageDialog(null,"Introduce tu Usuario y tu Contraseña","Iniciar Sesion",JOptionPane.WARNING_MESSAGE);
                }else{
                    while((cadena=(almacenamiento.readLine())) != null || (band1==false && band2==false)){
                        arreglo = cadena.split(",");
                        int i = arreglo.length;
                        for(int k=0 ; k<i ; k++){
                            if(arreglo[k].equals(usuario)){
                                band1=true;
                            }
                            if(arreglo[k].equals(clave)){
                                band2=true;
                            }
                        }
                        if(band1==false && band2==false){
                            JOptionPane.showMessageDialog(null,
                                    "Usuario y Contraseña Incorrecta",
                                    "ERROR", JOptionPane.ERROR_MESSAGE);
                        }else if(band1==true && band2==false){
                            JOptionPane.showMessageDialog(null,
                                    "Contraseña Incorrecta", "Contraseña", JOptionPane.ERROR_MESSAGE);
                        }else if(band1==false && band2==true){
                            JOptionPane.showMessageDialog(null,
                                    "Usuario Incorrecto", "Usuario", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                almacenamiento.close();
                leer.close();
                boolean verificar=false;
                if(verificar(usuario)){
                    verificar=true;
                }else{
                    verificar=false;
                }
                if(band1==true && band2==true && verificar==true){
                    this.dispose();
                    new Menu().setVisible(true);
                }else if(band1==true && band2==true && verificar==false){
                    this.dispose();
                    new MenuUsuario().setVisible(true);
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion","Iniciar Sesion"+ex,JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIngresarMouseClicked
    
    boolean verificar(String usuario){
        File file = new File("Usuarios.txt");
        boolean band=true;
        String Admin_usuario = "";
        int Admin_usuario1;
        try {
            FileReader leer1 = new FileReader(file);
            BufferedReader almacenamiento1 = new BufferedReader(leer1);
            ArrayList<String> Array = new ArrayList<>();
            String cadena_usuario = "";
            while ((cadena_usuario = (almacenamiento1.readLine())) != null) {
                String arreglo1[] = cadena_usuario.split(",");
                Array.addAll(Arrays.asList(arreglo1));
            }
            leer1.close();
            almacenamiento1.close();
            for (int i = 0; i < Array.size(); i++) {
                if(usuario.equals(Array.get(i))){
                    Admin_usuario = Array.get(i+2);
                    break;
                }
            }
            Admin_usuario1 = Integer.parseInt(Admin_usuario);
            if(Admin_usuario1==0){
                band=true;
            }else{
                band=false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return band;
    }
   
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiContrasena;
    private javax.swing.JLabel EtiUsuario;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel etiIniciarSesion;
    private javax.swing.JLabel etiMinimizar;
    private javax.swing.JLabel etiX;
    private javax.swing.JLabel icoContrasena;
    private javax.swing.JLabel icoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox recuerdame;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
