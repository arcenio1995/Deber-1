/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.modelo;

/**
 *
 * @author UseR
 */
public class Coordenadas {
    int ejex,ejey;
    public Coordenadas(int x, int y){
        this.ejex=x;
        this.ejey=y;
    }

    public void verDatos(){
        System.out.println("La coordenada en el eje x es: "+ejex);
        System.out.println("La coordenada en el eje y es: "+ejey);
    }
    public int getX(){
       return this.ejex; 
    }
    public int getY(){
       return this.ejey; 
    }
    public void setX(int x){
        this.ejex=x;
    }
    public void setY(int y){
        this.ejey=y;
    }
}
