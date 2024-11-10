package Pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n====MENU====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                while (true) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris(1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom(1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Kursi sudah terisi. Silakan masukkan ulang");
                    }
                } else {
                    System.out.println("Baris dan kolom tidak tersedia. Silakan masukkan ulang");
                }
                
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
                    break;
                case 2 :
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1 , j + 1, "***");
                        } else {
                            System.out.printf("Baris %d, Kolom %d, %s\n", i + 1, j + 1, penonton[i][j]);
                        }
                    }
                }
                break;
                case 3 :
                System.out.println("Program selesai");
                return;
                default:
                System.out.println("Menu yang dipilih tidak valid");
                    break;
            }
        }
    }
}
