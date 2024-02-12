/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otrosejemplos;
import java.util.Scanner;  // Importa la clase Scanner
/**
 *
 * @author Sara Llanos Morea
 */
public class EjemploPedirDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingresar altura de la persona en cm");
        String alturaDeLaPersona = scanner.nextLine();
        System.out.println("la altura de la persona es: " + alturaDeLaPersona);
        
        System.out.println("Ingresar el peso de la persona en kg");
        String pesoDeLaPersona = scanner.nextLine();
        System.out.println("el peso de la persona es: " + pesoDeLaPersona);
        
        System.out.println("Peso: " + pesoDeLaPersona  +  ". Altura: " + alturaDeLaPersona + ".");
        
        

                
    }
    
}
