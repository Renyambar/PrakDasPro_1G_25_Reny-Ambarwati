package Pertemuan3;
import java.util.Scanner;
public class Siakad25 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String nama, nim;
       char kelas;
       byte absen;
       double nilaiKuis,nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

       System.out.print("Masukkan nama: ");
       nama = sc.nextLine();
       System.out.print("Masukkan NIM: ");
       nim = sc.nextLine();
       System.out.print("Masukkan kelas: ");
       kelas = sc.nextLine().charAt(0);
       System.out.print("Masukkan nomor absen:");
       absen = sc.nextByte();
       System.out.print("Masukkan nilai kuis: ");
       nilaiKuis = sc.nextDouble();
       System.out.print("Masukkan nilai tugas: ");
       nilaiTugas = sc.nextDouble();
       System.out.print("Masukkan nilai UTS: ");
       nilaiUTS = sc.nextDouble();
       System.out.print("Masukkan nilai UAS: ");
       nilaiUAS = sc.nextDouble();

       nilaiAkhir = ((0.2 * nilaiKuis) + (0.15 * nilaiTugas) + (0.3 * nilaiUTS) + (0.35 * nilaiUAS));

       System.out.println("Nama: " + nama + "NIM: " + nim);
       System.out.println("Kelas: " + kelas + "Absen: " + absen);
       System.out.println("Nilai Akhir: " + nilaiAkhir);
    } 
}
