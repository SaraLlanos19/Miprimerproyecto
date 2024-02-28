/**
 * 
 * Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
 * de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
 * 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
 * cualquiera por la compra de su aparato. El IVA es del 19%.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Sara Llanos Morea 20232218161
 */
public class ReproductorMusica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuánto vale el producto sin IVA que esta comprando?:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Que marca es el producto?:");
        String marca = scanner.nextLine();
        
        if (precio >= 500){
            double porcentajeDescuento = 0.10;
            double descuento = precio * porcentajeDescuento;
            precio = precio - descuento;            
        }
        if (marca.equals("NOSY")){
            double descuentoMarca= precio * 0.05;
            precio = precio - descuentoMarca;
        }
        
        double impuestoIva = precio * 0.19;
        precio = precio + impuestoIva;
        System.out.println("Usted pagará con Iva incluido esto:" + precio); 
        
   }
    
}
