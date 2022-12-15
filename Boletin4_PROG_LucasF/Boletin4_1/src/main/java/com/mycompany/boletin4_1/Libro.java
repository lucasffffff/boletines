/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin4_1;

/**
 *
 * @author lucas
 */
public class Libro {
  private String titulo;
  private String autor;
  private int ano;
  private short numPaginas;
  private float valoracion;
  
  // Construtor por defecto
  public Libro() {
    // Inicializamos os atributos co seu valor por defecto
    this.titulo = "";
    this.autor = "";
    this.ano = 0;
    this.numPaginas = 0;
    this.valoracion = 0;
  }
  
  // Construtor que permite inicializar o título, autor, ano e número de páxinas
  public Libro(String titulo, String autor, int ano, short numPaginas) {
    // Inicializamos os atributos coos valores pasados como parámetros
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.numPaginas = numPaginas;
    this.valoracion = 0;
  }
  
  // Método de acceso para o atributo "titulo"
  public String getTitulo() {
    return this.titulo;
  }
  
  // Método de acceso para o atributo "autor"
  public String getAutor() {
    return this.autor;
  }
  
  // Método de acceso para o atributo "ano"
  public int getAno() {
    return this.ano;
  }
  
  // Método de acceso para o atributo "numPaginas"
  public short getNumPaginas() {
    return this.numPaginas;
  }
  
  // Método de acceso para o atributo "valoracion"
  public float getValoracion() {
    return this.valoracion;
  }
  
  // Método que permite establecer o valor do atributo "titulo"
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  // Método que permite establecer o valor do atributo "autor"
  public void setAutor(String autor) {
    this.autor = autor;
  }
  
  // Método que permite establecer o valor do atributo "ano"
  public void setAno(int ano) {
    this.ano = ano;
  }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
  
    public void mostrarLibro() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Año: " + this.ano);
    System.out.println("Número de páginas: " + this.numPaginas);
    System.out.println("Valoración: " + this.valoracion);
  }

}


