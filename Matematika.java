/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika2;

/**
 *
 * @author Bintang
 */
public class Matematika {
    // Overloading method penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public double tambah(double a, double b) {
        return a + b;
    }
    
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading method pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public int kurang(int a, int b, int c) {
        return a - b - c;
    }

    // Overloading method perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public int kali(int a, int b, int c) {
        return a * b * c;
    }

    // Overloading method pembagian
    public double bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return (double) a / b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return a / b;
    }

    public double bagi(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return (double) a / b / c;
    }

    // Overloading method modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public int modulus(int a, int b, int c) {
        return a % b % c;
    }
}
