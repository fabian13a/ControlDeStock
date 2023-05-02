/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 *
 * @author fabia
 */
public class ConnectionFactory {
    
    private DataSource datasource;    
    
    public ConnectionFactory(){
        var pooledDataSource = new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("farg1234");
        pooledDataSource.setMaxPoolSize(10);
        
        this.datasource = pooledDataSource;
    }
    
        public Connection recuperaConexion() throws SQLException {
            try {
                return this.datasource.getConnection();    
            }catch(SQLException e){
                throw new RuntimeException();
            }
        }             
    }


/*return DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "farg1234");  */    