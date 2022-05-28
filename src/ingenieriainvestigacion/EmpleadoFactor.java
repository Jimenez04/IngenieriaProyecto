/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieriainvestigacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jose0
 */
public class EmpleadoFactor {
    
   
    Empleado nuevoempleado;
   
    
    public EmpleadoFactor(){
            System.out.println(validarnum(1.1)); //Cadena invalida
    }
    
    public void SeleccionEmpleado(
            String primerNombre, String apellidoPaterno, String numeroSocial, //empleado
            double salarioSemanal, //Asalariado
            double sueldo, double horas, //EmpleadoPorHoras
            double ventasBrutas, double tarifaComision, //PorComision
            double salariobase //BaseMasComision
    ){
        
    }
    
    
    private boolean validarstring(String cadena){
        Pattern pat = Pattern.compile("^[a-zA-Z_ ]{1,50}$");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    private boolean validarnum(Double cadena){
        String validas = "^[0-9]+(\\.[0-9]+){0,1}$";
        String num = cadena.toString();
         System.out.println(num);
            if (!num.contains(".") || !num.matches(validas)) {
                return false;
            }
        return true;
    }
}
