/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
  protected Persona beneficiario;
    protected int tiempoPres;
    protected String ciudadP;
    
    public Prestamo(Persona be,int ti,String ci){
        beneficiario = be;
        tiempoPres = ti;
        ciudadP = ci;
    }
    
    public void establecerBeneficiario(Persona b){
        beneficiario = b;
    }
    public void establecerTiempoPrestamoMeses(int tiem){
        tiempoPres = tiem;
    }
    public void establecerCiudadPrestamo(String ciu){
        ciudadP = ciu;
    }
    
    public Persona ObtenerBeneficiario(){
        return beneficiario;
    }
    public int obtenerTiempoPrestamoMeses(){
        return tiempoPres;
    }
    public String obtenerCiudadPrestamo(){
        return ciudadP;
    }
}

