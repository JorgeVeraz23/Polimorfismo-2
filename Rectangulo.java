/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3poo;

/**
 *
 * @author USER
 */
public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +super.toString()+ "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
    @Override
    public double area(){
        return lado1*lado2;
    }
    
    
    
}
