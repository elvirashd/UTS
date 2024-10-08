/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        Mobil mobil = new Mobil(180);
        SepedaMotor sepedaMotor = new SepedaMotor(120);
        Truk truk = new Truk(100, 5000);

        mobil.bergerak();
        sepedaMotor.bergerak();
        truk.bergerak();
    }
}

