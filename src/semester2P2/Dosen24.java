package semester2P2;
public class Dosen24 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung,masaKerja, thnSkrg = 2025;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama : "+ nama);
        System.out.println("Tahun Bergabung: "+ tahunBergabung);
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(thnSkrg));
    }
    void setStatusAktif(boolean status){
        if (status == true) {
          System.out.println("Status Dosen : Aktif");
        } else {
          System.out.println("Status Dosen: Tidak Aktif");
        }
    }
    int hitungMasaKerja(int thnSkrg){
        if (statusAktif = true) {
            masaKerja = thnSkrg - tahunBergabung;
        } else {
            masaKerja = 0;
        }
        return masaKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        return;
    }
    public Dosen24(){

    }
    public Dosen24(String id, String nm, boolean status, int thn, String bidang){
        idDosen = id;
        nama = nm;
        this.statusAktif =  status;
        this.tahunBergabung = thn;
        this.bidangKeahlian = bidang;

    }
}
