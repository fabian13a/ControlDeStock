/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author fabia
 */
public class PruebaPoolDeConexiones {
    
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        
        for (int i = 0; i < 20; i++) {
            Connection conexion = connectionFactory.recuperaConexion();
            System.out.println("Abriendo la conexion de nmero: "+ i+1);
        }
    }
}
