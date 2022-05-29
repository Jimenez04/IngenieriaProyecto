package Composite;

public class EmpleadoFactor extends Thread{
    Empleado nuevoempleado;
    LlenarArbol listaBD;
    
    public EmpleadoFactor(){
        listaBD = new LlenarArbol(); 
         
           nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 100000); //Empleado asalariado
                listaBD.Nuevo(nuevoempleado);
           nuevoempleado = new EmpleadoPorHoras("Leonela", "Bermudez ", "0-0000-0000",5000, 50); //Empleado por horas
               listaBD.Nuevo(nuevoempleado);
           nuevoempleado = new EmpleadoPorComision("Kryssia", "Viales", "0-0000-0000", 1000000.0, 0.2); //Empleado por comision
                listaBD.Nuevo(nuevoempleado);
           nuevoempleado = new EmpleadoBaseMasComision("Juanito", "Perez", "0-0000-000", 1000000, 0.1, 400000); //Empleado base mas comision
                listaBD.Nuevo(nuevoempleado);
            nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 100); //Empleado asalariado
                listaBD.Nuevo(nuevoempleado);
            nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 110); //Empleado asalariado
                listaBD.Nuevo(nuevoempleado);
            nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 105); //Empleado asalariado
                listaBD.Nuevo(nuevoempleado);
            nuevoempleado = new EmpleadoAsalariado("Jose", "Jimenez", "5-0425-0352", 111); //Empleado asalariado
                listaBD.Nuevo(nuevoempleado);
                listaBD.contadorhilo ++;
        //Empleado infoEmpleado = listaBD.Buscar(100000.0);
        //Empleado infoEmpleado2 = listaBD.Buscar(275000.0);
        //Empleado infoEmpleado3 = listaBD.Buscar(1000000.2);
        //Empleado infoEmpleado4 = listaBD.Buscar(1400000.1);
        //Empleado infoEmpleado5 = listaBD.Buscar(100);
        //Empleado infoEmpleado6 = listaBD.Buscar(110);
        //Empleado infoEmpleado7 = listaBD.Buscar(105);
        //Empleado infoEmpleado8 = listaBD.Buscar(111);
        
        //mostrarinfo(infoEmpleado);
        //mostrarinfo(infoEmpleado8);
    }
    
    public void mostrarinfo(Object infoEmpleado){
        System.out.println(infoEmpleado); 
    }
    @Override
        public void run() { //Observer
               while(true){
                   if(listaBD.contador > listaBD.contadorhilo){
                       System.err.println("Un nuevo empleado se ha ingresado, creando copia de seguridad en la BD");
                       listaBD.contadorhilo ++;
                   }
               }
       }
}

