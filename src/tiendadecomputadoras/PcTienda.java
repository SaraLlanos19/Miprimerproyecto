/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadecomputadoras;

import java.util.Scanner;

/**En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
 *
 * @author Sara Llanos Morea 20232218161
 */
public class PcTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos dias, que cantidad de computadoras desea?:");
        int computadoras = sc.nextInt();
        
        int precio= 500;
        int descuento= 0;
        int total= 0;
        
        if (computadoras < 5){
        precio = computadoras * 500;
        descuento = (int)(precio * 0.10);
        total = precio - descuento;
      
        }else if (computadoras >= 5 && computadoras < 10 ){
        precio = computadoras * 500;
        descuento = (int)(precio * 0.20);
        total = precio - descuento;
        
        }else if (computadoras >= 10){
        precio = computadoras * 500;
        descuento = (int)(precio * 0.40);
        total = precio - descuento;
        
        }
        System.out.println("El precio total de las computadoras sin el descuento es:" + precio);
        System.out.println("El descuento que se le aplica es:" + descuento );
        System.out.println("El precio total de las computadoras con el descuento es:" + total);
        
        
        
        
        
            
        
        
        
        
                                                                                
       
        
        
                
    }
    
}
