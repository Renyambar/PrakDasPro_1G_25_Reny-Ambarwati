package Pertemuan12;
import java.util.Scanner;
public class SSLMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa24 mhs1 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa24 mhs2 = new Mahasiswa24("24212201", "Bimon", "1B", 3.8);
        Mahasiswa24 mhs3 = new Mahasiswa24("24212202", "Cintia", "1C", 3.5);
        Mahasiswa24 mhs4 = new Mahasiswa24("24212203", "Dirga", "1D", 3.6);

        SingleLinkedList24 sll = new SingleLinkedList24();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);
            System.out.println("1. addFirst");
            System.out.println("2. addLast");
            System.out.println("3. insertAfter ");
            System.out.println("4. inserAt");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    sll.addFirst(mhs);
                    sll.print();
                    break;
                case 2:
                    sll.addLast(mhs);
                    sll.print();
                    break;
                case 3: 
                    System.out.print("Input setelah data: ");
                    String input = sc.nextLine();
                    sll.insertAfter(input, mhs);
                    sll.print();
                    break;
                case 4:
                    System.out.print("Input setelah index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index + 1, mhs);
                    sll.print();
                    break;
                default:
                    break;
            }
        }
        sc.close();
        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}
