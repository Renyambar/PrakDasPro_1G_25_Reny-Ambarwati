package Pertemuan10;
import java.util.Scanner;
public class SearchKafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Kopi", "Chocolate Ice", "Ice Cream"};
        System.out.println("Daftar Menu: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        boolean ditemukan = false;
        System.out.print("Masukkan nama makanan yang dicari: ");
        String key = sc.nextLine();
        for (String daftar : menu) {
            if (daftar.equalsIgnoreCase(key)) {
                ditemukan = true;
                break;
            } 
        }
        if (ditemukan) {
            System.out.println("Menu " + key + " tersedia di daftar menu");
        } else {
            System.out.println("Menu " + key + " tidak ada di daftar menu");
        }
    }
}
