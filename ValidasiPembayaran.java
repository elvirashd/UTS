/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author elvira solikha hadi 09040623057
 */
public class ValidasiPembayaran {
    public static void main(String[] args) {
        KartuKredit kredit = new KartuKredit("2008", 1000000, "4123456789012345", "Budi", "12/24");
        DompetDigital dompet = new DompetDigital("2009", 500000, "0987654321", "GoPay", 1000000);
        TransferBank transfer = new TransferBank("2010", 1500000, "123456789012", "BCA");

        kredit.prosesTransaksi();
        dompet.prosesTransaksi();
        transfer.prosesTransaksi();
    }
}


   

