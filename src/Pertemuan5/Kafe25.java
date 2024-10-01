package Pertemuan5;
import java.util.Scanner;
public class Kafe25 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      Scanner sc = new Scanner(System.in); 
      int jmlKopi, jmlTeh, jmlRoti;
      double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
      double diskon = 0.1;
      String member;

      System.out.print("Masukkan jumlah pembelian kopi: ");
      jmlKopi = input.nextInt();
      System.out.print("Masukkan jumlah pembelian teh: ");
      jmlTeh = input.nextInt();
      System.out.print("Masukkan jumlah pembelian roti: ");
      jmlRoti = input.nextInt();
      totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
      System.out.print("Apakah pelanggan merupakan member(ya /tidak)?");
      member = sc.nextLine();
      switch (member.toLowerCase()) {
        case "ya":
        nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println("Keanggotaan pelanggan: " + member);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " +  nominalBayar );
          break;
        default:
      System.out.println("Keanggotaan pelanggan: " + member);
      System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
      System.out.println("Nominal bayar Rp " +  totalHarga);
      }
    }
}
