/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksiDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author My PC #16
 */
public class koneksi {
    public static Connection cn;
    public static Statement stm;
    
    public static Connection getKoneksi(){
        if(cn == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3325/db_tabungan", "root", "");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return cn;
    }
}
