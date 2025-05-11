/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.proyecto.daoimpl;

import pe.edu.upeu.proyecto.dao.IUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.upeu.proyecto.config.Conexion;

/**
 *
 * @author Josue Llontop
 */
public class UsuarioDaoImpl implements IUsuario {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int login(String correo, String clave) {
        final String SQL_LOGIN = "SELECT * FROM usuario WHERE correo=? and clave=?";
        int X = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LOGIN);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                X = 1;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return X;
    }

}
