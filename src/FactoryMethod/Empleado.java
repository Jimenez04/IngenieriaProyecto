package FactoryMethod;
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
     
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
}
