/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika2;

/**
 *
 * @author Bintang
 */
public class MatematikaCanggih extends Matematika {
    // Overloading method perpangkatan
    public int pangkat(int a, int b) {
        return (int) Math.pow(a, b);
    }
    
    public double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    public double pangkat(int a, int b, int c) {
        return Math.pow(Math.pow(a, b), c);
    }

    // Method untuk akar kuadrat
    public double akar(double a) {
        if (a < 0) {
            throw new ArithmeticException("Tidak bisa menghitung akar dari bilangan negatif.");
        }
        return Math.sqrt(a);
    }

    public double akar(double a, double b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Tidak bisa menghitung akar dari bilangan negatif.");
        }
        return Math.pow(a, 1.0/b);
    }
}

