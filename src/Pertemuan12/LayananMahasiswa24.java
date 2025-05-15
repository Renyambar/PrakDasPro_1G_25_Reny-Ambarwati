package Pertemuan12;
import java.util.Scanner;
public class LayananMahasiswa24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Antrian24 antri = new Antrian24(5);
        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Menampilkan Antrian Terdepan");
            System.out.println("4. Menampilkan Antrian Terakhir");
            System.out.println("5. Jumlah Mahasiswa yang masih antri");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mhs24 mhs = new Mhs24(nim, nama, prodi, kelas);
                    antri.tambahAntrian(mhs);
                    break;
                case 2 :
                    antri.proses();
                    break;
                case 3: 
                    Mhs24 front = antri.peekFront();
                    if (front != null) {
                        System.out.println("Mahasiswa Terdepan: ");
                        front.tampilkanData();
                    }
                    break;
                case 4:
                    Mhs24 rear = antri.peekRear();
                    System.out.println("Mahasiswa Terakhir: ");
                    if (rear != null) {
                        rear.tampilkanData();
                    }
                    break;
                case 5:
                    antri.jmlAntrian();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
}
