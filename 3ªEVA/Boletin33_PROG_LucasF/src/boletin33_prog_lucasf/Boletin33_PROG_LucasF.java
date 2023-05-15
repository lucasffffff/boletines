package boletin33_prog_lucasf;

/**
 *
 * @author lucas
 */

public class Boletin33_PROG_LucasF {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista("Lionel", "Messi", 10, 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador("Pep", "Guardiola", 1, 50, "123456");
        Masajista masajista = new Masajista("Carlos", "González", 2, 40, "Licenciado en Fisioterapia", 10);
        Seleccionador seleccionador = new Seleccionador("Jorge", "Sampaoli", 3, 55);

        llamada(futbolista);
        llamada(entrenador);
        llamada(masajista);
        llamada(seleccionador);
    }
    
    public static void llamada(SeleccionFutbol obxF) {
        obxF.concentrarse();
        obxF.viajar();
        obxF.entrenar();
        obxF.jugarPartido();
        System.out.println(obxF.toString());
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
