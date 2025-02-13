package semester2P1;

import java.util.Scanner;

public class Perulangan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        long NIM = sc.nextLong();
        long n = NIM % 100;
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            int bil = i % 2;
            if (bil == 0) {
                if (i == 4 || i == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(i+" ");
                }
            } else {
                System.out.print("* ");
            }
            
        }
    }
    
}
