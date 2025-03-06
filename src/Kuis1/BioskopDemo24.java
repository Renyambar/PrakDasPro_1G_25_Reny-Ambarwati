package Kuis1;

public class BioskopDemo24 {
    public static void main(String[] args) {
       Bioskop24 bios = new Bioskop24();
       bios.noTiket = "00123";
       bios.judul = "Laskar Pelangi";
       bios.hargaTiket = 40000;
       bios.durasi = 120;
       bios.kapasitas = 60;
       
       bios.tampilkanInfo();
       bios.ubahHarga(45000);
       bios.ubahKapasitas(75);
       bios.tampilkanInfo();

       Bioskop24 bios2 = new Bioskop24("00456", "Serendepity", 35000, 115, 80);
       bios2.tampilkanInfo();
       bios2.ubahHarga(50000);
       bios2.ubahKapasitas(50);
       bios2.tampilkanInfo();
    }
}
