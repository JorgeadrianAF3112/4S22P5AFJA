/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4s22p5afja;

import Operaciones.suma;
import Operaciones.resta;
import Operaciones.division;
import Operaciones.multiplicacion;
import javax.swing.ButtonGroup;

/**
 *
 * @author Adrian Flores
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        ButtonGroup gruporb = new ButtonGroup();
        gruporb.add(rbSuma);
        gruporb.add(rbResta);
        gruporb.add(rbDivision);
        gruporb.add(rbMultiplicacion);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbSuma = new javax.swing.JRadioButton();
        rbResta = new javax.swing.JRadioButton();
        rbMultiplicacion = new javax.swing.JRadioButton();
        rbDivision = new javax.swing.JRadioButton();
        btnCalcula = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Operaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel2.setText("Numero 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        jLabel3.setText("Numero 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));
        getContentPane().add(txtnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 49, 180, -1));
        getContentPane().add(txtnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 93, 180, -1));

        btnsuma.setText("sumar");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));

        jLabel4.setText("Resultado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtresult.setEditable(false);
        getContentPane().add(txtresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 147, 180, -1));

        jLabel5.setText("Opciones");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 11, -1, -1));

        rbSuma.setText("Suma");
        getContentPane().add(rbSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        rbResta.setText("Resta");
        getContentPane().add(rbResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        rbMultiplicacion.setText("Multiplicacion");
        getContentPane().add(rbMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        rbDivision.setText("Division");
        getContentPane().add(rbDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        btnCalcula.setText("Calcular");
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        btnmultiplicar.setText("multiplicar");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        btnrestar.setText("restar");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btndividir.setText("dividir");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });
        getContentPane().add(btndividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        suma sumar = new suma();
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        txtresult.setText(String.valueOf(sumar.suma(n1, n2)));
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed
        // TODO add your handling code here:
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        
        if(rbSuma.isSelected() == true){
            suma sumar = new suma();
            txtresult.setText(String.valueOf(sumar.suma(n1, n2)));
        }
        if(rbResta.isSelected() == true){
            resta restar = new resta();
            txtresult.setText(String.valueOf(restar.resta(n1, n2)));
        }
        if(rbMultiplicacion.isSelected() == true){
            multiplicacion multiplicar = new multiplicacion();
            txtresult.setText(String.valueOf(multiplicar.multiplicacion(n1, n2)));
        }
        if(rbDivision.isSelected() == true){
            division dividir = new division();
            txtresult.setText(String.valueOf(dividir.division(n1, n2)));
        }
    }//GEN-LAST:event_btnCalculaActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        // TODO add your handling code here:
        resta restar = new resta();
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        txtresult.setText(String.valueOf(restar.resta(n1, n2)));
    }//GEN-LAST:event_btnrestarActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
        division dividir = new division();
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        txtresult.setText(String.valueOf(dividir.division(n1, n2)));
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        // TODO add your handling code here:
        multiplicacion multiplicar = new multiplicacion();
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        txtresult.setText(String.valueOf(multiplicar.multiplicacion(n1, n2)));
    }//GEN-LAST:event_btnmultiplicarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbDivision;
    private javax.swing.JRadioButton rbMultiplicacion;
    private javax.swing.JRadioButton rbResta;
    private javax.swing.JRadioButton rbSuma;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables
}
