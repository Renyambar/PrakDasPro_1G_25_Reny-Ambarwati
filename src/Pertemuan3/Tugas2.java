package Pertemuan3;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
        int jamKerja, upahPerjam,gajiBonus, gajiPokok, gajiTotal;
        float bonus = 10/100f, pajak = 5/100f;
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = gaji.nextInt();
        System.out.print("Masukkan jumlah upah per jam (Rp): ");
        upahPerjam = gaji.nextInt();
        gajiPokok = jamKerja * upahPerjam;
        gajiBonus = (int) ( gajiPokok + (bonus * gajiPokok));
        gajiTotal = (int) ( gajiBonus - (pajak * gajiBonus));

        System.out.println("Total gaji bulanan karyawan:Rp " + gajiTotal);
    }
    
}
