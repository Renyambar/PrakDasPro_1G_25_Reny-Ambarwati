package semester2P1;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiSetara[]= new double[8];
        String MK[] = new String[8];
        int nilai[] = new int[8];
        int bobotSKS[] = new int[8];
        String nilaiHuruf[] = new String[8];
        int jmlSKS = 0, jmlSetara=0;



        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nama MK " + (i+1) + ": ");
            MK[i] = sc.nextLine();
        }

        for (int i = 0; i < bobotSKS.length; i++) {
            System.out.print("Masukkan bobot SKS " + (MK[i]) + ": ");
            bobotSKS[i] = sc.nextInt();
            jmlSKS+=i;
        }
        sc.nextLine();

        for (int i = 0; i < nilaiHuruf.length; i++) {
            System.out.print("Masukkan nilai huruf " + (MK[i]) + ": ");
            nilaiHuruf[i] = sc.nextLine();
            if (nilaiHuruf[i].equalsIgnoreCase("A")){
                nilaiSetara[i] = 4;
            }else if (nilaiHuruf[i].equalsIgnoreCase("B+")){
                nilaiSetara[i] = 3.5;
            }else if (nilaiHuruf[i].equalsIgnoreCase("B")) {
                nilaiSetara[i] = 3;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C")) {
                nilaiSetara[i] = 2;
            } else if (nilaiHuruf[i].equalsIgnoreCase("D")) {
                nilaiSetara[i] = 1;
            } else {
                nilaiSetara[i] = 0;
            }
           jmlSetara += (nilaiSetara[i] * bobotSKS[i]);

            }

            double IP = jmlSetara / jmlSKS;

        
        System.out.println("===========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==========================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + (MK[i]) + ": ");
            nilai[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiHuruf.length; i++) {
            
        }

        System.out.println("=================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("=================");

        System.out.println("MK \t");

        for (int i = 0; i < MK.length; i++) {
            System.out.print(MK[i]+"\t");
            System.out.print(nilai[i] + "\t");
            System.out.print(nilaiHuruf[i]+"\t");
            System.out.print(nilaiSetara[i]+"\t");

            System.out.println();
        }

        System.out.println("===================");
        System.out.println("IP Semester : " + IP);


    }  
}

        