/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fabia
 */
public class PruebaDelete {
    
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recuperaConexion();
        
        Statement statement = con.createStatement();
        
        statement.execute("DELETE FROM PRODUCTO WHERE ID = " + 99);
        
        System.out.println(statement.getUpdateCount());
    }
}
