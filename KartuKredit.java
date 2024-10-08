/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author elvira solikha hadi 09040623057
 */
public class KartuKredit extends Transaksi implements Pembayaran {
    private String nomorKartu;
    private String namaPemilik;
    private String tanggalKadaluarsa;
    
    public KartuKredit(String nomorTransaksi, double nominalTransaksi, String nomorKartu, String namaPemilik, String tanggalKadaluarsa) {
        super(nomorTransaksi, nominalTransaksi);
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public boolean validasiPembayaran() {
        return nomorKartu.length() == 16 && (nomorKartu.startsWith("4") || nomorKartu.startsWith("5"));
    }

    @Override
    public void prosesTransaksi() {
        if (validasiPembayaran()) {
            System.out.println("Pembayaran dengan Kartu Kredit berhasil untuk transaksi " + nomorTransaksi);
        } else {
            System.out.println("Pembayaran dengan Kartu Kredit gagal. Nomor kartu tidak valid.");
        }
    }
}
