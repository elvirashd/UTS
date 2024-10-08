/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author elvira solikha hadi 09040623057
 */
public class TransferBank extends Transaksi implements Pembayaran {
    private String nomorRekening;
    private String bank;

    public TransferBank(String nomorTransaksi, double nominalTransaksi, String nomorRekening, String bank) {
        super(nomorTransaksi, nominalTransaksi);
        this.nomorRekening = nomorRekening;
        this.bank = bank;
    }

    @Override
    public boolean validasiPembayaran() {
        return nomorRekening.length() == 12;
    }

    @Override
    public void prosesTransaksi() {
        if (validasiPembayaran()) {
            System.out.println("Pembayaran dengan Transfer Bank berhasil untuk transaksi " + nomorTransaksi);
        } else {
            System.out.println("Pembayaran dengan Transfer Bank gagal. Nomor rekening tidak valid.");
        }
    }
}


