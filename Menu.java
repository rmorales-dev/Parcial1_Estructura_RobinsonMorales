
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos U = new Metodos();
        Boolean continuar = true;
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenido la carrera universitaria");
        System.out.println("Ingrese la cantidad de participantes: ");
        int n = sc.nextInt();
        ObjDeportista[] Deportista = new ObjDeportista[n];

        while (continuar) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Seleccione la opcion desea realizar: ");
            System.out.println("1) Ingresar la informacion de los participantes: ");
            System.out.println("2) Ver los resultados");
            System.out.println("3) Salir ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Deportista = U.IngresarInformacion(Deportista, sc);
                    break;
                case 2:
                    U.VerResultados(Deportista);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema. ");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida. ");
                    break;

            }//cierra switch
        }//cierra while
    }//cierra main
}//cierra clase