/*
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Sara Llanos Morea
 */
public class Fruteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hola, cuántos kilos de manzana desea?:");
        double kilo = scanner.nextDouble();
        
        System.out.println("Ingrese el valor por kilo:");
        double precioPorKilo = scanner.nextDouble();
        
       
        double descuento=0;
        double precioSinDescuento;
        double precioConDescuento= 0;
       
        
        precioSinDescuento= kilo * precioPorKilo;
        
        if(kilo >= 0 && kilo <=2){
            precioSinDescuento= kilo * precioPorKilo;
            descuento= precioSinDescuento * 0;
            precioConDescuento = precioSinDescuento - descuento;
            
        }
        else if(kilo >= 2.01 && kilo <= 5){
            
            descuento= precioSinDescuento * 0.10;
            precioConDescuento = precioSinDescuento - descuento;
           
        }
        else if(kilo >= 5.01 && kilo <= 10){
            
            descuento= precioSinDescuento * 0.15;
            precioConDescuento = precioSinDescuento - descuento;
            
        }
        else if(kilo >= 10.01){
            
            descuento= precioSinDescuento * 0.20;
            precioConDescuento = precioSinDescuento - descuento;
            
        }
        System.out.println("El precio del descuento es de: $" + descuento);
        System.out.println("Su total a pagar con descuento es: $" + precioConDescuento);
    }   
}
