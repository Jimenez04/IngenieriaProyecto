/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jose0
 */
public class BibliotecaDeDatos {
    
    
    public void mayoringreso(JSONArray JSONEmpleados){
        double pivote = 0;  
        String nombre = "";
            for (int i = 0; i < JSONEmpleados.length(); i++) {
                try {
                    JSONObject jsonObject = JSONEmpleados.getJSONObject(i);
                    if (jsonObject.has("clave")) {
                        String valor = jsonObject.getString("clave");
                        // Aquí hacer algo con el valor
                    }
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
