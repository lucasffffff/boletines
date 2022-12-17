/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author lucas
 */
public class Pelicula extends Multimedia {

    private final String actorPrincipal;
    private final String actrizPrincipal;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + ", actor principal: " + actorPrincipal + ", actriz principal: " + actrizPrincipal;
    }
}
