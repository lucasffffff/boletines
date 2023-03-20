package boletin26_prog_lucasf;

/**
 *
 * @author lucas
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boletin26_PROG_LucasF {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 7, 2, 1, 9, 4, 6));

        Operaciones<Integer> operaciones = new Operaciones<>();

        System.out.println("Minimo: " + operaciones.minimo(lista));
        System.out.println("Maximo: " + operaciones.maximo(lista));
        System.out.println("Posicion del 1: " + operaciones.buscar(lista, 1));
        System.out.println("Posicion del 8: " + operaciones.buscar(lista, 8));

        Integer eliminado = operaciones.eliminar(lista, 4);
        if (eliminado != null) {
            System.out.println("Se ha elimoinado el elemento " + eliminado);
        } else {
            System.out.println("No se encuentra el elemento a eliminar");
        }

        System.out.println("Lista tras eliminar: " + lista);
    }
}

