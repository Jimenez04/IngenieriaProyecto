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
public class LlenarArbol {
    Arbol inicio = null;
    int altura = 0;
    int nivelderecho = 0; int nivelizq = 0;
    int sumatoria = 0;
    int contador = 1;
    public int contadorhilo = 0;
    
    public LlenarArbol(){
    }
    
    public boolean vacio() { // Si esta vacio retorna null
        return inicio == null;
    }
    
    public void Nuevo(Empleado nuevoempleado){
        if (vacio() == true) {
            Arbol parcialempleado = new Arbol(nuevoempleado);
                 inicio = parcialempleado;
                contador++;
        } else {
            Arbol parcialempleado = new Arbol(nuevoempleado);
                inicio.agregar(parcialempleado);
                contador++;
        }
    }

    public Empleado Buscar(double ingreso) {
 		Arbol aux = null;
 		altura = 0;
 		nivelderecho = 0;
 		nivelizq = 0;
 		aux = BuscarPersona(inicio, ingreso,0,"");
 		return aux.InfoEmpleado;
    }
    
    private Arbol BuscarPersona(Arbol aux, double ingresos, int altura, String camino) { 
 		Arbol aux1 = null;
 		if (aux != null) {
 			if (aux.InfoEmpleado.ingresos()  == ingresos) { /// Si es igual Lo muetra
 				    System.err.println("La altura de esta busqueda es: " + altura);
 				aux1 = aux;
 			}
 			altura ++;
 			if (aux1 == null) { // si es nullaux1
                            nivelizq++;
                            aux1 = BuscarPersona(aux.Izquierda, ingresos, altura, "izq");
                            if (aux1 == null) {
                                nivelderecho++;
                                aux1 = BuscarPersona(aux.Derecha, ingresos,  altura, "dere");
                                    if (aux1 == null) { // si es nullaux1
                                        nivelizq--;
                                            if (aux1 == null) {
                                                    nivelderecho--;
                                            }
                                    }
                            }
                        }
 		}
 	return aux1;
 	}
    
    public int retornarAltura() {
        altura = 0;
        retornarAltura(inicio, 0);
        return altura;
    }

    private void retornarAltura(Arbol recorrido, int nivel) {
        if (recorrido != null) {
            retornarAltura(recorrido.Izquierda, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(recorrido.Derecha, nivel + 1);
        }
    }
    
}
