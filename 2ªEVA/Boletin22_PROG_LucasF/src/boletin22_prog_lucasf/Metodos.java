/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin22_prog_lucasf;

public class Metodos {

    private static final int COLUMNAS = 8;
    private static final int JORNADAS = 37;

    int[][] goles;
    int[] jornadas = new int[JORNADAS];

    String[] equipos = {"Barsa", "Madrid", "Celta", "Atletic", "Osasuna", "Betis", "Rayo", "Mallorca"};
    
    public Metodos() {
    this.goles = generarGoles();
    inicializarJornadas(equipos, goles);
}


    // Genero un array bidimensional con la cantidad de goles de cada equipo en cada jornada:
    public int[][] generarGoles() {
        goles = new int[equipos.length][JORNADAS];
        for (int i = 0; i < equipos.length; i++) {
            for (int j = 0; j < JORNADAS; j++) {
                goles[i][j] = (int) (Math.random() * 10);
            }
        }
        return goles;
    }

    // Inicializo el array de jornadas
public void inicializarJornadas(String[] equipos, int[][] goles) {
    int totalEquipos = equipos.length;

    for (int jornada = 0; jornada < COLUMNAS; jornada++) {
        for (int equipoLocal = 0; equipoLocal < totalEquipos; equipoLocal++) {
            int equipoVisitante = (equipoLocal + jornada + 1) % totalEquipos;
            if (jornada < COLUMNAS / 2) {
                goles[equipoLocal][jornada] = (int) (Math.random() * 10);
                goles[equipoVisitante][jornada] = (int) (Math.random() * 10);
            } else {
                goles[equipoLocal][jornada] = goles[equipoVisitante][(jornada - COLUMNAS / 2)];
                goles[equipoVisitante][jornada] = goles[equipoLocal][(jornada - COLUMNAS / 2)];
            }
        }
    }
}


    // Muestro la tabla de goles por cada equipo y jornada:
    public void mostrarTabla(int[] jornadas, String[] equipos, int[][] goles) {
        System.out.print("Equipo/ Jornada |");
        for (int i = 0; i < JORNADAS; i++) {
            System.out.printf("  J%d", jornadas[i]);
        }
        System.out.println();

        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%-15s | ", equipos[i]);
            for (int j = 0; j < JORNADAS; j++) {
                System.out.printf("  %d", goles[i][j]);
            }
            System.out.println();
        }
    }

    // Muestro la tabla de equipos con la suma total de los goles:
    public void mostrarTablaOrdenada() {
        int[] sumaGoles = new int[equipos.length];
        System.out.println();

        // Suma de los goles de cada equipo:
        for (int i = 0; i < equipos.length; i++) {
            int suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += goles[i][j];
            }
            sumaGoles[i] = suma;
        }

        // Ordeno los equipos por goles:
        ordenarEquiposPorGoles(sumaGoles);

        // Muestro la tabla ordenada:
        System.out.println("\nTabla ordenada por goles de forma ascendente:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%-15s %d%n", equipos[i], sumaGoles[i]);
        }
    }

    // Ordeno los equipos en función de la suma de sus goles:
    private void ordenarEquiposPorGoles(int[] sumaGoles) {
        for (int i = 0; i < equipos.length - 1; i++) {
            for (int j = i + 1; j < equipos.length; j++) {
                if (sumaGoles[i] < sumaGoles[j]) {
                    int tempSuma = sumaGoles[i];
                    sumaGoles[i] = sumaGoles[j];
                    sumaGoles[j] = tempSuma;
                    String tempEquipo = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = tempEquipo;

                    int[] tempGoles = goles[i];
                    goles[i] = goles[j];
                    goles[j] = tempGoles;
                }
            }
        }
    }

// Máximo goleador por jornada:
    public void maximoGoleadorPorJornada() {
        System.out.println();
        for (int i = 0; i < JORNADAS; i++) {
            int maxGoles = 0;
            for (int j = 0; j < equipos.length; j++) {
                maxGoles = Math.max(maxGoles, goles[j][i]);
            }
            System.out.printf("En la jornada %d los goles maximos fueron %d y los marcaron/marco: %n", jornadas[i], maxGoles);
            for (int k = 0; k < equipos.length; k++) {
                if (goles[k][i] == maxGoles) {
                    System.out.println(equipos[k]);
                }
            }
        }
    }

// Equipo con más goles en una jornada concreta:
    public void equipoMaxGolJornada(int jornada) {
        int maxGoles = 0;
        int equipoMaxGoles = -1;

        for (int i = 0; i < equipos.length; i++) {
            if (goles[i][jornada - 1] > maxGoles) {
                maxGoles = goles[i][jornada - 1];
                equipoMaxGoles = i;
            }
        }

        System.out.printf("En la jornada %d, el equipo mas goleador fue %s con %d goles.%n", jornada, equipos[equipoMaxGoles], maxGoles);
    }

// Muestro los equipos que marcaron un número concreto de goles en una jornada cualquiera:
    public void equiposPorGolesEnJornada(int numGoles) {
        boolean encontrado = false;
        for (int i = 0; i < equipos.length; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (numGoles == goles[i][j]) {
                    System.out.printf("Los %d goles los marco en la %d jornada y fue %s%n", numGoles, jornadas[j], equipos[i]);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Nadie marco esa cantidad");
        }
    }
}
