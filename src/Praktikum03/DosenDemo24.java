package Praktikum03;
import java.util.Scanner;
public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();
        Dosen24[] arrDosen = new Dosen24[jmlDosen];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            jenisKelamin = (jk == 'L' || jk == 'l'); 
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
            arrDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }
        for (Dosen24 dosen24 : arrDosen) {
            dosen24.cetakInfo();
        }

        DataDosen24 data = new DataDosen24();
        data.dataSemuaDosen(arrDosen);
        data.jumlahDosenPerJenisKelamin(arrDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrDosen);
        data.infoDosenPalingTua(arrDosen);
        data.infoDosenPalingMuda(arrDosen);
    }

}
