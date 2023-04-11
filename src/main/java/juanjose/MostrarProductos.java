package juanjose;

public class MostrarProductos {
    
    MostrarProductos(String productos[][], int filaProductosCreados){
        System.out.println("||Codigo||   ||Descripcion||   ||Valor||");

        for(int i = 0; i < filaProductosCreados ; i++){
            System.out.println("    "+ productos[i][0] + "            "+ productos[i][1]+ "            " + productos[i][2]);
            System.out.println(" ");
        }
    }
}
