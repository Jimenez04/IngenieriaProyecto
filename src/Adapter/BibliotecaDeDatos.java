package Adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BibliotecaDeDatos {
    
    
    public void mayoringreso(JSONArray JSONEmpleados){
        System.out.println(JSONEmpleados); 
        double pivote = 0;  
        String nombre = "";
            for (int i = 0; i < JSONEmpleados.length(); i++) {
                try {
                    JSONObject jsonObject = JSONEmpleados.getJSONObject(i);
                    double valor  = jsonObject.getDouble("Ingresos");
                     if(pivote < valor ){
                            nombre = jsonObject.getString("Nombre");
                            pivote = valor;
                      }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }       
            System.err.println("El empleado: " + nombre + " tiene los mayores ingresos, con ingresos de: " + pivote);
    }
}
