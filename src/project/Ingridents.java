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
public class Ingridents extends javax.swing.JFrame {

    
    public Ingridents() {
        initComponents();
        showIngridents();
    }
     public Ingridents(String userName) {
        initComponents();
        showIngridents();
        supplierTxt.setText(userName);
        supplierTxt.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    ResultSet rs = null, rs1 = null;
   Connection con = null;
   public void showIngridents(){
           rs = DbOperation.getData("select * from Ingrident");
           itemesTable.setModel(DbUtils.resultSetToTableModel(rs));
           
    }
    public void filterProducts(){
        
           rs = DbOperation.getData("select* from Ingrident where catagory='" + filterCmb.getSelectedItem().toString()+"'");
           itemesTable.setModel(DbUtils.resultSetToTableModel(rs));
           
    }
     
    int foodID;
    public void countId(){
        try{
           rs1 = DbOperation.getData("select max(IngridentID) from Ingrident");
           rs1.next();
           foodID = rs1.getInt(1)+1;
        }catch(Exception e){
          
        }
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        supplierTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemesTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        catagoryCmb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filterCmb = new javax.swing.JComboBox<>();
        refereshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingridenet name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 138, -1, 42));

        nameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 102, 102));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 198, 167, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 138, 104, 42));

        priceTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 198, 173, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amount");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 104, 42));

        supplierTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        supplierTxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(supplierTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 164, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Supplier ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 141, 42));

        amountTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 164, -1));

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 51, 102));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 51, 102));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 295, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Ingrident management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        itemesTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ingrident_ID", "Ingrident_name", "price", "Amount", "Catagory", "Supplier_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 860, 216));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Catagory");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 247, 104, 42));

        catagoryCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catagoryCmb.setForeground(new java.awt.Color(255, 102, 153));
        catagoryCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegitable", "Diary", "Drink_products", "spices", " ", " " }));
        jPanel1.add(catagoryCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 295, 193, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrident list");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 269, 42));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 104, 42));

        filterCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filterCmb.setForeground(new java.awt.Color(255, 102, 153));
        filterCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegitable", "Diary", "Drink_products", "spices", " " }));
        filterCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterCmbItemStateChanged(evt);
            }
        });
        jPanel1.add(filterCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 223, -1));

        refereshBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refereshBtn.setForeground(new java.awt.Color(255, 51, 102));
        refereshBtn.setText("Refresh");
        refereshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refereshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refereshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed
    int key = 0;
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(nameTxt.getText().isEmpty() || priceTxt.getText().isEmpty() || amountTxt.getText().isEmpty() || supplierTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information!!!");
        }else{
            try{
                countId();
                con = Connection_provider.getCon();
                double amount = Double.parseDouble(amountTxt.getText());
                double price =  Double.parseDouble(priceTxt.getText());
                PreparedStatement pst = con.prepareStatement("insert into ingrident values(?,?,?,?,?,?)");
                pst.setInt(1, foodID);
                pst.setString(2, nameTxt.getText());
                pst.setDouble(4, amount);
                pst.setDouble(3, price);
                pst.setString(5, catagoryCmb.getSelectedItem().toString());
                pst.setString(6, supplierTxt.getText());
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "ingrident added!!!");
                con.close();
                showIngridents();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try{
            countId();
            con = Connection_provider.getCon();
            double amount = Double.parseDouble(amountTxt.getText());
            double price =  Double.parseDouble(priceTxt.getText());
            PreparedStatement pst = con.prepareStatement("update Ingrident set ingridentName = ?, ingridentPrice = ?, amountLeft  = ?, catagory=?, supplierID = ? where ingridentID = ?");
            pst.setInt(6, key);
            pst.setString(1, nameTxt.getText());
            pst.setDouble(3, amount);
            pst.setDouble(2, price);
            pst.setString(4, catagoryCmb.getSelectedItem().toString());
            pst.setString(5, supplierTxt.getText());
            int row = pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ingrident updated!!!");
            con.close();
            showIngridents();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void itemesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) itemesTable.getModel();
        int myIndex = itemesTable.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(myIndex, 0).toString());
        nameTxt.setText(model.getValueAt(myIndex, 1).toString());
        priceTxt.setText(model.getValueAt(myIndex, 2).toString());
        amountTxt.setText(model.getValueAt(myIndex, 3).toString());
        catagoryCmb.setSelectedItem(model.getValueAt(myIndex, 4).toString());
        supplierTxt.setText(model.getValueAt(myIndex, 5).toString());
    }//GEN-LAST:event_itemesTableMouseClicked

    private void filterCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterCmbItemStateChanged
        filterProducts();
    }//GEN-LAST:event_filterCmbItemStateChanged

    private void refereshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refereshBtnActionPerformed
        showIngridents();
    }//GEN-LAST:event_refereshBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new ShowIngridentOrders().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Ingridents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingridents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingridents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingridents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingridents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JComboBox<String> catagoryCmb;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> filterCmb;
    private javax.swing.JTable itemesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton refereshBtn;
    private javax.swing.JTextField supplierTxt;
    // End of variables declaration//GEN-END:variables
}
