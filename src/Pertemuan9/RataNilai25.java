package Pertemuan9;
import java.util.Scanner;
public class RataNilai25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, j, nilaiMhs, input;
    float nilai, totalNilai, rataNilai;
    i = 1;
    while (i <= 5) {
    System.out.print("Input Nilai Mahasiswa ke ");
    input = sc.nextInt();
    totalNilai = 0;     
    for (j = 1; j <= 5; j++) {
        System.out.print("Nilai ke-" + j + " = ");
        nilaiMhs = sc.nextInt();
        totalNilai += nilaiMhs;
    }
    rataNilai = totalNilai/5;
    System.out.println("Rata-rata Nilai ke " + i + " adalah " + rataNilai);
    i++;
}
    }
}
