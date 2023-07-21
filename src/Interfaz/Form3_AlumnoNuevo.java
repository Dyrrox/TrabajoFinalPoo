/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Form3_AlumnoNuevo extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar();

    public Form3_AlumnoNuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    static String nombres;
    static String apellidos;
    static long dniOCarnet;
    static long telefono;
    static String direccion;
    static String correo;
    static String nivel;
    static String grado;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaResumen = new javax.swing.JTextArea();
        jtxtNombres = new javax.swing.JTextField();
        jtxtDniOCarnet = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jcbxNivel = new javax.swing.JComboBox<>();
        jcbxGrado = new javax.swing.JComboBox<>();
        jcbxTipoDocumento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jbtnAnterior = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setText("CORREO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("DATOS PERSONALES");

        jLabel4.setText("NOMBRES:");

        jLabel5.setText("APELLIDOS:");

        jLabel7.setText("TELÉFONO:");

        jLabel8.setText("DIRECCIÓN:");

        jLabel9.setText("NIVEL:");

        jLabel10.setText("GRADO:");

        jtxaResumen.setColumns(20);
        jtxaResumen.setRows(5);
        jScrollPane1.setViewportView(jtxaResumen);

        jcbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMARIA", "SECUNDARIA" }));

        jcbxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));

        jcbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CARNET DE EXTRANJERIA" }));

        jLabel11.setText("TIPO DE DOCUMENTO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(194, 194, 194))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(129, 129, 129)
                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                    .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbxTipoDocumento, 0, 1, Short.MAX_VALUE))
                                    .addComponent(jtxtDniOCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(135, 135, 135)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jcbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDniOCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbxTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insignia.png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(0, 102, 204));

        jbtnAnterior.setText("ANTERIOR");
        jbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnteriorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ALUMNO NUEVO");

        jLabel13.setFont(new java.awt.Font("Rage Italic", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("I.E.P. José De Arimatea");

        jbtnCalcular.setText("CALCULAR MATRÍCULA");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbtnAnterior)
                        .addGap(145, 145, 145)
                        .addComponent(jbtnCalcular)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(50, 50, 50)))
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnterior)
                    .addComponent(jbtnCalcular))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
        Form2_TipoAlumno abrir = new Form2_TipoAlumno();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        String arreglo[] = {"Cancelar", "Imprimir Datos", "Proceder a Pagar"};

        try {
            nombres = jtxtNombres.getText();
            apellidos = jtxtApellidos.getText();
            correo = jtxtCorreo.getText();
            int error = 0;
            for (int i = 0; i < nombres.length(); i++) {
                if (Character.isLetter(nombres.charAt(i)) || nombres.charAt(i) == ' ') {
                } else {
                    error++;
                }
            }
            for (int i = 0; i < apellidos.length(); i++) {
                if (Character.isLetter(apellidos.charAt(i)) || apellidos.charAt(i) == ' ') {
                } else {
                    error++;
                }
            }
            
            if (error == 0) {
                dniOCarnet = Long.parseLong(jtxtDniOCarnet.getText());
                int tipoDeDocumento = jcbxTipoDocumento.getSelectedIndex();
                if (tipoDeDocumento == 0) {
                    if (dniOCarnet < 99999999 && dniOCarnet > 10000000) {
                        telefono = Long.parseLong(jtxtTelefono.getText());
                        if (telefono < 999999999 && telefono > 900000000) {
                            direccion = jtxtDireccion.getText();
                            correo =jtxtCorreo.getText();
                            nivel = jcbxNivel.getSelectedItem().toString();
                            grado = jcbxGrado.getSelectedItem().toString();
                            if (!("SECUNDARIA".equals(nivel) && "SEXTO".equals(grado))) {
                                Class4_Pago p = new Class4_Pago("", "", 0, grado, nivel, 0, "", 0);
                                int opccionN = JOptionPane.showOptionDialog(null, "El precio de la matricula es: " + p.pMatricula, "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null);
                                if (opccionN == 2) {
                                    Class1_AlumnoNuevo a = new Class1_AlumnoNuevo();
                                    Form5_Pago1 abrir = new Form5_Pago1();
                                    abrir.setVisible(true);
                                    this.dispose();
                                }
                                if (opccionN == 1) {
                                    Class1_AlumnoNuevo a = new Class1_AlumnoNuevo();
                                    jtxaResumen.setText(a.MostrarAlumnoNuevo());
                                    PreparedStatement pps = cn.prepareStatement("INSERT INTO Alumno(Nombres,Apellidos,Documento_Identidad,Telefono,Direccion,Correo,Nivel,Grado) VALUE (?,?,?,?,?,?,?,?)");
                                    pps.setString(1, jtxtNombres.getText());
                                    pps.setString(2, jtxtApellidos.getText());
                                    pps.setString(3, jtxtDniOCarnet.getText());
                                    pps.setString(4, jtxtTelefono.getText());
                                    pps.setString(5, jtxtDireccion.getText());
                                    pps.setString(6, jtxtCorreo.getText());
                                    pps.setString(7, (String) jcbxNivel.getSelectedItem());
                                    pps.setString(8, (String) jcbxGrado.getSelectedItem());
                                    pps.executeUpdate();

                                }

                            } else {
                                jtxaResumen.setText("No existe Sexto Grado de Secundaria");
                            }
                        } else {
                            jtxaResumen.setText("Ingrese un numero de telefono valido");
                        }
                    } else {
                        jtxaResumen.setText("Ingrese un DNI valido");
                    }
                } else {
                    if (dniOCarnet < 999999999 && dniOCarnet > 100000000) {
                        telefono = Long.parseLong(jtxtTelefono.getText());
                        if (telefono < 999999999 && telefono > 900000000) {
                            direccion = jtxtDireccion.getText();
                            nivel = jcbxNivel.getSelectedItem().toString();
                            grado = jcbxGrado.getSelectedItem().toString();
                            if (!("SECUNDARIA".equals(nivel) && "SEXTO".equals(grado))) {
                                Class4_Pago p = new Class4_Pago("", "", 0, grado, nivel, 0, "", 0);
                                int opccionN = JOptionPane.showOptionDialog(null, "El precio de la matricula es: " + p.pMatricula, "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null);
                                if (opccionN == 2) {
                                    Class1_AlumnoNuevo a = new Class1_AlumnoNuevo();
                                    Form5_Pago1 abrir = new Form5_Pago1();
                                    abrir.setVisible(true);
                                    this.dispose();
                                }
                                if (opccionN == 1) {
                                    Class1_AlumnoNuevo a = new Class1_AlumnoNuevo();
                                    jtxaResumen.setText(a.MostrarAlumnoNuevo());
                                    PreparedStatement pps = cn.prepareStatement("INSERT INTO Alumno(Nombres,Apellidos,Documento_Identidad,Telefono,Direccion,Correo,Nivel,Grado) VALUE (?,?,?,?,?,?,?,?)");
                                    pps.setString(1, jtxtNombres.getText());
                                    pps.setString(2, jtxtApellidos.getText());
                                    pps.setString(3, jtxtDniOCarnet.getText());
                                    pps.setString(4, jtxtTelefono.getText());
                                    pps.setString(5, jtxtDireccion.getText());
                                    pps.setString(6, jtxtCorreo.getText());
                                    pps.setString(7, (String) jcbxNivel.getSelectedItem());
                                    pps.setString(8, (String) jcbxGrado.getSelectedItem());
                                    pps.executeUpdate();

                                }

                            } else {
                                jtxaResumen.setText("No existe Sexto Grado de Secundaria");
                            }
                        } else {
                            jtxaResumen.setText("Ingrese un numero de telefono valido");
                        }
                    } else {
                        jtxaResumen.setText("Ingrese un CE valido");
                    }
                }
            } else {
                jtxaResumen.setText("No ingrese numeros en los datos incorrectos");
            }
        } catch (java.lang.NumberFormatException e) {
            jtxaResumen.setText("No ingrese letras en los datos incorrectos");
        } catch (SQLException ex) {
            Logger.getLogger(Form3_AlumnoNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Form3_AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form3_AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form3_AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form3_AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form3_AlumnoNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JComboBox<String> jcbxGrado;
    private javax.swing.JComboBox<String> jcbxNivel;
    private javax.swing.JComboBox<String> jcbxTipoDocumento;
    private javax.swing.JTextArea jtxaResumen;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtDniOCarnet;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
