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
public class EmpleadoAsalariado extends Empleado{

    private double salarioSemanal;
    
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSocial);
            if(salarioSemanal < 0.0){
                throw new IllegalArgumentException(
                        "El salario semanal debe ser mayor >= 0.0"
                );
            }
        this.salarioSemanal = salarioSemanal;
    }
        @Override
    public String toString() {
       return "La persona: " + super.getPrimerNombre()+ " " + super.getApellidoPaterno() + " es asalariada cuenta con un número de seguro social: "
                + super.getNumeroSeguroSocial() + " tiene un salario semanal de: " + salarioSemanal + " sus ingreso son de: " + ingresos();
    }
    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    /**
     * @return the salarioSemanal
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * @param salarioSemanal the salarioSemanal to set
     */
    public void setSalarioSemanal(double salarioSemanal) {
        if(salarioSemanal < 0.0){
                throw new IllegalArgumentException(
                        "El salario semanal debe ser mayor >= 0.0"
                );
            }
        this.salarioSemanal = salarioSemanal;
    }
    
}
