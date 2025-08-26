/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Cuadrado {
    private float coordenadaSupIzqX;
    private float coordenadaSupIzqY;
    private float lado;

    public Cuadrado(float coordenadaSupIzqX, float coordenadaSupIzqY, float lado) {
        this.coordenadaSupIzqX = coordenadaSupIzqX;
        this.coordenadaSupIzqY = coordenadaSupIzqY;
        this.lado = lado;
    }
    
    public void imprimir(){
        System.out.println("Esquina: x= " + coordenadaSupIzqX + " Esquina: y= " + coordenadaSupIzqY + " Lado: " + lado + "\n");
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

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    
}
