package Praktikum05;
import java.util.Scanner;
public class DosenMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen24 data = new DataDosen24();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Cari Dosen Berdasarkan Nama");
            System.out.println("7. Cari Dosen Berdasarkan Usia");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 
                    Dosen24 d = new Dosen24(kode, nama, jenisKelamin, usia);
                    data.tambah(d);
                    break;
                case 2:
                    System.out.println("Data Dosen:");
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSortASC();
                    data.tampil();
                    break;
                case 4:
                    data.selectionSortDESC();
                    data.tampil();
                    break;
                case 5:
                    data.insertionSortDESC();
                    data.tampil();
                    break;
                case 6:
                    System.out.println("--------------------------------");
                    System.out.println("Pencarian Dosen Berdasarkan Nama");
                    System.out.println("--------------------------------");
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaDsn = sc.nextLine();
                    data.PencarianDataSequential(namaDsn);
                    break;
                case 7:
                    System.out.println("--------------------------------");
                    System.out.println("Pencarian Dosen Berdasarkan Usia");
                    System.out.println("--------------------------------");
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.CariDataBerdasarkanUsia(cariUsia);
                    sc.close();
                case 8:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
