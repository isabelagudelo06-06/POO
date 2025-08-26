/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Rectangulo {
    private float coordenadaSupIzqX;
    private float coordenadaSupIzqY;
    private float ladoUno;
    private float ladoDos;

    public Rectangulo(float coordenadaSupIzqX, float coordenadaSupIzqY, float ladoUno, float ladoDos) {
        this.coordenadaSupIzqX = coordenadaSupIzqX;
        this.coordenadaSupIzqY = coordenadaSupIzqY;
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }
    
    public void imprimir(){
        System.out.println("Esquina: x= " + coordenadaSupIzqX + " Esquina: y= " + coordenadaSupIzqY + "\n");
        System.out.println("Lado #1: " + ladoUno + " Lado #2: " + ladoDos + "\n");
    }

    public float getCoordenadaSupIzqX() {
        return coordenadaSupIzqX;
    }

    public void setCoordenadaSupIzqX(float coordenadaSupIzqX) {
        this.coordenadaSupIzqX = coordenadaSupIzqX;
    }

    public float getCoordenadaSupIzqY() {
        return coordenadaSupIzqY;
    }

    public void setCoordenadaSupIzqY(float coordenadaSupIzqY) {
        this.coordenadaSupIzqY = coordenadaSupIzqY;
    }

    public float getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(float ladoUno) {
        this.ladoUno = ladoUno;
    }

    public float getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(float ladoDos) {
        this.ladoDos = ladoDos;
    }
    
    
    
}
