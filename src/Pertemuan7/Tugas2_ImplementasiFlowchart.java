package Pertemuan7;
import java.util.Scanner;
public class Tugas2_ImplementasiFlowchart {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int jenis = 0, durasi = 0, total = 0;
       
        while (true) {
            System.out.print("Masukkan jenis kendaraan(1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input25.nextInt();
            if (jenis == 0) {
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input25.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
            }
            System.out.println("Total tarif parkir adalah Rp " + total);
        }
    }

