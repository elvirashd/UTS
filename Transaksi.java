/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author elvira solikha hadi 09040623057
 */
public abstract class Transaksi {
    protected String nomorTransaksi;
    protected double nominalTransaksi;

    public Transaksi(String nomorTransaksi, double nominalTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
        this.nominalTransaksi = nominalTransaksi;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }

    public abstract void prosesTransaksi();
}

