/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Form4_AlumnoRegular extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar();

    public Form4_AlumnoRegular() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    static long dniOCarnet;
    static String nivel;
    static String grado;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtDniOCarnet = new javax.swing.JTextField();
        jcbxNivel = new javax.swing.JComboBox<>();
        jcbxGrado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaResumen = new javax.swing.JTextArea();
        jcbxTipoDocumento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jbtnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbtnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DATOS PERSONALES");

        jLabel9.setText("NIVEL:");

        jLabel10.setText("GRADO:");

        jtxtDniOCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDniOCarnetActionPerformed(evt);
            }
        });

        jcbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMARIA", "SECUNDARIA" }));
        jcbxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxNivelActionPerformed(evt);
            }
        });

        jcbxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jcbxGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxGradoActionPerformed(evt);
            }
        });

        jtxaResumen.setColumns(20);
        jtxaResumen.setRows(5);
        jScrollPane1.setViewportView(jtxaResumen);

        jcbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CARNET DE EXTRAJERIA" }));

        jLabel3.setText("TIPO DE DOCUMENTO:");

        jButton2.setText("MOSTRAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbxNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbxGrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(167, 167, 167))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbxTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtDniOCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbxTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDniOCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTextField2.setBackground(new java.awt.Color(0, 102, 204));

        jbtnAnterior.setText("ANTERIOR");
        jbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnteriorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insignia.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ALUMNO REGULAR");

        jLabel14.setFont(new java.awt.Font("Rage Italic", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("I.E.P. José De Arimatea");

        jbtnPagar.setText("PAGAR");
        jbtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPagarActionPerformed(evt);
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
                        .addGap(130, 130, 130)
                        .addComponent(jbtnAnterior)
                        .addGap(68, 68, 68)
                        .addComponent(jbtnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnterior)
                    .addComponent(jbtnPagar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDniOCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDniOCarnetActionPerformed

    }//GEN-LAST:event_jtxtDniOCarnetActionPerformed

    private void jcbxGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxGradoActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
        Form2_TipoAlumno abrir = new Form2_TipoAlumno();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jcbxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxNivelActionPerformed

    private void jbtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPagarActionPerformed
        String arreglo[] = {"Cancelar", "Proceder a Pagar"};
        try {
            dniOCarnet = Long.parseLong(jtxtDniOCarnet.getText());
            int tipoDeDocumento = jcbxTipoDocumento.getSelectedIndex();
            if (tipoDeDocumento == 0) {
                if (dniOCarnet < 99999999 && dniOCarnet > 10000000) {
                    nivel = jcbxNivel.getSelectedItem().toString();
                    grado = jcbxGrado.getSelectedItem().toString();
                    if (!("SECUNDARIA".equals(nivel) && "SEXTO".equals(grado))) {
                        Class4_Pago p = new Class4_Pago("", "", 0, grado, nivel, 0, "", 0);
                        int opccionN = JOptionPane.showOptionDialog(null, "El precio de la Matricula es: " + p.pMatricula, "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null);
                        if (opccionN == 1) {
                            Class2_AlumnoRegular a = new Class2_AlumnoRegular();
                            Form5_Pago1 abrir = new Form5_Pago1();
                            abrir.setVisible(true);
                            this.dispose();
                        }

                    } else {
                        jtxaResumen.setText("No existe Sexto Grado de Secundaria");
                    }
                } else {
                    jtxaResumen.setText("Ingrese un DNI valido");
                }
            } else {
                if (dniOCarnet < 999999999 && dniOCarnet > 100000000) {
                    nivel = jcbxNivel.getSelectedItem().toString();
                    grado = jcbxGrado.getSelectedItem().toString();
                    if (!("SECUNDARIA".equals(nivel) && "SEXTO".equals(grado))) {
                        Class4_Pago p = new Class4_Pago("", "", 0, grado, nivel, 0, "", 0);
                        int opccionN = JOptionPane.showOptionDialog(null, "El precio de la Matricula es: " + p.pMatricula, "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null);
                        if (opccionN == 1) {
                            Class2_AlumnoRegular a = new Class2_AlumnoRegular();
                            Form5_Pago1 abrir = new Form5_Pago1();
                            abrir.setVisible(true);
                            this.dispose();
                        }

                    } else {
                        jtxaResumen.setText("No existe Sexto Grado de Secundaria");
                    }
                } else {
                    jtxaResumen.setText("Ingrese un CE valido");
                }
            }
        } catch (java.lang.NumberFormatException e) {
            jtxaResumen.setText("No ingrese numeros o letras en las casillas incorrectas");
        }
    }//GEN-LAST:event_jbtnPagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String sql = "SELECT * FROM alumno WHERE Documento_Identidad =" + jtxtDniOCarnet.getText() + "";
        
        try {
            PreparedStatement pps =cn.prepareStatement("UPDATE Alumno SET Nivel ='"+jcbxNivel.getSelectedItem()+"',Grado='"+jcbxGrado.getSelectedItem()+"' WHERE Documento_Identidad ="+jtxtDniOCarnet.getText());
            pps.executeUpdate();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nom = rs.getString(1);
                String ape = rs.getString(2);
                String dni = rs.getString(3);
                String tel = rs.getString(4);
                String dir = rs.getString(5);
                String cor = rs.getString(6);
                String niv = rs.getString(7);
                String gra = rs.getString(8);

                jtxaResumen.append("Nombre: " + nom
                        + "\nApellido: " + ape
                        + "\nDNI: " + dni
                        + "\nTelefóno: " + tel
                        + "\nDirección: " + dir
                        + "\nCorreo: " + cor
                        + "\nNivel: " + niv 
                        + "\nGrado: "+gra);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form4_AlumnoRegular.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form4_AlumnoRegular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form4_AlumnoRegular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form4_AlumnoRegular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form4_AlumnoRegular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Form4_AlumnoRegular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnPagar;
    private javax.swing.JComboBox<String> jcbxGrado;
    private javax.swing.JComboBox<String> jcbxNivel;
    private javax.swing.JComboBox<String> jcbxTipoDocumento;
    private javax.swing.JTextArea jtxaResumen;
    private javax.swing.JTextField jtxtDniOCarnet;
    // End of variables declaration//GEN-END:variables
}
