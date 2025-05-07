package Jobsheet9;
public class Surat24 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat24(){

    }

    Surat24(String id, String nama, String kls, char jenis, int durasi){
        idSurat = id;
        namaMahasiswa = nama;
        kelas = kls;
        jenisIzin= jenis;
        this.durasi = durasi;
    }
    
    public void tampil(){
        System.out.println("ID Surat: "+idSurat);
        System.out.println("Nama: "+namaMahasiswa);
        System.out.println("Kelas: "+kelas);
        System.out.println("Jenis Izin: "+jenisIzin);
        System.out.println("Durasi: "+durasi+" jam");
    }
}
