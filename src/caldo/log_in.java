/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tedted29
 */
public class log_in extends javax.swing.JFrame {

    /**
     * Creates new form log_in
     */
    public log_in() {
        initComponents();
    }
    SignUp_sign reg = new SignUp_sign();
    logIn logobj = new logIn();
     public void clear_reg_txtfld() {
        tfFN.setText(null);
        tfLN.setText(null);
        tfUN.setText(null);
        tfP.setText(null);
        cpPF.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUp = new javax.swing.JDialog();
        cpPF = new javax.swing.JPasswordField();
        btnRed = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfFN = new javax.swing.JTextField();
        tfLN = new javax.swing.JTextField();
        tfUN = new javax.swing.JTextField();
        tfP = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btnSign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        tfPass = new javax.swing.JPasswordField();
        btnLOG = new javax.swing.JButton();

        SignUp.setMaximumSize(new java.awt.Dimension(350, 300));
        SignUp.setMinimumSize(new java.awt.Dimension(350, 300));
        SignUp.setModal(true);
        SignUp.setPreferredSize(new java.awt.Dimension(350, 300));

        cpPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpPFKeyReleased(evt);
            }
        });

        btnRed.setText("Register");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        jLabel4.setText("First Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("User Name:");

        jLabel7.setText("Password:");

        jLabel8.setText("Confirm Password:");

        tfP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPKeyReleased(evt);
            }
        });

        jLabel9.setText("........");

        javax.swing.GroupLayout SignUpLayout = new javax.swing.GroupLayout(SignUp.getContentPane());
        SignUp.getContentPane().setLayout(SignUpLayout);
        SignUpLayout.setHorizontalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRed, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(tfP)
                        .addComponent(tfUN)
                        .addComponent(tfLN)
                        .addComponent(tfFN)
                        .addComponent(cpPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        SignUpLayout.setVerticalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cpPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnRed)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSign.setText("Sign up");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        jLabel1.setText("log in");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setText("user name:");

        jLabel3.setText("password:");

        btnLOG.setText("log in");
        btnLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tfPass))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(13, 13, 13)
                            .addComponent(tfUser))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLOG)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGActionPerformed
        // TODO add your handling code here:
         String un = tfUser.getText();
        String pw = new String(tfPass.getPassword());

        int x = logobj.login(un, pw);
        if (x == 1) {
            //System.out.println("Login Success");
            this.setVisible(false);
            JFrame main = new main(logobj.fname);
            main.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
       
    }//GEN-LAST:event_btnLOGActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        // TODO add your handling code here:
          String fn = tfFN.getText();
        String ln = tfLN.getText();
        String usn = tfUN.getText();
        String pass = new String(tfP.getPassword());
        String compas = new String(cpPF.getPassword());
//        
        int y = reg.confirmPassword(pass, compas);
        int z = reg.checkUsername(usn);

        if (!"".equals(fn) && !"".equals(ln) &&  !"".equals(usn) &&  !"".equals(pass) &&  !"".equals(compas)) {
            if (y == 1) {
                if (z == 0) {

                    int x = reg.register(fn, ln, usn, pass);
                    if (x == 1) {
                        JOptionPane.showMessageDialog(SignUp, "Successfully Registered!");
                        this.clear_reg_txtfld();
                        SignUp.setVisible(false);
                        SignUp.setAlwaysOnTop(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(SignUp, "Username Already Exist!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(SignUp, "Password Does Not Match!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(SignUp, "Please Fill out the fields!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRedActionPerformed

    private void tfPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tfPKeyReleased

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
        SignUp.setVisible(true);
    }//GEN-LAST:event_btnSignActionPerformed

    private void cpPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpPFKeyReleased
        // TODO add your handling code here:
         String pass = new String (tfP.getPassword());
        String compass = new String( cpPF.getPassword());
        String msg;

        int x = reg.confirmPassword(pass, compass);
        if (x == 1) {
            msg = "Password Matched!";
        } else {
            msg = "Password Does Not Match!";
        }
        jLabel9.setText(msg);
    }//GEN-LAST:event_cpPFKeyReleased

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
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SignUp;
    private javax.swing.JButton btnLOG;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnSign;
    private javax.swing.JPasswordField cpPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfFN;
    private javax.swing.JTextField tfLN;
    private javax.swing.JPasswordField tfP;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUN;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
