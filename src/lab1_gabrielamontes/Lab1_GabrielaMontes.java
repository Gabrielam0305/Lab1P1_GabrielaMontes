package lab1_gabrielamontes;

import java.util.Scanner;

public class Lab1_GabrielaMontes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("--Bienvenido al sistema calculo promedio");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine ();
        
        //Se ingresan las notas de las cuatro clases
        System. out. print ("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System. out. print ("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
    
        System. out. print ("Ingrese la nota final de la tercera Clase: ");
        double terceraClase = entrada.nextDouble();
        
        System. out. print ("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //se calcula el promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        // se imprime el calculo del promedio
        System.out.println ("-- " + nombre + "el promedio de las cuatro clases es: " + promedio);
        
    }
    
}
