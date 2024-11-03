package Pertemuan10;
import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double totalLulus = 0, totalTdkLulus = 0;
     double rata2Lulus, rata2TdkLulus;
     int lulus = 0, jmlMahasiswa, tidakLulus = 0;

     System.out.print("Masukkan jumlah mahasiswa : ");
     jmlMahasiswa = sc.nextInt();
     
     int[] nilaiMhs = new int[jmlMahasiswa];
     for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs[i] = sc.nextInt();
     }
     for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i] > 70) {
         totalLulus += nilaiMhs[i];
         lulus++;
        }
        if (nilaiMhs[i] <= 70) {
         totalTdkLulus += nilaiMhs[i];
         tidakLulus++;
        }
     }
     rata2Lulus = totalLulus/lulus;
     rata2TdkLulus = totalTdkLulus/tidakLulus; 
     System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
     System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}
 