/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

/**
 *
 * @author Sara Llanos Morea
 */
import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("numero 1:");
        num1 = sc.nextInt();
        System.out.println("numero 2:");
        num2 = sc.nextInt();
        System.out.println("Suma = " +(num1+num2));
        
    }
    
}
