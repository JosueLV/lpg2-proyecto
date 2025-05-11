/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.proyecto.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Josue Llontop
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String USER = "C##LPG2";
    private static final String PASS = "123";
    private static Connection CX = null;
    
    public static Connection getConexion(){
        
        try {
            Class.forName(DRIVER);
            if (CX==null) {
                CX = DriverManager.getConnection(URL, USER, PASS);
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Conexion: " + e);
        }
        
        return CX;
    }
}
