package Pertemuan6;
import java.util.Scanner;
public class Tugas1Flowchart25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int bil1, bil2, bil3, maxBil;
        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input25.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input25.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        bil3 = input25.nextInt();

        if (bil1 >= bil2) {
            if (bil1 <= bil3) {
                maxBil = bil3;
            }else {
                maxBil = bil1;
            }
        }else if (bil2 <= bil3) {
            maxBil = bil3;
        }else {
            maxBil = bil2;
        }
        System.out.println("Bilangan terbesar : " + maxBil);
    }
}
