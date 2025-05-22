package doublelinkedlists;
import java.util.Scanner;
public class VaksinMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Vaksin24 vaksin = new Vaksin24();
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    String no = sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    vaksin.enqueue(no, nama);
                    break;
                case 2:
                    vaksin.dequeue();
                    break;
                case 3:
                    vaksin.printQueue();
                    break;
                default:
                    break;
            }
        } while (pilihan != 4);
    }
}
