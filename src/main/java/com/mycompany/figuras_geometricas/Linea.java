/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Linea {
    
     private float coordenadaX_PuntoUno, coordenadaY_PuntoUno, coordenadaX_PuntoDos, coordenadaY_PuntoDos;

    public Linea(float coordenadaX_PuntoUno, float coordenadaY_PuntoUno, float coordenadaX_PuntoDos, float coordenadaY_PuntoDos) {
        this.coordenadaX_PuntoUno = coordenadaX_PuntoUno;
        this.coordenadaY_PuntoUno = coordenadaY_PuntoUno;
        this.coordenadaX_PuntoDos = coordenadaX_PuntoDos;
        this.coordenadaY_PuntoDos = coordenadaY_PuntoDos;
    }
    
    public void imprimir(){
        System.out.println("Punto #1: x= " + coordenadaX_PuntoUno + " Punto #1: y= " + coordenadaY_PuntoUno + "\n");
        System.out.println("Punto #2: x= " + coordenadaX_PuntoDos + " Punto #2: y= " + coordenadaY_PuntoDos + "\n");
    }

    public float getCoordenadaX_PuntoUno() {
        return coordenadaX_PuntoUno;
    }

    public void setCoordenadaX_PuntoUno(float coordenadaX_PuntoUno) {
        this.coordenadaX_PuntoUno = coordenadaX_PuntoUno;
    }

    public float getCoordenadaY_PuntoUno() {
        return coordenadaY_PuntoUno;
    }

    public void setCoordenadaY_PuntoUno(float coordenadaY_PuntoUno) {
        this.coordenadaY_PuntoUno = coordenadaY_PuntoUno;
    }

    public float getCoordenadaX_PuntoDos() {
        return coordenadaX_PuntoDos;
    }

    public void setCoordenadaX_PuntoDos(float coordenadaX_PuntoDos) {
        this.coordenadaX_PuntoDos = coordenadaX_PuntoDos;
    }

    public float getCoordenadaY_PuntoDos() {
        return coordenadaY_PuntoDos;
    }

    public void setCoordenadaY_PuntoDos(float coordenadaY_PuntoDos) {
        this.coordenadaY_PuntoDos = coordenadaY_PuntoDos;
    }
    
    
    
}
