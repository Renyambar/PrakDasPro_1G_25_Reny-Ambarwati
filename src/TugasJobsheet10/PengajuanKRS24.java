package TugasJobsheet10;
import java.util.Scanner;
public class PengajuanKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS24 antrian = new AntrianKRS24(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memproses KRS 2 Mahasiswa");
            System.out.println("3. Tampilkan 2 Antrian Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Jumlah Mahasiswa yang sudah Diproses");
            System.out.println("7. Tampilkan Antrian Terakhir");
            System.out.println("8. Jumlah Mahasiswa yang belum Diproses");
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
                    Mahasiswa24 mhs = new Mahasiswa24(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.proses2KRS();
                    break;
                case 3:
                    antrian.tampilkan2Terdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.JumlahAntrian());
                    break;
                case 6:
                    antrian.jumlahDiproses();
                    break;
                case 7: 
                    antrian.AntrianTerakhir();
                    break;
                case 8:
                    antrian.jumlahBelumProses();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                default:
                    System.out.println("");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
