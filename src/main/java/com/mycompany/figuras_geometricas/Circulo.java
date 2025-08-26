/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Circulo {
    
    private float coordenadaSupIzqX;
    private float coordenadaSupIzqY;
    private float radio;

    public Circulo(float coordenadaSupIzqX, float coordenadaSupIzqY, float radio) {
        this.coordenadaSupIzqX = coordenadaSupIzqX;
        this.coordenadaSupIzqY = coordenadaSupIzqY;
        this.radio = radio;
    }
    
    public void imprimir(){
        System.out.println("Esquina: x= " + coordenadaSupIzqX + " Esquina: y= " + coordenadaSupIzqY + " Radio:" + radio + "\n");
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

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    
}
