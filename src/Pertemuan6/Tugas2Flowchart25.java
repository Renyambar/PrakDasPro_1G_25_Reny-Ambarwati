package Pertemuan6;
import java.util.Scanner;
public class Tugas2Flowchart25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku, diskon = 0, totalDiskon;
        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input25.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jmlBuku = input25.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jmlBuku > 2) {
                totalDiskon = diskon + 2;
            }else {
                totalDiskon = diskon;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jmlBuku > 3 ) {
            totalDiskon = diskon + 2;
            }else {
            totalDiskon = diskon + 1;
            } 
        }else {
            if (jmlBuku > 3 ) {
                totalDiskon = 5;
            }else {
                totalDiskon = 0;
            }
        }
        System.out.println("Jenis Buku : " + jenisBuku);
        System.out.println("Jumlah Buku : "+ jmlBuku);
        System.out.println("Total Diskon : " + totalDiskon + "%");
        
    }
}
