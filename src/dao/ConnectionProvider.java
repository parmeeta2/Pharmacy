/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//connecting database
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author aryan
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           // this pharmacy we used we created in my sql8.0 command client
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","4SF21CS105");
           return con;
        }
        catch(Exception e){
        System.out.println(e);
        return null;
        }
    }
}
