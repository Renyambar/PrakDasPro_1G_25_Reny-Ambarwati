package Pertemuan13;

public class PengunjungCafe25 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    public static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
       for (String daftar : namaPengunjung) {
        System.out.println("- "+ daftar);
       }
    }
}
