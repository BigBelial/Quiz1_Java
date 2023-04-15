package juanjose;

import java.util.Scanner;


public class Vender {

    Scanner entrada = new Scanner(System.in);

    //variables
    int subtotal = 0;
    int codigoProductoComparar = 0;
    int cantidadTotalProductos = 0;
    int opc = 0;
    boolean existe = false;
    String cliente;

    Vender(int cantidadComprar,int filaProductosCreados, int codigoProductosCreados,int filaVentas, int filaFactura, String productos[][], String factura[][]){
        System.out.println("---------Menu ventas---------");
        System.out.println("  ");


        System.out.print("Digite el nombre del cliente: ");
        cliente = entrada.nextLine();
        

        System.out.print("Digite el codigo del producto:");
        codigoProductoComparar = entrada.nextInt();

        
        for(int i = 0; i < filaProductosCreados; i++){


            if(codigoProductoComparar == Integer.parseInt(productos[i][0])){
                System.out.println("Producto: " + productos[i][1]);
                System.out.println("Precio: " + productos[i][2]);
                System.out.print("Digite la cantidad que desea comprar: ");
                cantidadComprar = entrada.nextInt();

                subtotal = cantidadComprar* (Integer.parseInt(productos[i][2]));
                System.out.println("  ");
                System.out.println("factura N° "+ filaFactura);
                System.out.println("  ");
                System.out.println("Cliente: " + cliente);
                System.out.println("  ");
                System.out.println("Subtotal: "+ subtotal);
                System.out.println("  ");

                factura[filaFactura][0] = ""+filaFactura;
               // factura[filaFactura][1] = 

                /*do{
                    System.out.println("1.Si");
                    System.out.println("2.No");

                    switch(opc){
                        case 1:
                        break;
                        default:
                        System.out.println("Opcion incorrecta");
                        break;
                    }
                }while(opc > 0 && opc < 2);*/
            }
            factura[i][0] = ""+filaFactura;
            factura[i][1] = ""+cantidadTotalProductos;
            factura[i][2] = cliente;
            factura[i][4] = ""+codigoProductosCreados;
            //factura[i][5] =
        }    
    }
}