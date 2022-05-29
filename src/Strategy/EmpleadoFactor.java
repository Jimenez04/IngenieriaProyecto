/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jose0
 */
public class EmpleadoFactor{
    
   
    Empleado nuevoempleado;
    
    LlenarArbol listaBD;
    
    public EmpleadoFactor(){
        //     SeleccionEmpleado(
        //     primerNombre,  apellidoPaterno,  numeroSocial, //empleado
        //     salarioSemanal, //Asalariado
        //     sueldo,  horas, //EmpleadoPorHoras
        //     ventasBrutas,  tarifaComision, //PorComision
        //     salariobase //BaseMasComision);
        listaBD = new LlenarArbol(); 
         
        SeleccionEmpleado("Jose", "Jimenez", "5-0425-0352", 100000, 0, 0, 0, 0, 0); //Empleado asalariado
        SeleccionEmpleado("Leonela", "Bermudez ", "0-0000-0000", 0, 5000, 50, 0, 0, 0); //Empleado por horas
        SeleccionEmpleado("Kryssia", "Viales", "0-0000-0000", 0, 0, 0, 1000000.0, 0.2, 0); //Empleado por comision
        SeleccionEmpleado("Juanito", "Perez", "0-0000-000", 0, 0, 0, 1000000, 0.1, 400000); //Empleado base mas comision
        SeleccionEmpleado("Jose", "Jimenez", "5-0425-0352", 100, 0, 0, 0, 0, 0); //Empleado asalariado
        SeleccionEmpleado("Jose", "Jimenez", "5-0425-0352", 110, 0, 0, 0, 0, 0); //Empleado asalariado
        SeleccionEmpleado("Jose", "Jimenez", "5-0425-0352", 105, 0, 0, 0, 0, 0); //Empleado asalariado
        SeleccionEmpleado("Jose", "Jimenez", "5-0425-0352", 111, 0, 0, 0, 0, 0); //Empleado asalariado
        Empleado infoEmpleado = listaBD.Buscar(100000.0);
         mostrarinfo(infoEmpleado);
        Empleado infoEmpleado2 = listaBD.Buscar(275000.0);
         mostrarinfo(infoEmpleado2);
        Empleado infoEmpleado3 = listaBD.Buscar(1000000.2);
         mostrarinfo(infoEmpleado3);
        //Empleado infoEmpleado4 = listaBD.Buscar(1400000.1);
         //mostrarinfo(infoEmpleado);
        //Empleado infoEmpleado5 = listaBD.Buscar(100);
         //mostrarinfo(infoEmpleado);
        //Empleado infoEmpleado6 = listaBD.Buscar(110);
         //mostrarinfo(infoEmpleado);
        //Empleado infoEmpleado7 = listaBD.Buscar(105);
         //mostrarinfo(infoEmpleado);
        //Empleado infoEmpleado8 = listaBD.Buscar(111);
         //mostrarinfo(infoEmpleado);
        
       
    }
    
    public void mostrarinfo(Object infoEmpleado){
        System.out.println(infoEmpleado); 
    }
    
    public void SeleccionEmpleado(
            String primerNombre, String apellidoPaterno, String numeroSocial, //empleado
            double salarioSemanal, //Asalariado
            double sueldo, double horas, //EmpleadoPorHoras
            double ventasBrutas, double tarifaComision, //PorComision
            double salariobase //BaseMasComision
    ){      //System.out.println(ventasBrutas + " o " + tarifaComision);
        if(validarstring(apellidoPaterno) && validarstring(primerNombre)){ 
                if(validarnum(salarioSemanal) && salarioSemanal > 0.0){ //Asalariado
                    nuevoempleado = new EmpleadoAsalariado(primerNombre, apellidoPaterno, numeroSocial, salarioSemanal);
                }else if(validarnum(sueldo) && sueldo > 0.0 && validarnum(horas) && horas > 0.0){ //EmpleadoPorHoras
                    nuevoempleado = new EmpleadoPorHoras(primerNombre, apellidoPaterno, numeroSocial, sueldo, horas);
                }else if(validarnum(ventasBrutas) && ventasBrutas > 0.0 && validarnum(tarifaComision) && tarifaComision > 0.0){ //PorComision
                    if(validarnum(salariobase) && salariobase > 0.0){ //BaseMasComision);
                        nuevoempleado = new EmpleadoBaseMasComision(primerNombre, apellidoPaterno, numeroSocial, ventasBrutas, tarifaComision, salariobase);
                    }else {
                        nuevoempleado = new EmpleadoPorComision(primerNombre, apellidoPaterno, numeroSocial, ventasBrutas, tarifaComision);
                    }
                }
             listaBD.Nuevo(nuevoempleado);
             nuevoempleado = null;
        }else {
         System.out.println("Los campos de texto no son validos");
        }
    }
    
    
    private boolean validarstring(String cadena){
        Pattern pat = Pattern.compile("^[a-zA-Z_ ]{1,50}$");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    private boolean validarnum(Double cadena){
        String validas = "^[0-9]+(\\.[0-9]+){0,1}$";
        String num = cadena.toString();
            if (!num.contains(".") || !num.matches(validas)) {
                return false;
            }
        return true;
    }
}

