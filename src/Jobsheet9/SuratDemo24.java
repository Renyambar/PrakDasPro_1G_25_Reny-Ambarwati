package Jobsheet9;
import java.util.Scanner;
public class SuratDemo24 {
    public static void main(String[] args) {
        StackSurat24 stack = new StackSurat24(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("===PENGAJUAN SURAT IZIN===");
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    String izin = sc.nextLine();
                    char kar = izin.charAt(0);
                    System.out.print("Durasi (jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat24 s = new Surat24(id, nama, kls, kar, durasi);
                    stack.push(s);
                    System.out.printf("Surat %s berhasil dikumpulkan", s.namaMahasiswa);
                    System.out.println("");
                    break;
                case 2:
                    Surat24 verif = stack.pop();
                    if (verif!= null) {
                        System.out.println("Memproses surat dari " + verif.namaMahasiswa);
                        System.out.print("Verifikasi surat dari " + verif.namaMahasiswa +"? ");
                        String proses = sc.nextLine();
                        if (proses.equalsIgnoreCase("ya")) {
                            System.out.printf("Surat Izin dari %s sudah diverifikasi.", verif.namaMahasiswa);
                        }
                    }
                    break;
                case 3: 
                    Surat24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh "+lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("Pencarian Surat");
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
