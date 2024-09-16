package Pertemuan3;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner listrik = new Scanner(System.in);
        double tarifListrik = 1500;
        double tagihanListrik, jmlKWh;
        boolean melebihi500;

        System.out.print("Masukkan jumlah penggunaan listrik: ");
        jmlKWh = listrik.nextDouble();
        tagihanListrik = jmlKWh * tarifListrik;
        melebihi500 = jmlKWh > 500;
        
        System.out.println("Jumlah penggunaan listrik: " + jmlKWh + " kWh" );
        System.out.println("Total tagihan listrik:Rp " + tagihanListrik);
        System.out.println("Apakah melebihi 500 kWh?: " + melebihi500);
    }
    
}
