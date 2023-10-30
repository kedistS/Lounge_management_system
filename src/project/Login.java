/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import user_classes.DbOperation;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }
    ResultSet rs = null, rs2 = null, rs3 = null;
    @SuppressWarnings("unchecked")
    public void clear(){
        userNameTxt.setText("");
        passwardTxt.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwardTxt = new javax.swing.JPasswordField();
        exitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        forgetPasswardBtn = new javax.swing.JButton();
        managerLoginBtn = new javax.swing.JButton();
        optionCmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel4.setText("Passward");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 283, 107, 38));

        userNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 237, 341, 34));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("User type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, 38));

        passwardTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwardTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwardTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwardTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 327, 341, 36));

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 51, 102));
        exitBtn.setText("Exit");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 51, 102));
        clearBtn.setText("clear");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        forgetPasswardBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        forgetPasswardBtn.setForeground(new java.awt.Color(255, 51, 102));
        forgetPasswardBtn.setText("Forget passward");
        forgetPasswardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswardBtnMouseClicked(evt);
            }
        });
        forgetPasswardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPasswardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(forgetPasswardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 463, -1, -1));

        managerLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        managerLoginBtn.setForeground(new java.awt.Color(255, 51, 102));
        managerLoginBtn.setText("Login");
        managerLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managerLoginBtnMouseClicked(evt);
            }
        });
        managerLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(managerLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 98, -1));

        optionCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionCmb.setForeground(new java.awt.Color(255, 102, 102));
        optionCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customer", "manager", "supplier", " " }));
        jPanel1.add(optionCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel6.setText("User name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 187, 130, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 690, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwardTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwardTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwardTxtActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(1);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void forgetPasswardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswardBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgetPasswardBtnMouseClicked

    private void forgetPasswardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPasswardBtnActionPerformed
        new ForgetPassward().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_forgetPasswardBtnActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void managerLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerLoginBtnActionPerformed
        try{
            rs2 = DbOperation.getData("select* from manager where userName='" + userNameTxt.getText() +"' and password = '" + passwardTxt.getText() +"'");
            rs3 = DbOperation.getData("select* from supplier where userName='" + userNameTxt.getText() +"' and password = '" + passwardTxt.getText() +"'");
            rs = DbOperation.getData("select* from customer where userName='" + userNameTxt.getText() +"' and password = '" + passwardTxt.getText() +"'");
            if(userNameTxt.getText().isEmpty() || passwardTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing information!!!");
            }
            else if("customer".equals(optionCmb.getSelectedItem().toString())){
                if(rs.next()){
                    new Selling(userNameTxt.getText()).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Wrong user name or passward");
                    clear();
                }
            }
            else if("manager".equals(optionCmb.getSelectedItem().toString())){
                if(rs2.next()){
                    new Items().setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Wrong user name or passward");
                    clear();
                }
            }
            else if("supplier".equals(optionCmb.getSelectedItem().toString())){
                if(rs3.next()){
                    new Ingridents(userNameTxt.getText()).setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Wrong user name or passward");
                    clear();
                }
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_managerLoginBtnActionPerformed

    private void managerLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerLoginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_managerLoginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton forgetPasswardBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton managerLoginBtn;
    private javax.swing.JComboBox<String> optionCmb;
    private javax.swing.JPasswordField passwardTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
