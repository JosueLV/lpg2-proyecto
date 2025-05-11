/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.proyecto.test;

import pe.edu.upeu.proyecto.config.Conexion;
import pe.edu.upeu.proyecto.dao.IUsuario;
import pe.edu.upeu.proyecto.daoimpl.UsuarioDaoImpl;

/**
 *
 * @author Josue Llontop
 */
public class Test {
    static IUsuario iu = new UsuarioDaoImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login();
    }
    
    static void conec(){
           if(Conexion.getConexion()!=null){
            System.out.println("Conectado..!");
    }else{
            System.out.println("No Conectado");
        }
    }
    static void login(){
        System.out.println(iu.login("josegutierrez@gmail.com", "123456"));
        
    }
    
}
