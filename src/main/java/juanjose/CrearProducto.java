package juanjose;

import java.util.Scanner;
public class CrearProducto {
    
    Scanner entrada = new Scanner(System.in);
    String productosCrear [][];

    CrearProducto(int filaProductosCreados, int codigoProductosCreados, String productos[][]){

        System.out.println("----------Crear producto----------");        
        System.out.println(" ");
        System.out.print("Digite la descripcion del producto:");
        String descripcion = entrada.nextLine();

        System.out.print("Digite el valor del producto:");
        String valor = entrada.nextLine();

        System.out.print("El codigo asignado a su producto es: "+ codigoProductosCreados);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        productos [filaProductosCreados][1] = descripcion;
        productos [filaProductosCreados][2] = valor;
        productos [filaProductosCreados][0] = ""+codigoProductosCreados;

        this.productosCrear = productos;
    }
}
