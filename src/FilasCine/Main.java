package FilasCine;
import FilasCine.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuLista();
    }

    public static void menuLista() {
        Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Abrir programa" +
                "\n 2. Cerrar programa");

        int opcion = sc.nextInt();
        do {
            System.out.println("1. Agregue una pelicula  " +
                    "\n 2. Ingresar al cine " +
                    "\n 3. Verificar la cartelera " +
                    "\n 4. Buscar entradas disponibles 1" +
                    "\n 5. Eliminar la pelicula seleccionada" +
                    "\n 6. comprar la lista" +
                    "\n Seleccione una opción");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    lista.crearLista();
                    break;
                case 2:
                    lista.tamanioLista();
                case 3:
                    lista.estavacia();
                    break;
                case 4:
                    lista.buscarElemento();
                    break;
                case 5:
                    lista.eliminarElemento();
                    break;
                case 6:
                    lista.compararListas();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 2);

    }

}
