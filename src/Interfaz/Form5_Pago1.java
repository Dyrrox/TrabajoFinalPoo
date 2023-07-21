/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;
public class Form5_Pago1 extends javax.swing.JFrame {
    
    
    
    Form2_TipoAlumno t = new Form2_TipoAlumno();
    
    int tipo = t.tipoDeAlumno;
        
    public Form5_Pago1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNumTarjeta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaBoleta = new javax.swing.JTextArea();
        jbtnPagar = new javax.swing.JButton();
        jtxtFechaVenc = new javax.swing.JTextField();
        jtxtCvv = new javax.swing.JTextField();
        jbtnPagoEfectivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jbtnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel6.setText("NÚMERO DE TARJETA:");

        jLabel9.setText("FECHA DE VENCIMIENTO:");

        jLabel10.setText("CVV:");

        jtxtNumTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumTarjetaActionPerformed(evt);
            }
        });

        jtxaBoleta.setColumns(20);
        jtxaBoleta.setRows(5);
        jScrollPane1.setViewportView(jtxaBoleta);

        jbtnPagar.setText("PAGAR");
        jbtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPagarActionPerformed(evt);
            }
        });

        jtxtFechaVenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaVencActionPerformed(evt);
            }
        });

        jtxtCvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCvvActionPerformed(evt);
            }
        });

        jbtnPagoEfectivo.setText("PAGO EN EFECTIVO");
        jbtnPagoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPagoEfectivoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("OTROS METODOS DE PAGO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtFechaVenc, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(jtxtNumTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(jtxtCvv, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jbtnPagar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbtnPagoEfectivo))
                            .addComponent(jLabel2))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtFechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnPagoEfectivo)
                .addContainerGap(22, Short.MAX_VALUE))
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
        jLabel12.setText("PAGO");

        jLabel14.setFont(new java.awt.Font("Rage Italic", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("I.E.P. José De Arimatea");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jbtnAnterior)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jbtnAnterior)
                .addGap(20, 20, 20))
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

    private void jtxtNumTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumTarjetaActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
    if(tipo == 1){    
        Form3_AlumnoNuevo abrir = new Form3_AlumnoNuevo();
        abrir.setVisible(true);
        this.dispose();
    }else{
        Form4_AlumnoRegular abrir = new Form4_AlumnoRegular();
        abrir.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jbtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPagarActionPerformed
        String arreglo [] = {"Cancelar", "Imprimir Datos", "Proceder a Pagar"};
        
        if (tipo == 1) {
            Form3_AlumnoNuevo n = new Form3_AlumnoNuevo();

            String nombres = Form3_AlumnoNuevo.nombres;
            String apellidos = Form3_AlumnoNuevo.apellidos;
            long dniOCarnet = Form3_AlumnoNuevo.dniOCarnet;
            String grado = Form3_AlumnoNuevo.grado;
            String nivel = Form3_AlumnoNuevo.nivel;
            try {
                long Tarjeta = Long.parseLong(jtxtNumTarjeta.getText());
                String Fecha = jtxtFechaVenc.getText();
                int Cvv = Integer.parseInt(jtxtCvv.getText());
                if (Fecha.length() == 5) {
                    if (Fecha.substring(0, 2).matches("[0-9]*")) {
                        if (Fecha.substring(2, 3).matches("[/]*")) {
                            if (Fecha.substring(3, 5).matches("[0-9]*")) {
                                if (Cvv <= 999 && Cvv >= 100) {
                                    Class4_Pago p = new Class4_Pago(nombres, apellidos, dniOCarnet, grado, nivel, Tarjeta, Fecha, Cvv);
                                    int opccionN = JOptionPane.showOptionDialog(null, "¿Esta Seguro?", "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null);
                                    if (opccionN == 2) {
                                        Form1_Matricula abrir = new Form1_Matricula();
                                        abrir.setVisible(true);
                                        this.dispose();
                                    }
                                    if (opccionN == 1) {
                                        jtxaBoleta.setText(p.MostrarPagoN());
                                        
                                    }
                                } else {
                                    jtxaBoleta.setText("Ingrese 3 digitos en CVV");
                                }

                            } else {
                                jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                            }
                        } else {
                            jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                        }
                    } else {
                        jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                    }
                } else {
                    jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                }
            } catch (java.lang.NumberFormatException e) {
                jtxaBoleta.setText("No ingrese letras en Tarjeta o Cvv");
            }
        } else {
            Form4_AlumnoRegular r = new Form4_AlumnoRegular();

            String nombres = "";
            String apellidos = "";
            long dniOCarnet = Form4_AlumnoRegular.dniOCarnet;
            String grado = Form4_AlumnoRegular.grado;
            String nivel = Form4_AlumnoRegular.nivel;
            
            try {
                long Tarjeta = Long.parseLong(jtxtNumTarjeta.getText());
                String Fecha = jtxtFechaVenc.getText();
                int Cvv = Integer.parseInt(jtxtCvv.getText());
                if (Fecha.length() == 5) {
                    if (Fecha.substring(0, 2).matches("[0-9]*")) {
                        if (Fecha.substring(2, 3).matches("[/]*")) {
                            if (Fecha.substring(3, 5).matches("[0-9]*")) {
                                if (Cvv <= 999 && Cvv >= 100) {
                                    Class4_Pago p = new Class4_Pago(nombres, apellidos, dniOCarnet, grado, nivel, Tarjeta, Fecha, Cvv);
                                    int opccionR = JOptionPane.showOptionDialog(null, "El precio de la matricula a pagar es: ", "Elige...", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, null); 
                                    if (opccionR == 2) {
                                        Form1_Matricula abrir = new Form1_Matricula();
                                        abrir.setVisible(true);
                                        this.dispose();
                                    }
                                    if (opccionR == 1) {
                                        jtxaBoleta.setText(p.MostrarPagoR());
                                    }
                                } else {
                                    jtxaBoleta.setText("Ingrese 3 digitos en CVV");
                                }
                            } else {
                                jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                            }
                        } else {
                            jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                        }
                    } else {
                        jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                    }
                } else {
                    jtxaBoleta.setText("Utiliza el siguiente formato para la fecha(MM/AA)");
                }
            } catch (java.lang.NumberFormatException e) {
                jtxaBoleta.setText("No ingrese letras en Tarjeta o Cvv");
            }
        }
    }//GEN-LAST:event_jbtnPagarActionPerformed

    private void jtxtFechaVencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaVencActionPerformed

    }//GEN-LAST:event_jtxtFechaVencActionPerformed

    private void jtxtCvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCvvActionPerformed

    }//GEN-LAST:event_jtxtCvvActionPerformed

    private void jbtnPagoEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPagoEfectivoActionPerformed
    Form6_Pago2 abrir = new Form6_Pago2();
    abrir.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jbtnPagoEfectivoActionPerformed

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
            java.util.logging.Logger.getLogger(Form5_Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form5_Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form5_Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form5_Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form5_Pago1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnPagar;
    private javax.swing.JButton jbtnPagoEfectivo;
    private javax.swing.JTextArea jtxaBoleta;
    private javax.swing.JTextField jtxtCvv;
    private javax.swing.JTextField jtxtFechaVenc;
    private javax.swing.JTextField jtxtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
