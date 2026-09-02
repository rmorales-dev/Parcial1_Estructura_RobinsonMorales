
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos U = new Metodos();
        Boolean continuar = true;
        System.out.println("Ingrese el tamaño del almacen: ");
        int n = sc.nextInt();

        while (continuar) {
            System.out.println("Bienvenido al Almacen de Productos");
            System.out.println("que desea realizar: ");
            System.out.println("1) Llenar almacen 1: ");
            System.out.println("8) Salir ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    //MEtodo1l;
                    break;
                case 8:
                    System.out.println("Gracias por usar el sistema. ");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida. ");
                    break;

            }
        }
    }
}