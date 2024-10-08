/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {

    public Mobil(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak dengan kecepatan maksimal " + kecepatanMaksimal + " km/jam.");
    }
}

