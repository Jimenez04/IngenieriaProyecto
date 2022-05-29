package Strategy;

public class BuscarEnArbol {
    int altura = 0;
    int nivelderecho = 0; int nivelizq = 0;
    
    public Empleado Buscar(Arbol pivoteArbol,double ingreso) {
 		Arbol aux = null;
 		altura = 0;
 		nivelderecho = 0;
 		nivelizq = 0;
 		aux = BuscarPersona(pivoteArbol, ingreso,0,"");
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
}
