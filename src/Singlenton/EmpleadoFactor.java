package Singlenton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpleadoFactor {
    
    Empleado nuevoempleado;
    Singlenton listaBD;
    
    public EmpleadoFactor(){
        //     SeleccionEmpleado(
        //     primerNombre,  apellidoPaterno,  numeroSocial, //empleado
        //     salarioSemanal, //Asalariado
        //     sueldo,  horas, //EmpleadoPorHoras
        //     ventasBrutas,  tarifaComision, //PorComision
        //     salariobase //BaseMasComision);
        listaBD = Singlenton.getSinglentonInstance(new Object[5]);
         
         nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 100000); //Empleado asalariado
         listaBD.setListaEmpleados(nuevoempleado);
        nuevoempleado = new EmpleadoPorHoras("Leonela", "Bermudez ", "0-0000-0000",5000, 50); //Empleado por horas
         listaBD.setListaEmpleados(nuevoempleado);
        nuevoempleado = new EmpleadoPorComision("Kryssia", "Viales", "0-0000-0000", 1000000.0, 0.2); //Empleado por comision
         listaBD.setListaEmpleados(nuevoempleado);
        nuevoempleado = new EmpleadoBaseMasComision("Juanito", "Perez", "0-0000-000", 1000000, 0.1, 400000); //Empleado base mas comision
         listaBD.setListaEmpleados(nuevoempleado);
        
        Object[] empleadosBD =  listaBD.getListaEmpleados();

          for(Object empleadoespecifico : empleadosBD){
                mostrarinfo(empleadoespecifico);
            }
    }
    public void mostrarinfo(Object infoEmpleado){
        System.out.println(infoEmpleado); 
    }
}
