/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author jose0
 */
class Arbol {
    public Arbol Izquierda = null;
    public Arbol Derecha = null;
    Empleado InfoEmpleado;
    public Arbol(Empleado empleado){
        InfoEmpleado = empleado; 
    }
     public Arbol(){
    }
     
     public void agregar(Arbol nuevoempleado) {
            if (nuevoempleado.InfoEmpleado.ingresos()  > InfoEmpleado.ingresos()) { 
                   if(Derecha == null) {
                       Derecha = nuevoempleado;
                   }else {
                      Derecha.agregar(nuevoempleado);	 // Ingresa a la derecha
                   }
           }
           if (nuevoempleado.InfoEmpleado.ingresos()  < InfoEmpleado.ingresos()){
                if(Izquierda == null) {
                    Izquierda = nuevoempleado;
                }else {
                    Izquierda.agregar(nuevoempleado);	
                }
           }
    }
}
