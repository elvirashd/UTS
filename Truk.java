/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author ASUS
 */
public class Truk extends Kendaraan {
    private int kapasitasMuatan;

    public Truk(int kecepatanMaksimal, int kapasitasMuatan) {
        super(kecepatanMaksimal);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void bergerak() {
        System.out.println("Truk bergerak dengan kecepatan maksimal " + kecepatanMaksimal + " km/jam dan kapasitas muatan " + kapasitasMuatan + " kg.");
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }
}

