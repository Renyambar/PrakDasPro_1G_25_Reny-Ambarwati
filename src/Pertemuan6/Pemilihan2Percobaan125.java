package Pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan Tahun: ");
        tahun = input25.nextInt();
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
