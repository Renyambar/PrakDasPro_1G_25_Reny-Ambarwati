package Pertemuan13;

import java.util.Scanner;

public class Kafe25 {
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat Datang, "+ namaPelanggan+ "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Berikan diskon 50%");
                break;
            case "DISKON30":
                System.out.println("Berikan diskon 30%");
                break;
            default:
            System.out.println("Kode Invalid");
                break;
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    
    }
    }

