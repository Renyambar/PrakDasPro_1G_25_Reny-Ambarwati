package Pertemuan10;
import java.util.Scanner;
public class NilaiMahasiswa25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double rata2;
        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jmlMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jmlMahasiswa];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            }
            int nilaiTerendah = nilaiMhs[0], nilaiTertinggi = nilaiMhs[0];
            for (int nilai : nilaiMhs) {
                total += nilai;
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }
        rata2 = total/jmlMahasiswa;  
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + nilaiMhs[i]);
        }
        System.out.println("Rata-rata nilai mahasiswa: " + rata2);
        System.out.println("Nilai mahasiswa tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai mahasiswa terendah: " + nilaiTerendah);
        }
    }

