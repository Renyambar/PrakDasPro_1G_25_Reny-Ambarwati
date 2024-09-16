package Pertemuan3;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
        double jamKerja, upahPerjam, gajiPokok, gajiBonus, gajiTotal;

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = gaji.nextDouble();
        System.out.print("Masukkan jumlah upah per jam (Rp): ");
        upahPerjam = gaji.nextDouble();
        gajiPokok = jamKerja * upahPerjam;
        gajiBonus = gajiPokok + (0.1 * gajiPokok);
        gajiTotal = gajiBonus - (0.05 * gajiBonus);

        System.out.println("Total gaji bulanan karyawan:Rp " + gajiTotal);
    }
    
}
