package semester2P2;
public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode MK: "+ kodeMK);
        System.out.println("Nama: "+ nama);
        System.out.println("SKS: " +sks);
        System.out.println("Jumlah jam: "+ jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }
    public MataKuliah24(){
    }
    public MataKuliah24(String kode, String nm, int sks, int jumlahJam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
}
