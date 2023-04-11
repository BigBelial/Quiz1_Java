package juanjose;

import java.util.Scanner;

public class Menu 
{

    Scanner scanner = new Scanner(System.in);


    //variables

    String productos [][] = new String [20][3]; 
    String ventas [][] = new String [20][9];
    String factura[][] = new String [20][9];

    int filaProductosCreados = 0;
    int codigoProductosCreados = 1;
    int filaVentas = 0;
    int filaFactura = 0;
    int cantidadComprar = 0;
    

    int opc = 0;



    //Metodo constructor



    Menu(){
        menu();
    }


    //Implementacion menu Switch case


    void menu(){
        do{
            System.out.println("1.Crear un producto");
            System.out.println("2.Mostrar productos");
            System.out.println("3.Vender");
            System.out.println("4.Buscar factura");
            System.out.println("5.Cuadre de caja");
            System.out.println("6.Salir");
            
            opc = scanner.nextInt();


            switch (opc) {
                case 1 :
                LimpiarPantalla();
                CrearProducto();
                break;
                
                case 2 :
                LimpiarPantalla();
                MostrarProductos();
                break;
                
                case 3 :
                LimpiarPantalla();
                Vender();
                    break;
                
                case 4 :
            
                    break;
                
                case 5: 
                

                    break;

                default:
                    break;
            }


        }while(opc >0 && opc < 7);
    }

    public void CrearProducto(){
        CrearProducto c = new CrearProducto(filaProductosCreados, codigoProductosCreados, productos);   
        productos = c.productosCrear;
        filaProductosCreados++;
        codigoProductosCreados++;
    }

    public void MostrarProductos(){
        new MostrarProductos(productos, filaProductosCreados);
    }

    public void Vender(){
        new Vender(cantidadComprar, filaProductosCreados, codigoProductosCreados, filaVentas, filaFactura, productos, ventas, factura);
    }


    public void LimpiarPantalla(){ 
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public static void main( String[] args )
    {
        new Menu();
    }
}
