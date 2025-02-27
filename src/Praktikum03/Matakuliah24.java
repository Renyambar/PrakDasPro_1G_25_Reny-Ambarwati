package Praktikum03;

import java.util.Scanner;

public class Matakuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah24(){

    }

    public Matakuliah24(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
     void tambahData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode : ");
        this.kode = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        this.nama = sc.nextLine();
        System.out.print("Masukkan SKS: ");
        this.sks = sc.nextInt();
        System.out.print("Masukkan Jumlah Jam : ");
        this.jumlahJam = sc.nextInt();
        sc.close();
    }
    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("------------------------------");
    }
}
