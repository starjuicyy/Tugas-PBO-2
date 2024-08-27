/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika2;

/**
 *
 * @author Bintang
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        MatematikaCanggih mathCanggih = new MatematikaCanggih();

        // Uji class matematika
        System.out.println("Penjumlahan 2 + 3: " + math.tambah(2, 3));
        System.out.println("Penjumlahan 2.5 + 3.5: " + math.tambah(2.5, 3.5));
        System.out.println("Penjumlahan 1 + 2 + 3: " + math.tambah(1, 2, 3));
        
        System.out.println("Pengurangan 5 - 2: " + math.kurang(5, 2));
        System.out.println("Pengurangan 10 - 3 - 2: " + math.kurang(10, 3, 2));
        
        System.out.println("Perkalian 3 * 4: " + math.kali(3, 4));
        System.out.println("Perkalian 2 * 3 * 4: " + math.kali(2, 3, 4));
        
        System.out.println("Pembagian 10 / 2: " + math.bagi(10, 2));
        System.out.println("Pembagian 20 / 2 / 2: " + math.bagi(20, 2, 2));
        
        System.out.println("Modulus 10 % 3: " + math.modulus(10, 3));
        System.out.println("Modulus 20 % 5 % 3: " + math.modulus(20, 5, 3));

        // Uji class matematika canggih
        System.out.println("Perpangkatan 2^3: " + mathCanggih.pangkat(2, 3));
        System.out.println("Perpangkatan 2^3^2: " + mathCanggih.pangkat(2, 3, 2));
        System.out.println("Akar kuadrat dari 16: " + mathCanggih.akar(16));
        System.out.println("Akar pangkat 3 dari 27: " + mathCanggih.akar(27, 3));
    }
}

