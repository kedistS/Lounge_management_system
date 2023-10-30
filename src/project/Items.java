/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import user_classes.Connection_provider;
import user_classes.DbOperation;
public class Items extends javax.swing.JFrame {

   
    public Items() {
        initComponents();
        showProducts();
    }
    public Items(String managerID) {
        initComponents();
        showProducts();
    }

   ResultSet rs = null, rs1 = null;
   Connection con = null;
    @SuppressWarnings("unchecked")
    public void showProducts(){
           rs = DbOperation.getData("select * from item");
           itemesTable.setModel(DbUtils.resultSetToTableModel(rs));
           
    }
     public void filterProducts(){
        
           rs = DbOperation.getData("select* from item where catagory='" + filterCmb.getSelectedItem().toString()+"'");
           itemesTable.setModel(DbUtils.resultSetToTableModel(rs));
           
    }
    int ID;
    public void countId(){
        try{
           rs1 = DbOperation.getData("select max(itemID) from item");
           rs1.next();
           ID = rs1.getInt(1)+1;
        }catch(Exception e){
          
        }
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        catagoryCmb = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        filterCmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemesTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editBtn1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("food and drinks management");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 20, 343, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 104, 42));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Catagory");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 97, 104, 42));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 97, 104, 42));

        priceTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 145, 173, -1));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 102, 102));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 145, 167, -1));

        catagoryCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catagoryCmb.setForeground(new java.awt.Color(255, 102, 153));
        catagoryCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink" }));
        jPanel2.add(catagoryCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 145, 193, -1));

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 51, 102));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 51, 102));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel2.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("food and drinks list");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 269, 42));

        filterCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filterCmb.setForeground(new java.awt.Color(255, 102, 153));
        filterCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink" }));
        filterCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterCmbItemStateChanged(evt);
            }
        });
        jPanel2.add(filterCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 223, -1));

        itemesTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "food_ID", "food_name", "Catagory", "Amount", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemesTable.setRowHeight(29);
        itemesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemesTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 399, 860, 216));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amount");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 97, 104, 42));

        amountTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 150, 164, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 107, 104, 42));

        editBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editBtn1.setForeground(new java.awt.Color(255, 51, 102));
        editBtn1.setText("Refresh");
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.JPG"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("food and drinks");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Order ingrident");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("View orders");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       if(nameTxt.getText().isEmpty() || priceTxt.getText().isEmpty() || catagoryCmb.getSelectedIndex() == -1){
           JOptionPane.showMessageDialog(this, "Missing information|||");
       }else{
           try{
           countId();
           con = Connection_provider.getCon();
           PreparedStatement pst = con.prepareStatement("insert into item values(?,?,?,?,?)");
           pst.setInt(1, ID);
           pst.setString(2, nameTxt.getText());
           pst.setString(3, catagoryCmb.getSelectedItem().toString());
           pst.setInt(4, Integer.parseInt(amountTxt.getText()));
           pst.setDouble(5, Double.parseDouble(priceTxt.getText()));
           int row = pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "item added!!!");
           con.close();
           showProducts();
           }catch(Exception e){
               JOptionPane.showMessageDialog(this, e);
       }
       }
    }//GEN-LAST:event_addBtnActionPerformed
    int key = 0;
    private void itemesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) itemesTable.getModel();
        int myIndex = itemesTable.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(myIndex, 0).toString());
        nameTxt.setText(model.getValueAt(myIndex, 1).toString());
        priceTxt.setText(model.getValueAt(myIndex, 4).toString());
        amountTxt.setText(model.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_itemesTableMouseClicked

    private void filterCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterCmbItemStateChanged
        filterProducts();
    }//GEN-LAST:event_filterCmbItemStateChanged

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed
        showProducts();
    }//GEN-LAST:event_editBtn1ActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try{
            countId();
            con = con = Connection_provider.getCon();
            PreparedStatement pst = con.prepareStatement("update item set itemName = ?, Catagory = ?, amountLeft = ?, Price = ?  where itemID = ?");
            pst.setInt(5, key);
            pst.setString(1, nameTxt.getText());
            pst.setString(2, catagoryCmb.getSelectedItem().toString());
            pst.setInt(3, Integer.parseInt(amountTxt.getText()));
            pst.setDouble(4, Double.parseDouble(priceTxt.getText()));
            int row = pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "item updated!!!");
            con.close();
            showProducts();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new ShowSells().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         new IngridentOrder().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JComboBox<String> catagoryCmb;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editBtn1;
    private javax.swing.JComboBox<String> filterCmb;
    private javax.swing.JTable itemesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    // End of variables declaration//GEN-END:variables
}
