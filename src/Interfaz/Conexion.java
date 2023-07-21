/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author carolina
 */
public class Conexion {
    Connection cn;
    Statement st;

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajofinal","root","");
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Conexion no establecida "+ e);
        }return cn;
    }
    
    
}

