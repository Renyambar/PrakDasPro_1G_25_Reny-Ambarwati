package Pertemuan12;

public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa24(){}

    Mahasiswa24(String nm, String name, String kls, double ip){
        nim = nm;
        nama= name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
       System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" +ipk);
    }
}
