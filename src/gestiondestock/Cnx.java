/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondestock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Cnx {
    
    public static Connection connect()
    {
       try {
            Class.forName("oracle.jdbc.driver.OracleDriver");     
            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "cccc");
        return c;
        } catch (Exception ex) {
            Logger.getLogger(Cnx.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }  
    }
}
