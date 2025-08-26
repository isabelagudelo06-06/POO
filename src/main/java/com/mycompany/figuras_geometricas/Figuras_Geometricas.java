/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras_geometricas;

/**
 *
 * @author macintosh
 */
public class Figuras_Geometricas {

    public static void main(String[] args) {
       
        Punto p = new Punto(434, 345);
        p.imprimir();
        
        Linea l = new Linea(567, 456, 987, 123);
        p.imprimir();
        
        Circulo c = new Circulo(543, 653, 745);
        c.imprimir();
        
        Rectangulo r = new Rectangulo(387, 231, 673, 809);
        r.imprimir();
        
        Cuadrado cuadr = new Cuadrado(564, 056, 435);
        cuadr.imprimir();
        
        Punto3D punto3D = new Punto3D(345, 673, 972);
        punto3D.imprimir();
    }
}
