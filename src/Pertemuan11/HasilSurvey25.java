package Pertemuan11;

import java.util.Scanner;

public class HasilSurvey25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, rata2Responden, rata2Pertanyaan, rata2Total;
        int[][] survey = new int[10][6];

       for (int i = 0; i < survey.length; i++) {
        System.out.println("Input nilai dari responden " + (i+1));
        double totalPerResponden = 0;

        for (int j = 0; j < survey[i].length; j++) {
            System.out.print("Nilai pertanyaan ke-" + (j+1) + " (1-5): ");
            survey[i][j] = sc.nextInt();
            totalPerResponden += survey[i][j];
           
        }
        rata2Responden = totalPerResponden/6;
        System.out.println("Rata-rata nilai responden " + (i+1) + ": " + rata2Responden);
       }
       System.out.println("=================================");
       System.out.println("Rata-rata nilai setiap Pertanyaan");

       for (int j = 0; j < 6; j++) {
        double totalPerPertanyaan = 0;

        for (int i = 0; i < 10; i++) {
            totalPerPertanyaan += survey[i][j];
        }
        rata2Pertanyaan = totalPerPertanyaan/2;
        System.out.println("Rata-rata nilai pertanyaan ke-" + (j+1) + ": " + rata2Pertanyaan);
       }
       
       for (int[] baris : survey) {
        for (int nilai : baris) {
            total += nilai;
        }
       }
       rata2Total = total/60;
       System.out.println("Rata-rata nilai keseluruhan: " + rata2Total);
    }
}
