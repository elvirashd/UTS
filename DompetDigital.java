/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author elvira solikha hadi 09040623057
 */
public class DompetDigital extends Transaksi implements Pembayaran {
    private String nomorAkun;
    private String provider;
    private double saldo;

    public DompetDigital(String nomorTransaksi, double nominalTransaksi, String nomorAkun, String provider, double saldo) {
        super(nomorTransaksi, nominalTransaksi);
        this.nomorAkun = nomorAkun;
        this.provider = provider;
        this.saldo = saldo;
    }

    @Override
    public boolean validasiPembayaran() {
        return saldo >= nominalTransaksi;
    }

    @Override
    public void prosesTransaksi() {
        if (validasiPembayaran()) {
            System.out.println("Pembayaran dengan Dompet Digital berhasil untuk transaksi " + nomorTransaksi);
        } else {
            System.out.println("Pembayaran dengan Dompet Digital gagal. Saldo tidak mencukupi.");
        }
    }
}


