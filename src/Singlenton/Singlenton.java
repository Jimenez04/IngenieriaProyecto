/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singlenton;

/**
 *
 * @author jose0
 */
public class Singlenton {
    private static Object []listaempleados = new Object[5]; 
    private static Singlenton singlentonoculto;
    private int i = 0;
    
    private Singlenton(Object[] lista){
            listaempleados = lista;
    }
    
    public static Singlenton getSinglentonInstance(Object[] lista){
        if(singlentonoculto == null){
           singlentonoculto = new Singlenton(lista);
        }else{
            System.out.println("El singlenton ya esta creado.");
        }
        return singlentonoculto;
    }

    /**
     * @return the singlentonoculto
     */
    public static Object[] getListaEmpleados() {
        return listaempleados;
    }

    /**
     * @param aSinglentonoculto the singlentonoculto to set
     */
    public  void setListaEmpleados(Object empleado) {
        if(i <= 5){
            listaempleados[i] = empleado;
            i++;
        }
    }
    
}