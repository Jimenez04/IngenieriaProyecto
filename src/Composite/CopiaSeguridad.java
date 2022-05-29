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
public class CopiaSeguridad extends Thread{
    LlenarArbol Llenado = new LlenarArbol();
    
    @Override
     public void run() { //Observer
            while(true){
                if(Llenado.contador != Llenado.contadorhilo){
                    System.err.println("Un nuevo empleado se ha ingresado, creando copia de seguridad en la BD");
                    Llenado.contadorhilo ++;
                }
            }
    }
}
