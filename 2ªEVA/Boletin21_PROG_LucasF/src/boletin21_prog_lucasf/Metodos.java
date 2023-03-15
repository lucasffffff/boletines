/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_prog_lucasf;

/**
 *
 * @author lucas
 */
import java.util.Random;
import java.util.Scanner;

public class Metodos {

    // Método para generar un array de números aleatorios del 1 a 50:
    public void arrayAleatorio() {
        int[] aleatorio = new int[6];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 50 + 1);
        }

        for (int i = aleatorio.length - 1; i >= 0; i--) {
            System.out.println(aleatorio[i]);
        }
    }

    // Método para generar un array de 10 notas aleatorias:
    public void arrayNotas() {
        int notas[] = new int[10];
        int aprobados = 0;
        int suspensos = 0;
        int notaMax = 0;
        int media = 0;
        int acumulado = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10 + 1);
            // Calcular la nota máxima
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
            // Calcular el número de aprobados y suspensos
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            // Calcular la suma de las notas para calcular la media
            acumulado += notas[i];
        }

        // Mostrar las notas en orden inverso
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }

        // Calculo y muestro la media, el número de aprobados, el número de suspensos y la nota máxima:
        media = acumulado / notas.length;
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Nota maxima: " + notaMax);
        System.out.println("Media: " + media);
    }

    // Método para generar un array de 30 notas aleatorias y sus correspondientes nombres:
    public void arrayNotas2() {
        int[] notas = new int[30];
        String[] nombres = new String[30];
        Random rand = new Random();

        // Le pongo valores aleatorios a cada elemento del array y creo nombres de alumno:
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(11);
            nombres[i] = "Alumno " + (i + 1);
            //Muestro lo nombre de los alumnos creados:
            System.out.println(nombres[i]);
        }

        // Calculo el número de aprobados y suspensos:
        int aprobados = 0, suspensos = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);

        // Nota media:
        double media = 0;
        for (int nota : notas) {
            media += nota;
        }
        media /= notas.length;
        System.out.println("Media: " + media);
        // Nota maxima:
        int maxNota = notas[0];
        for (int nota : notas) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        System.out.println("Nota mas alta: " + maxNota);
        // Nota de un alumno concreto:
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nomeAluno = sc.nextLine();
        int indice = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nomeAluno)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("Nota: " + notas[indice]);
        } else {
            System.out.println("No se ha encontrado ese alumno.");
        }
// Lista de los alumnos aprobados:
        System.out.print("Alumnos aprobados: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.print(nombres[i] + " ");
            }
        }
        System.out.println();
// Nombres y notas en orden ascendente:
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    int tempNota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNota;

                    String tempNome = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNome;
                }
            }
        }
        System.out.print("Notas ordenadas: ");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.print("Nombres ordenados: ");
        for (String nome : nombres) {
            System.out.print(nome + " ");
        }
        System.out.println();
        //Notas por alumno:
        System.out.print("Nombre alumno: ");
        nomeAluno = sc.nextLine();
        indice = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nomeAluno)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("Nota del alumno: " + notas[indice]);
        } else {
            System.out.println("No se ha encontrado el alumno.");
        }
    }
}
