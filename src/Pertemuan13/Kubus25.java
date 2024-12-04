package Pertemuan13;

import java.util.Scanner;

public class Kubus25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, LP;
        System.out.print("Masukkan panjang sisi(cm): ");
        int s = sc.nextInt();

        V = hitungVolume(s);
        System.out.println("Volume kubus: " + V);
        LP = hitungLP(s);
        System.out.println("Luas Permukaan Kubus: "+ LP);
    }
    static int hitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    static int hitungLP(int s){
        int LP = s*s*6;
        return LP;
    }
}
