/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3poo;

/**
 *
 * @author USER
 */
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Poligono{" + "numeroLados=" + numeroLados + '}';
    }
    
    //Declaramos el metodo area como abstracto
    public abstract double area();
    
    
}
