package FactoryMethod;
    
public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas, tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSocial);
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    @Override
    public String toString() {
       return "La persona: " + super.getPrimerNombre()+ " " + super.getApellidoPaterno() 
               + " es empleado por comisión, cuenta con un con número de seguro social: "
                + super.getNumeroSeguroSocial() + ", tiene unas ventas brutas de:" 
               + ventasBrutas + ", y su tarifa de comisión es: "  + tarifaComision + " sus ingreso son de: " + ingresos();
    }
    @Override
    public double ingresos() {
        return getTarifaComision() + getVentasBrutas();
    }
    public double getVentasBrutas() {
        return ventasBrutas;
    }
    public void setVentasBrutas(double ventasBrutas) {
        if(ventasBrutas < 0.0){
               throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }
    public double getTarifaComision() {
        return tarifaComision;
    }
    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision <= 0.0 || tarifaComision >=1.0){
            throw new IllegalArgumentException("Las tarifa de comision debe ser > 1.0 y < 1.0");
        }
        this.tarifaComision = tarifaComision;
    }
}
