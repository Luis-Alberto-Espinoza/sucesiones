/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesiones;

/**
 *
 * @author Espinoza
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    static String[][] datos = new String[3][3];

    static Servicio calculos = new Servicio();
    Entity entidad = new Entity();
    SucesionAritmetica arit = new SucesionAritmetica();

    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DETERMINAR = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        textField6 = new java.awt.TextField();
        SUMAR = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(545, 500));
        setPreferredSize(new java.awt.Dimension(545, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Trabajo Práctico Matemática Discreta - Sucesiones  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 301, 30);

        jLabel3.setText("a");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 20, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 80, 30, 28);

        jLabel4.setText(" =  ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 70, 16, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 60, 50, 28);

        jLabel5.setText(" a ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 70, 20, 16);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(220, 80, 28, 28);

        jLabel6.setText(" = ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 70, 19, 16);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(270, 60, 60, 28);

        jLabel7.setText(" a ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 70, 13, 16);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(400, 80, 27, 28);

        jLabel8.setText(" = ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 70, 13, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(450, 60, 60, 28);

        jLabel9.setText("Ingrese el valor de tres términos con su correspondiente subindice");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 40, 390, 16);

        DETERMINAR.setText("DETERMINAR");
        DETERMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DETERMINARActionPerformed(evt);
            }
        });
        getContentPane().add(DETERMINAR);
        DETERMINAR.setBounds(190, 120, 120, 28);

        textField1.setName("resultado"); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1);
        textField1.setBounds(100, 160, 320, 20);

        textField2.setName("resultado"); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        getContentPane().add(textField2);
        textField2.setBounds(10, 210, 520, 20);

        textField5.setName("resultado"); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        getContentPane().add(textField5);
        textField5.setBounds(10, 300, 520, 20);

        jLabel10.setText("Los 20 primeros términos son los siguientes");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 190, 270, 16);

        jLabel11.setText("El resultado de la sumatoria >>");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 430, 180, 16);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(430, 330, 50, 28);

        textField6.setName("resultado"); // NOI18N
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        getContentPane().add(textField6);
        textField6.setBounds(190, 430, 320, 20);

        SUMAR.setText("SUMAR");
        SUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMARActionPerformed(evt);
            }
        });
        getContentPane().add(SUMAR);
        SUMAR.setBounds(220, 360, 80, 28);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(190, 390, 320, 28);

        jLabel12.setText("Ingrese el subindice del término hasta donde desee sumar >>");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 340, 360, 16);

        textField3.setName("resultado"); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        getContentPane().add(textField3);
        textField3.setBounds(10, 240, 520, 20);

        textField4.setName("resultado"); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        getContentPane().add(textField4);
        textField4.setBounds(10, 270, 520, 20);

        jLabel13.setText("El término deseado es >>");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 400, 160, 16);

        jButton1.setText("Borrar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 460, 110, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void DETERMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DETERMINARActionPerformed
        boolean falta = true;
//se guardan el valor del termino y el subindice obtenidos en un array 

        datos[0][0] = ((jTextField1.getText()).trim());
        datos[0][1] = ((jTextField2.getText()).trim());
        datos[1][0] = ((jTextField3.getText()).trim());
        datos[1][1] = ((jTextField4.getText()).trim());
        datos[2][1] = ((jTextField6.getText()).trim());
        datos[2][0] = ((jTextField5.getText()).trim());

            //se los envia a la clase servicio 
            calculos.guardarDatos(datos);

            // ya procesados los datos se los muestran en el frame
            textField1.setText(calculos.terminoGeneral);
            textField2.setText((calculos.los20Primeros)[0]);
            textField3.setText((calculos.los20Primeros)[1]);
            textField4.setText((calculos.los20Primeros)[2]);
            textField5.setText((calculos.los20Primeros)[3]);

       
    }//GEN-LAST:event_DETERMINARActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void SUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMARActionPerformed

            //se envia el subindice obtenido del frame, al metodo de la clase calculos 
            calculos.guardarSegundosResultados((jTextField7.getText()).trim());

//se muestra en el frame el valor del termino correspondiente al ingreso del subindice que se usara para hacer la sumatoria
            jTextField8.setText(" a" + (jTextField7.getText().trim()) + " = " + calculos.terminoDeseado);

            // se muestra en el frame el resultado de la sumatoria  
            textField6.setText(" " + calculos.sumatoria);
    }//GEN-LAST:event_SUMARActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField5.setText("");
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        entidad.setSucesion("");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DETERMINAR;
    private javax.swing.JButton SUMAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
