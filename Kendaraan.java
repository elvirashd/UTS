/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    protected int kecepatanMaksimal;

    public Kendaraan(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void bergerak() {
        System.out.println("Kendaraan bergerak dengan kecepatan tidak diketahui.");
    }

    public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }
}

