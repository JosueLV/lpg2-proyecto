/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.proyecto.test;

import pe.edu.upeu.proyecto.config.Conexion;

/**
 *
 * @author Josue Llontop
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado..!");
    }else{
            System.out.println("No Conectado");
        }
    }
    
}
