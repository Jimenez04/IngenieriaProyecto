/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author jose0
 */
public class EmpleadoPorHoras extends Empleado{

    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSocial, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSocial);
        
        if(horas < 0.0 || horas > 168.0){
                throw new IllegalArgumentException(
                        "Las horas deben ser mayor a >= 0.0"
                );
            }
        if(sueldo < 0.0){
                throw new IllegalArgumentException(
                        "El sueldo por horas debe ser >= 0.0"
                );
            }
        this.horas = horas;
        this.sueldo = sueldo;
    }

        @Override
    public String toString() {
       return "La persona: " + super.getPrimerNombre()+ " " + super.getApellidoPaterno() + " es empleado por horas, cuenta con un con número de seguro social: "
                + super.getNumeroSeguroSocial() + " el sueldo es de:" + sueldo + ", y las horas trabajadas son "  + horas + " sus ingreso son de: " + ingresos();
    }
    @Override
    public double ingresos() {
        if (getHoras() <= 40) {
            return getSueldo() * getHoras();
        }else {
            return 40 * getSueldo() + (getHoras() - 40 ) * getSueldo() * 1.5;
        }
    }  
    
    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        if(sueldo < 0.0){
        throw new IllegalArgumentException(
                "El sueldo por horas debe ser >= 0.0"
            );
         }
         this.sueldo = sueldo;
    }

    /**
     * @return the horas
     */
    public double getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(double horas) {
        if(horas < 0.0 || horas > 168.00){
        throw new IllegalArgumentException(
                "Las horas deben ser mayores >= 0.0"
            );
         }
         this.horas = horas;
    }
    
}
