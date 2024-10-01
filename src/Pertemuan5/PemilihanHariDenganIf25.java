package Pertemuan5;
import java.util.Scanner;
public class PemilihanHariDenganIf25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari;

        System.out.print("Masukkan angka: ");
        hari = sc.nextInt();

        if (hari >= 1 && 5 >= hari) {
            System.out.println("weekday");
        }else if (hari == 6 || hari == 7 ) {
            System.out.println("weekend");
        }else {
            System.out.println("Invalid number");
        }
    }
}
