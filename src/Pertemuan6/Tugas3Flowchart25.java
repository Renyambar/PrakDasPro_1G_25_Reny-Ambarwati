package Pertemuan6;
import java.util.Scanner;
public class Tugas3Flowchart25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String merk, kategori;
        int ukuran = 0, hargaSepatu;
        System.out.print("Masukkan merk sepatu(Convers, Sketcher, Nike) : ");
        merk = input25.nextLine();
        System.out.print("Masukkan kategori sepatu : ");
        kategori = input25.nextLine();
        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input25.nextInt();

        if (merk.equalsIgnoreCase("convers")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (35 < ukuran && ukuran < 41) {
                    hargaSepatu = 800000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                } else {
                    System.out.println("Ukuran tidak valid");
                }
            }else if (kategori.equalsIgnoreCase("high top")) {
                if (39 < ukuran && ukuran < 45) {
                    hargaSepatu = 1200000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                } else {
                    System.out.println("Ukuran tidak valid");
                }
            } else{
                System.out.println("Kategori tidak valid");
            }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (35 < ukuran && ukuran < 42) {
                    hargaSepatu = 1000000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                }else {
                    System.out.println("Ukuran tidak valid");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (40 < ukuran && ukuran < 45) {
                    hargaSepatu = 1800000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                }else{
                    System.out.println("Ukuran tidak valid");
                }
            } else {
                System.out.println("Kategori tidak valid");
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (35 < ukuran && ukuran < 41) {
                    hargaSepatu = 750000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                }else {
                    System.out.println("Ukuran tidak valid");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (39 < ukuran && ukuran < 45) {
                    hargaSepatu = 1500000;
                    System.out.println("Harga Sepatu : Rp" + hargaSepatu);
                }else {
                    System.out.println("Ukuran tidak valid");
                }
            } else {
                System.out.println("Kategori tidak valid");
            }
        } else {
            System.out.println("Merk sepatu tidak valid");
        }
       
    }
}
