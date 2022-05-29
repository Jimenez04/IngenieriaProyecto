package Strategy;

public class NuevoItemArbol {
    
    public boolean vacio(Arbol inicio) { // Si esta vacio retorna null
        return inicio == null;
    }
    
    public Arbol Nuevo(Arbol pivote, Empleado nuevoempleado){
        if (vacio(pivote) == true) {
            Arbol parcialempleado = new Arbol(nuevoempleado);
                 pivote = parcialempleado;
                return pivote;
        } else {
            Arbol parcialempleado = new Arbol(nuevoempleado);
                pivote.agregar(parcialempleado);
                return pivote;
        }
    }
}
