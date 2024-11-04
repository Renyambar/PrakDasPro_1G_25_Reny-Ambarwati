package Pertemuan10;
import java.util.Scanner;
public class Kafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int totalHarga = 0;
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();

        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + ": ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
            totalHarga += hargaPesanan[i];
        }  
        System.out.println();
        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i+1) + ". " + namaPesanan[i] + ": Rp" + hargaPesanan[i]);
        }
        System.out.println("Total harga: Rp" + totalHarga);
    }
}
