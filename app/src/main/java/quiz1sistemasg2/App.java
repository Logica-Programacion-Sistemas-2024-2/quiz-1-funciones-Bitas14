/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz1sistemasg2;

import java.util.Scanner;

public class App {
    public int calcularValorHora (String tipoVehiculo, int HorasPArqueadero) {
        try{ 
            tipoVehiculo = Integer.parseInt(tipoVehiculo);
            switch (tipoVehiculo) {
                case "C":
                    return 5000;
                    break;
                    
            }
            
            switch (tipoVehiculo) {
                case "M":
                    return 3000;
                    break;
                
            }
            switch (tipoVehiculo) {
                case "B":
                return 1000;
                break;
            }
            return -1;

            }catch (Exception e){
                return -1;
            }
        }
    
 
    public static void main(String[] args) {
        try{
           
            
        
           String TarifaBase = "";
            double vehiculoEntra = 0; 
            String tipoVehiculo = "";
            String Estudiante = "";
            int HorasPArqueadero = 0;
            int montoDelParqueadero = 0; 
            int PrecioParqueadero = 0;

            double descuento;
            switch (Estudiante) {
                case "C":
                if (PrecioParqueadero == 5000)descuento = 0.05;
                else if(PrecioParqueadero == 5000)descuento = 0.30;
                           
                break;
                }
            switch (Estudiante) {
                case "M":
                if (PrecioParqueadero == 3000)descuento = 0.05;
                else if (PrecioParqueadero == 3000)descuento = 0.30;
                    break;
                switch (Estudiante) {
                    case "B":
                     if (PrecioParqueadero == 1000)descuento = 0.05; 
                        else if (PrecioParqueadero == 1000)descuento = 0.30;
                        break;
                }
                return valor PrecioParqueadero * descuento;
            }

            

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingerese C para carro, Ingrese M para moto, Ingrese B para biciclieta");
            tipoVehiculo = sc.nextLine();
            System.out.println("Calcular horas en el parqueadero");
            HorasPArqueadero = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese 1 si es estudiante, ingrese 2 si no");
            Estudiante = sc.nextLine();
            


            }




        }
        
        
        
            
        





        }
    

    

    /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------



    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

