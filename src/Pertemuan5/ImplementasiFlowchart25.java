package Pertemuan5;
import java.util.Scanner;
public class ImplementasiFlowchart25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlM1, jmlM2, jmlM3;
        double hargaM1, hargaM2, hargaM3, totalBelanja, totalBayar;

        System.out.print("Jumlah pesanan nasi goreng: ");
        jmlM1 = sc.nextInt();
        System.out.print("Masukkan harga nasi goreng: ");
        hargaM1 = sc.nextDouble();
        System.out.print("Jumlah pesanan mie rebus: ");
        jmlM2 = sc.nextInt();
        System.out.print("Masukkan harga mie rebus: ");
        hargaM2 = sc.nextDouble();
        System.out.print("Jumlah pesanan fuyunghai: ");
        jmlM3 = sc.nextInt();
        System.out.print("Masukkan harga fuyunghai: ");
        hargaM3 = sc.nextDouble();

        totalBelanja = (jmlM1 * hargaM1) + (jmlM2 * hargaM2) + (jmlM3 * hargaM3);

        if (totalBelanja > 500000) {
            totalBayar = totalBelanja - (0.1 * totalBelanja);
            System.out.println("Total Bayar: Rp " + totalBayar);
        }else if (totalBelanja > 200000) {
            totalBayar = totalBelanja - (0.05 * totalBelanja);
            System.out.println("Total Bayar: Rp " + totalBayar);
        }else if (totalBelanja > 100000) {
            totalBayar = totalBelanja - (0.02 * totalBelanja);
            System.out.println("Total Bayar: Rp " + totalBayar);
        }else {
            System.out.println("Total Bayar: Rp " + totalBelanja);
        }
    }
}
