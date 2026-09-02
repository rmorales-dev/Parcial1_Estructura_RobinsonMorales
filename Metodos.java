import java.util.Scanner;

public class Metodos {
    public ObjDeportista[] IngresarInformacion(ObjDeportista[] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Ingrese el nombre del deportista: ");
            String nombre = sc.next();
            System.out.println("Ingrese numero de participante: ");
            int NumParticipante = sc.nextInt();
            System.out.println("Ingrese el tiempo obtenido: ");
            Double Tiempo = sc.nextDouble();
            ObjDeportista o = new ObjDeportista(nombre, NumParticipante, Tiempo);
            a[i]= o;
        }//cierra for
        return a;
    }//cierra metodo ingresar

    public ObjDeportista[] OrdenarMenorAMayor(ObjDeportista[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].getTiempoObtenido() > a[j + 1].getTiempoObtenido()) {
                    // Intercambiar
                    ObjDeportista temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }//cierra if
            }//cierra for 2
        }//cierra for 1
        return a;
    }//cierra metodo ordenar

    public void VerResultados(ObjDeportista[] a) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Resultados de la carrera: ");
        ObjDeportista[] ordenado = OrdenarMenorAMayor(a);
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println("Posicion " + (i + 1) + ": " + ordenado[i].getNombre() + 
                             " : participante con el numero: " + ordenado[i].getNumeroParticipante() + 
                             " y tiempo: " + ordenado[i].getTiempoObtenido());
        }//cierra for
    }//cierra metodo ver resultados

}
