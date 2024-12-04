package Pertemuan13;

import java.util.Scanner;

public class PenjualanCafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] jml =new int[][]{
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        while (true) {
            System.out.println("Menu: ");
            System.out.println("0. Exit");
            System.out.println("1. Tampilkan rekap data penjualan");
            System.out.println("2. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("3. Tampilkan rata rata penjualan setiap menu");
            System.out.print("Pilih menu: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    tampilData(menu, jml);
                    break;
                case 2:
                    System.out.println("Menu dengan penjualan tertinggi adalah "+ menu[maxMenu(menu, jml)]);
                    break;
                case 3:
                    hitungRata(menu, jml);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    //menampilkan data
    static void tampilData(String[] menu, int[][] jml){
        System.out.println("============REKAP PENJUALAN CAFE==================");
        System.out.print("\t\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-"+ (i+1)+"\t");
        }
        System.out.println();
        
        for (int i = 0; i < menu.length; i++) {
            System.out.print(String.format("%-16s", menu[i]));
            for (int j = 0; j < jml[i].length; j++) {
                System.out.print(jml[i][j]+ "\t\t");
            }
            System.out.println();
        }
    }
    //menampilkan menu penjualan tertinggi
    static int maxMenu (String[] menu, int[][] jml){
        int  maxMenu = 0, max = 0;
        for (int i = 0; i < jml.length; i++) {
            int jmlMenu = 0;
            for (int j = 0; j < jml[i].length; j++) {
            jmlMenu += jml[i][j];
            }
              if (jmlMenu > maxMenu) {
                maxMenu = jmlMenu;
                max = i;
            }
        }
    return max;
    }
    //rata rata penjualan setiap menu
    static int hitungRata(String[] menu, int[][] jml){
        int rataPerMenu = 0;
        for (int j = 0; j < jml.length; j++) {
            int jmlPerMenu = 0;
            for (int i = 0; i < jml[j].length; i++) {
                jmlPerMenu += jml[j][i];
            }
           rataPerMenu = jmlPerMenu/7;
           System.out.println("Rata rata penjualan "+ menu[j] +": "+rataPerMenu+ "/hari");
        }
        return rataPerMenu;
    }
}
