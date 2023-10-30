/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import user_classes.Connection_provider;


/**
 *
 * @author hp
 */
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
    }
    
    Connection con = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        answerTxt = new javax.swing.JTextField();
        passwardTxt = new javax.swing.JPasswordField();
        createBtn = new javax.swing.JButton();
        alreadyLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        confirmTxt = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        securityTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 251, 28));

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 175, 150, 30));

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Phone number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 252, 170, 30));

        jLabel4.setBackground(new java.awt.Color(102, 153, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("User name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 252, 170, 30));

        jLabel5.setBackground(new java.awt.Color(102, 153, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("passward");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 320, 130, 30));

        jLabel6.setBackground(new java.awt.Color(102, 153, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("confirm passward");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 210, 30));

        lastNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 193, 30));

        userNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 196, 27));

        answerTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answerTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(answerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 288, 30));

        passwardTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwardTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwardTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwardTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwardTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 269, -1));

        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 102, 102));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 489, -1, -1));

        alreadyLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        alreadyLbl.setForeground(new java.awt.Color(153, 255, 255));
        alreadyLbl.setText("Already has an Account");
        alreadyLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alreadyLblMouseClicked(evt);
            }
        });
        jPanel1.add(alreadyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 539, 420, 50));

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("First name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 175, 140, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Create an account");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 370, 44));

        jLabel10.setBackground(new java.awt.Color(102, 153, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("security question");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 388, -1, 30));

        confirmTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(confirmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 220, -1));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("answer");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 388, 91, 30));

        phoneNumberTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNumberTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(phoneNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 233, 24));

        securityTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        securityTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(securityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 210, 28));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Cafe management system");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1010, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwardTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwardTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwardTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        if(firstNameTxt.getText().isEmpty() || lastNameTxt.getText().isEmpty() || answerTxt.getText().isEmpty() || passwardTxt.getText().isEmpty()|| confirmTxt.getText().isEmpty()|| userNameTxt.getText().isEmpty()||securityTxt.getText().isEmpty()||answerTxt.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing information!!!");
       }else if(!passwardTxt.getText().equals(confirmTxt.getText())){
           JOptionPane.showMessageDialog(this, "passward mismatch");
           passwardTxt.setText("");
           confirmTxt.setText("");
       }
       else if(phoneNumberTxt.getText().length() != 10){
           JOptionPane.showMessageDialog(this, "please enter valid mobile number");
       }
       else if(securityTxt.getText().length() > 30){
           JOptionPane.showMessageDialog(this, "please make your securiy question shorter");
       }else{
           try{
           con = Connection_provider.getCon();
           PreparedStatement pst1 = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
               pst1.setString(1, userNameTxt.getText());
               pst1.setString(2, passwardTxt.getText());
               pst1.setString(3, firstNameTxt.getText());
               pst1.setString(4, lastNameTxt.getText());
               pst1.setString(5, phoneNumberTxt.getText());
               pst1.setString(6, securityTxt.getText());
               pst1.setString(7, answerTxt.getText());
               JOptionPane.showMessageDialog(this, "Account created");
               int row = pst1.executeUpdate();
               con.close();
               new Login().setVisible(true);
               this.dispose();
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e);
           }
       }
        /*else{
           try{
           con = Connection_provider.getCon();
           PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?)");
           pst.setString(1, userNameTxt.getText());
           pst.setString(2, passwardTxt.getText());
           pst.setString(3, firstNameTxt.getText());
           pst.setString(4, lastNameTxt.getText());
           pst.setString(5, phoneNumberTxt.getText());
           pst.setString(6, securityTxt.getText());
           pst.setString(7, answerTxt.getText());
           pst.setString(8, optionCmb.getSelectedItem().toString());
           pst.setString(9, "Not approved");
           int row = pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Account created!!!");
           con.close();
           new Login().setVisible(true);
           this.dispose();
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e);
           }
       }*/
    }//GEN-LAST:event_createBtnActionPerformed

    private void alreadyLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alreadyLblMouseClicked
       new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_alreadyLblMouseClicked

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alreadyLbl;
    private javax.swing.JTextField answerTxt;
    private javax.swing.JPasswordField confirmTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JPasswordField passwardTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JTextField securityTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
