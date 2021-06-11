/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil {
     private String tipo;
    private String marca;
    private Persona garante;
    private double valor;
    private double valor_mensual;

    public PrestamoAutomovil(Persona benef, int m, String ciud,String tip, String marc, Persona garant, double val) 
    {
        super(benef, m, ciud);
        tipo=tip;
        marca=marc;
        garante=garant;
        valor=val;
    }
    
    public void EstablecerTipo(String tip) {
        tipo = tip;
    }

    public void EstablecerMarca(String mar) {
        marca = mar;
    }

    public void EstablecerGarante(Persona garan) {
        garante = garan;
    }

    
    
    public void EstablecerValor(double val) {
        valor = val;
    }
    
    public void EstablecerValor_mensual() {
        valor_mensual =valor/ObtenerMeses();
    }
    
    public String ObtenerTipo() {
        return tipo;
    }
    
    public String ObtenerMarca() {
        return marca;
    }
    
    public Persona ObtenerGarante() {
        return garante;
    }
    
    public double ObtenerValor() {
        return valor;
    }
    public double ObtenerValor_mensual() {
        return valor_mensual;
    }
   @Override
    public String toString(){
        String cadena = "\n*********************\nPRESTAMO AUTOMOVIL\n";
        cadena = String.format("%sBeneficiario: %s"
                + "\nTiempo Prestamo %d Meses"
                + "\nCiudad: %s"
                + "\nGarante: %s"
                + "\nTipo: %s"
                + "\nMarca: %s"
                + "\nValor Auto: $%.2f"
                + "\nValor Mensual: $%.2f", cadena,ObtenerBeneficiario().ObtenerNombre()+" "+ObtenerBeneficiario().ObtenerApellido(),
                ObtenerMeses(),ObtenerCiudad().toLowerCase(),ObtenerGarante().ObtenerNombre()+" "+ObtenerGarante().ObtenerApellido(),
                ObtenerTipo(),ObtenerMarca(),ObtenerValor(),ObtenerValor_mensual());
        
        return cadena;
    }
}

