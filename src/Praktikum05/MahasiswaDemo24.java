package Praktikum05;
import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24(jumMhs);
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim= sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("-----------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("-----------------------------------");
        System.out.println("Menggunakan sequential search");
        System.out.println("-----------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
