/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user_classes;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class DbOperation {
    public static void setData(String query){
        try{
            Connection con = Connection_provider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public static ResultSet getData(String query){
        try{
        Connection con = Connection_provider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
