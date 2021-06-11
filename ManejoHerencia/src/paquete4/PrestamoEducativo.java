/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo {
    
    private String niveldeestudio;
    private String centroeducativo;
    private double valorcarrera;
    private double valormensual;
    
     public PrestamoEducativo(Persona benef, int m, String ciud,String nivel, String centro, double val) 
    {
        super(benef, m, ciud);
        niveldeestudio=nivel;
        centroeducativo=centro;
        valorcarrera=val;
    }

    public void EstablecerNiveldeestudio(String nivel) {
        niveldeestudio = nivel;
    }

    public void EstablecerCentroeducativo(String centro) {
        centroeducativo = centro;
    }

    public void EstablecerValorcarrera(double valor) {
        valorcarrera = valor;
    }

    public void EstablecerValormensual() {
        double cuota=valorcarrera/ObtenerMeses();
        valormensual=cuota-(cuota*0.1);
    }

    public String ObtenerNiveldeestudio() {
        return niveldeestudio;
    }

    public String ObtenerCentroeducativo() {
        return centroeducativo;
    }

    public double ObtenerValorcarrera() {
        return valorcarrera;
    }

    public double ObtenerValormensual() {
        return valormensual;
    }
    
    @Override
    public String toString(){
        String cadena = "\n*********************\nPRESTAMO EDUCATIVO\n";
        cadena = String.format("%sEstudiante: %s"
                + "\nTiempo Prestamo %d Meses"
                + "\nCiudad: %s"
                + "\nCentro Educativo: %s"
                + "\nNivel De Estudio: %s"
                + "\nValor Carrera: $%.2f"
                + "\nValor Mensual: $%.2f", cadena,ObtenerBeneficiario().ObtenerNombre()+" "+ObtenerBeneficiario().ObtenerApellido(),
                ObtenerMeses(),ObtenerCiudad().toUpperCase(),ObtenerCentroeducativo(),ObtenerNiveldeestudio(),ObtenerValorcarrera(),ObtenerValormensual());
        
        return cadena;
    }
}

