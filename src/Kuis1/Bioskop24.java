package Kuis1;

public class Bioskop24 {
    String noTiket;
    String judul;
    int hargaTiket;
    int durasi;
    int kapasitas;

    void tampilkanInfo(){
        System.out.println("=======INFORMASI TIKET=======");
        System.out.println("No Tiket : " + noTiket);
        System.out.println("Judul Film : " + judul);
        System.out.println("Harga Tiket : Rp" + hargaTiket);
        System.out.println("Durasi Film : " + durasi + " menit");
        System.out.println("Kapasistas Bioskop : " + kapasitas + " orang");
    }

    int ubahHarga(int harga){
        hargaTiket = harga;
        return harga;
    }

    int ubahKapasitas(int capasity){
        kapasitas = capasity;
        return capasity;
    }

    public Bioskop24(){

    }
    public Bioskop24(String idTiket, String nama, int harga, int durasi, int capasity){
        noTiket = idTiket;
        judul = nama;
        this.hargaTiket = harga;
        this.durasi = durasi;
        this.kapasitas = capasity;
    }
}
