package Pertemuan13;

import java.util.Scanner;

public class Kafe25 {
    public static void main(String[] args) {
        Menu();

        Scanner sc = new Scanner(System.in);
        int pilihanMenu, total;
        int banyakItem; int totalKeseluruhan= 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine();

           
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;
            
            System.out.print("Apakah ingin menambah pesanan? ");
            String tambah = sc.nextLine();
            if (tambah.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        switch (kodePromo) {
            case "DISKON50":
                total = totalKeseluruhan - (int)(totalKeseluruhan*0.5);
                break;
            case "DISKON30":
                total = totalKeseluruhan - (int)(totalKeseluruhan*0.3);
                break;
            default:
                total = totalKeseluruhan;
                break;
        }
        
        System.out.println("Total harga untuk pesanan Anda: Rp" + total);
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal;
        hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }

    public static void Menu(){
        System.out.println("Selamat Datang!");

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

