/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

import javax.swing.JOptionPane;

/**
 *
 * @author Sara Llanos Morea
 */
public class EjemploWhile {
    public static void main(String[] args) {
      
        double x, p=1;
        int n, i;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite la base: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente: "));
        if (n>=0){
            i=1; //Debo darle valor a la variable que va a servir como contador antes de entrar al bucle.
            while(i<=n){
                p*=x;
                i++; //Aquí modifico el contador porque sino entonces me quedaría un bucle infinito.
            }
        }
        else{
            i=-1;
            while(i>=n){
                p*=1/x;
                i--;
            }
        }
        System.out.println("La potencia es = " + p);

    
    
 //Numeros aleatorios
  //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
  for(int k=1; k<=5;k++){
      int na = (int) (Math.random() * 10) + 1;
      
  }
  
}
}
