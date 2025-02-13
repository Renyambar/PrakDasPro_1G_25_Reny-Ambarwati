package semester2P1;
    import java.util.Scanner;

public class Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTugas = 0, nilaiKuis = 0, nilaiUTS = 0, nilaiUAS;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextInt();
        
        System.out.println("===================");
        System.out.println("===================");
        
        if (nilaiTugas < 0 ||nilaiTugas > 100 ||nilaiKuis < 0 || nilaiKuis > 100 ||nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double nilaiAkhir;
            nilaiAkhir = (nilaiTugas * 0.2)+(nilaiKuis * 0.2)+(nilaiUTS * 0.3)+(nilaiUAS * 0.3);
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : A" );
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : B+" );
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : B" );
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : C+" );
            }else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : C" );
            }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : D" );
            } else if(nilaiAkhir < 39) {
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
                System.out.println("Nilai Huruf : E" );
            }
                System.out.println("=================");
                System.out.println("=================");

            if (nilaiAkhir > 50 && nilaiAkhir<= 100) {
                System.out.println("SELAMAT ANDA LULUS");
            } if (nilaiAkhir <= 50) {
                System.out.println("ANDA TIDAK LULUS");
            }
        }     
    }
}

