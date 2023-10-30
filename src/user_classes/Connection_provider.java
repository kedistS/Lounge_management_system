/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user_classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Connection_provider {
    public static Connection getCon(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/lounge5", "root", "1493");
           return con;
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null, e);
               return null;
           }catch(ClassNotFoundException e){
               JOptionPane.showMessageDialog(null, e);
               return null;
           }
    }
}

    
