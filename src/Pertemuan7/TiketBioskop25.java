package Pertemuan7;
import java.util.Scanner;
public class TiketBioskop25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int tiketTerjual, hargaTiket = 50000, totalTiket = 0;
        double totalPenjualan = 0, diskon = 0, totalHarga = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau '0' untuk mengakhiri): ");
            tiketTerjual = input25.nextInt();
            if (tiketTerjual == 0) {
                break;
            }
            if (tiketTerjual < 0) {
                System.out.println("Jumlah tiket tidak valid. silakan masukkan kembali");
                continue;
            }
            if (tiketTerjual > 10) {
                diskon = 0.15;
            } else if (tiketTerjual > 4) {
                diskon = 0.1;
            }
            totalHarga = tiketTerjual * hargaTiket * (1 - diskon);
            totalTiket += tiketTerjual;
            totalPenjualan += totalHarga;
        } while (true);
        System.out.println("Total tiket yang terjual adalah " + totalTiket + " tiket");
        System.out.println("Total penjualan tiket adalah Rp " + totalPenjualan);
    }
}
