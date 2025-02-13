package semester2P1;

public class Fungsi25 {
    static int[][] stok = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}   
    };

    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 
    static int[] penguranganStok = {1, 2, 0, 5};

    public static double[] hitungPendapatan(int[][] stok, int[] harga) {
        double[] pendapatan = new double[stok.length];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < harga.length; j++) {
                pendapatan[i] += stok[i][j] * harga[j];
            }
        }
        return pendapatan;
    }

    public static int[][] updateStok(int[][] stok, int[] penguranganStok){
        int[][] stokKurang = new int[namaBunga.length][4];
        for (int i = 3; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {

                stokKurang[i][j] = stok[i][j] -penguranganStok[j];
            }
        }
        return stokKurang;
    }

    public static void main(String[] args) {
        System.out.println("Total Pendapatan Jika Semua Stok Terjual ");
        for (int i = 0; i < 4; i++) {
            System.out.println("RoyalGarden " + (i+1) + ": " + hitungPendapatan(stok, hargaBunga)[i]);
        }

        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Total Stok Bunga "+ namaBunga[j]+" RoyalGarden 4 setelah pengurangan karena bunga mati:" + updateStok(stok, penguranganStok)[i][j]);
                
            }
        }
    }
}
