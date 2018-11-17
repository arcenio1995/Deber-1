/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.vista;

import com.jvilatuña.modelo.Coordenadas;
import java.io.PrintStream;

/**
 *
 * @author UseR
 */
public class Aplicación {
    public static void main(String [] args) {
        Coordenadas coor1=new Coordenadas(8,7);
        Coordenadas coor2=new Coordenadas(67,9);
        System.out.println("Obteniedo coordenadas del punto 1: ");
        coor1.verDatos();
        System.out.println("Obteniedo coordenadas del punto 2: ");
        coor2.verDatos();
        System.out.println("Obteniedo las coordenadas del punto 1: "+coor1.getX()+", "+coor1.getY());
        System.out.println("Obteniedo las coordenadas del punto 2: "+coor2.getX()+", "+coor2.getY());
        System.out.println("Obteniedo nuevas coordenadas del punto 2: ");
        coor2.setX(25);
        coor2.setY(45);
        coor2.verDatos();
    }
}

