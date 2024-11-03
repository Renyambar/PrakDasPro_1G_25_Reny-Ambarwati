package Pertemuan10;
import java.util.Scanner;;
public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlElemen = sc.nextInt();
        
        int[] arrNilai = new int[jmlElemen];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);  
        } else {
            System.out.println("Nilai yang dicaari tidak ditemukan");
        }
        System.out.println();
    }
}
