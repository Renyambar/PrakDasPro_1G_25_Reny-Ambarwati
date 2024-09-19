package Pertemuan4;
import java.util.Scanner;
public class Kuis25 {
    public static void main(String[] args) {
       Scanner quiz = new Scanner(System.in);
       int tglBerangkat25, blnBerangkat25, thnBerangkat25, tglPulang25, blnPulang25, thnPulang25, tanggal25, bulan25, tahun25;
       
       System.out.println("Nama\t: Reny Ambarwati"); 
       System.out.println("NIM\t: 244107020066");
       System.out.println("Absen\t: 25");
       System.out.println("============QUIZ 1 TI - 1G=============");
       System.out.print("Masukkan tanggal berangkat:");
       tglBerangkat25 = quiz.nextInt();
       System.out.print("Masukkan bulan berangkat:"); 
       blnBerangkat25 = quiz.nextInt();
       System.out.print("Masukkan tahun berangkat:");
       thnBerangkat25 = quiz.nextInt();
       System.out.println("tanggal berangkat : " + tglBerangkat25 + "-" + blnBerangkat25 + "-" + thnBerangkat25);

       System.out.print("Masukkan tanggal pulang:");
       tglPulang25 = quiz.nextInt();
       System.out.print("Masukkan bulan pulang:");
       blnPulang25 = quiz.nextInt();
       System.out.print("Masukkan tahun pulang:");
       thnPulang25 = quiz.nextInt();
       System.out.println("tanggal kepulangan : " + tglPulang25 + "-" + blnPulang25 + "-" + thnPulang25);

       tanggal25 = tglPulang25 - tglBerangkat25;
       bulan25 = blnPulang25 - blnBerangkat25;
       tahun25 = thnPulang25 - thnBerangkat25;
       System.out.println("Lama Student Exchange Anda adalah : " + tahun25 + " tahun " + bulan25 + " bulan " + tanggal25 + " hari ");

    }
}
