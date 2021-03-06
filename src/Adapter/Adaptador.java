package Adapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Adaptador implements AnalizarEmpleados{
    private BibliotecaDeDatos adaptador;
    private JSONObject JSON;
    JSONArray  listaempleadosJSON;
    private Empleado[] listaempleados;
    private int i = 0;
   
    public Adaptador(){
    adaptador = new BibliotecaDeDatos();
    JSON = new JSONObject();
    listaempleadosJSON = new JSONArray();
    listaempleados = new Empleado[4];
    }
    @Override
    public void conversion() {
        convertiraEmpleados(Singlenton.getListaEmpleados());
            for(Empleado empleadoespecifico : listaempleados){
                try {
                     JSON.put("Nombre", empleadoespecifico.getPrimerNombre() );
                     JSON.put("Ingresos", empleadoespecifico.ingresos());
                     listaempleadosJSON.put(JSON);
                     JSON = new JSONObject(); //Queda en blanco
                } catch (JSONException ex) {
                    Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            adaptador.mayoringreso(listaempleadosJSON);
    }
    public void convertiraEmpleados(Object[] lisObjects){
            for(Object empleadoespecifico : lisObjects){
                Empleado empleado = Empleado.class.cast(empleadoespecifico);
                listaempleados[i] = empleado;
                i++;
            }
    }
    
}
