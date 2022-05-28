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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSocial, ventasBrutas, tarifaComision);
         if(salarioBase < 0.0){
                throw new IllegalArgumentException(
                        "El salarioBase debe ser mayor a >= 0.0"
                );
         } 
        this.salarioBase = salarioBase;
    }
    
    @Override
    public String toString() {
       return "La persona: " + super.getPrimerNombre()+ " " + super.getApellidoPaterno() + " es empleado por base mas comisión, cuenta con un con número de seguro social: "
                + super.getNumeroSeguroSocial() + ", tiene unas ventas brutas de:" + super.getVentasBrutas() + ", su tarifa de comisión es: "  + super.getTarifaComision() +
               " y su salario base es de: "  + salarioBase + " ,sus ingreso son de: " + ingresos();
    }
    @Override
    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }
    
    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        if(salarioBase < 0.0 ){
        throw new IllegalArgumentException(
                "El salario debe ser mayor >= 0.0"
        );
     }
     this.salarioBase = salarioBase;
    }
   
}
