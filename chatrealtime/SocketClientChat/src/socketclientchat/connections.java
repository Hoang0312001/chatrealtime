/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketclientchat;


import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 84981
 */
public class connections{
      public static String url="jdbc:sqlserver://localhost:1433;"
            + "databaseName=chatrealtime";
    public static String username="sa";
    public static String pass="1234";
    public static java.sql.Connection open() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, username, pass);
    }
    
    
}
