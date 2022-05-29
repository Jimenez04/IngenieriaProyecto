package Singlenton;

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

    public static Object[] getListaEmpleados() {
        return listaempleados;
    }

    public  void setListaEmpleados(Object empleado) {
        if(i <= 5){
            listaempleados[i] = empleado;
            i++;
        }
    }
    
}
