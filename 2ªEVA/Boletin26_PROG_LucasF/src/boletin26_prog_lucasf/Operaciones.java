package boletin26_prog_lucasf;

/**
 *
 * @author lucas
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Operaciones<T> {

    public T minimo(Collection<T> lista) {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("Lista vacia");
        }
        Iterator<T> iterador = lista.iterator();
        T min = iterador.next();
        while (iterador.hasNext()) {
            T elem = iterador.next();
            if (((Comparable<T>) elem).compareTo(min) < 0) {
                min = elem;
            }
        }
        return min;
    }

    public T maximo(Collection<T> lista) {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("Lista vacia");
        }
        Iterator<T> iterador = lista.iterator();
        T max = iterador.next();
        while (iterador.hasNext()) {
            T elem = iterador.next();
            if (((Comparable<T>) elem).compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }

    public int buscar(Collection<T> lista, T elemento) {
        Iterator<T> iterador = lista.iterator();
        int i = 0;
        while (iterador.hasNext()) {
            T elem = iterador.next();
            if (elem.equals(elemento)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public T eliminar(Collection<T> lista, T elemento) {
        Iterator<T> iterador = lista.iterator();
        while (iterador.hasNext()) {
            T elem = iterador.next();
            if (elem.equals(elemento)) {
                iterador.remove();
                return elem;
            }
        }
        return null;
    }
}
