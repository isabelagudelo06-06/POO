/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Punto3D {
    
   private float coordenadaX;
   private float coordenadaY;
   private float coordenadaZ;

    public Punto3D(float coordenadaX, float coordenadaY, float coordenadaZ) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
    }
   
   public void imprimir(){
       System.out.println("x= " + coordenadaX + " y= " + coordenadaY + " z= " + coordenadaZ);
   }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public float getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(float coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }
   
   

}
