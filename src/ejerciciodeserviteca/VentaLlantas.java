/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeserviteca;

import java.util.Scanner;

/**En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
 *
 * @author Sara Llanos Morea 20232218161
 */
public class VentaLlantas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Buenos dias, cuantas llantas desea llevar:");
    
    int llantas = sc.nextInt();
    
    int precio = 0;
    
    
    
    if(llantas <5){
    precio = (llantas * 100);
    }
    
    else if (llantas >= 5  &&  llantas <= 10){
    precio = (llantas * 75);
    }
    
    else if (llantas > 10){
    precio = (llantas * 50);    
    }
    
    System.out.println("total de dinero por cada una de las llantas:" + precio);
    
    }
    
}
