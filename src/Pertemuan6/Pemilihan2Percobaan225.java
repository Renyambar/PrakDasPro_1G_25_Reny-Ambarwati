package Pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String member, jenisPembayaran;
        int pilihan_menu;
        double diskon, harga, total_bayar, potongan;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input25.nextInt();
        input25.nextLine();
        System.out.print("Apakah punya member (y/n) ? ");
        member = input25.nextLine();
        System.out.print("Jenis Pembayaran : ");
        jenisPembayaran = input25.nextLine();
        System.out.println("----------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
           
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            
            } else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar = " + total_bayar);
        
            
        } else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}
