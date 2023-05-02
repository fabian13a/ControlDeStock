/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.modelo;

/**
 *
 * @author fabia
 */
public class Producto {
    private Integer id;   
    
    private String nombre;
    
    private String descripcion;
    
    private Integer cantidad;

    public Producto(String nombre, String descripcion, Integer cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;        
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
   @Override
   public String toString(){
       return String.format(
               "{id: %s, nombre: %s, descripcion, %s, cantidad: %d}",
               this.id,
               this.nombre,
               this.descripcion,
               this.cantidad);
   }
   
}
