/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singlenton;

/**
 *
 * @author jose0
 */
public abstract class Empleado {
    private String primerNombre, apellidoPaterno, numeroSeguroSocial;
    
    
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSocial;
    }
    
    public abstract double ingresos() ;
    
    public abstract String toString() ;

    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the numeroSeguroSocial
     */
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    /**
     * @param numeroSeguroSocial the numeroSeguroSocial to set
     */
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
}
