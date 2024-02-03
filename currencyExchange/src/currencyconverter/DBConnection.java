/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author MOHD SHAKIR
 */
public class DBConnection {
    static Connection connection=null;
    public static Connection getConnection(){
        try{
        Properties prop = new Properties();
        prop.load(new FileInputStream("connector.properties"));
        String theUser = prop.getProperty("user");
        String thePassword = prop.getProperty("password");
        String theDBURL = prop.getProperty("dburl");
        System.out.println("Connecting to database...");
        System.out.println("Database URL : "+theDBURL);
        System.out.println("Database User : "+theUser);
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(theDBURL,theUser,thePassword);
        System.out.println("Connecion Success");
        
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
        return connection;
    }
}
