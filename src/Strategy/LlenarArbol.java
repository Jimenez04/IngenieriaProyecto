package Strategy;

public class LlenarArbol {
    Arbol inicio = null;
    NuevoItemArbol Nuevoitemarbol;
    BuscarEnArbol BuscarenArbol;

    int sumatoria = 0;
    int contador = 0;
    
    public LlenarArbol(){
        Nuevoitemarbol = new NuevoItemArbol();
        BuscarenArbol = new BuscarEnArbol(); 
    }
    
    public void Nuevo(Empleado nuevoempleado){
        inicio = Nuevoitemarbol.Nuevo(inicio, nuevoempleado);
        contador++;
    }

    public Empleado Buscar(double ingreso) {
 		return BuscarenArbol.Buscar(inicio, ingreso);
    }
}
