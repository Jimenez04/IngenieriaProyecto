package FactoryMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpleadoFactor {
    Empleado nuevoempleado;
    Object []listaempleados = new Object[4]; //opcional
    
    public EmpleadoFactor(){
        //     SeleccionEmpleado(
        //     primerNombre,  apellidoPaterno,  numeroSocial, //empleado
        //     salarioSemanal, //Asalariado
        //     sueldo,  horas, //EmpleadoPorHoras
        //     ventasBrutas,  tarifaComision, //PorComision
        //     salariobase //BaseMasComision);
        nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 100000); //Empleado asalariado
        listaempleados[0] = nuevoempleado;
        nuevoempleado = new EmpleadoPorHoras("Leonela", "Bermudez ", "0-0000-0000",5000, 50); //Empleado por horas
        listaempleados[1] = nuevoempleado;
        nuevoempleado = new EmpleadoPorComision("Kryssia", "Viales", "0-0000-0000", 1000000.0, 0.2); //Empleado por comision
        listaempleados[2] = nuevoempleado;
        nuevoempleado = new EmpleadoBaseMasComision("Juanito", "Perez", "0-0000-000", 1000000, 0.1, 400000); //Empleado base mas comision
        listaempleados[3] = nuevoempleado;
         mostrarinfo();
    }

    public void mostrarinfo(){
        for(Object empleadoespecifico : listaempleados){
                 System.out.println(empleadoespecifico); 
        }
    }
}
