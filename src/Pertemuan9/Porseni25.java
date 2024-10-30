package Pertemuan9;
import java.util.Scanner;
public class Porseni25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah politeknik yang berpartisipasi: ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (String cabang : cabangOlahraga) {
            System.out.println("Cabang Olahraga: " + cabang);

            for (int i = 1; i <= jmlPoliteknik; i++) {
                System.out.print("Masukkan nama Politeknik ke-" + i + ": ");
                String namaPoliteknik = sc.nextLine();
                System.out.println(" " + namaPoliteknik + ":");

                for (int j = 1; j <= 5; j++) {
                    System.out.print("  Nama Atlet " + j + ": ");
                    String namaAtlet = sc.nextLine();
                    System.out.println("    Atlet " + j + ": " + namaAtlet + " dari " + namaPoliteknik + " di cabang " + cabang);
                }
            }
        }
    }
}
