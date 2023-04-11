package juanjose;

import java.util.Scanner;

public class Vender {

    Scanner entrada = new Scanner(System.in);

    //variables

    int codigoProductoComparar = 0;
    int opc = 0;
    boolean existe = false;
    String cliente;

    Vender(int cantidadComprar,int filaProductosCreados, int codigoProductosCreados,int filaVentas, int filaFactura, String productos[][], String ventas [][], String factura[][]){
        System.out.println("---------Menu ventas---------");
        System.out.println("  ");

        System.out.print("Digite el nombre del cliente: ");
        cliente = entrada.nextLine();
        
        System.out.print("Digite el codigo del producto:");
        codigoProductoComparar = entrada.nextInt();


        for(int i = 0; i < filaProductosCreados; i++){
            if(codigoProductoComparar == Integer.parseInt(productos[i][0])){
                System.out.print("Digite la cantidad que desea comprar: ");
                cantidadComprar = entrada.nextInt();

                int subtotal = 0;
                subtotal = cantidadComprar* (Integer.parseInt(productos[i][2]));
                System.out.println("Subtotal: "+ subtotal);
            }
        }
    } 
}