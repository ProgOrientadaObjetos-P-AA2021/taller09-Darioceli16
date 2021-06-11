/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Smart
 */
public class Persona {
     private String nombre;
    private String apellido;
    
    public Persona(String n, String ape){
        nombre = n;
        apellido = ape;
        
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerApellido(String n){
        apellido = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    
}
