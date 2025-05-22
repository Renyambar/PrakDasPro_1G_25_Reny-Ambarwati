package doublelinkedlists;
import java.util.Scanner;
public class FilmMain24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLLFilm24 film = new DLLFilm24();
        int pilihan, indeks;
        String id, judul;
        double rate;

        do {
            System.out.println("================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("================================");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Posisi Awal");
                    System.out.print("ID Film: ");
                    id = sc.nextLine();
                    System.out.print("Judul Film: ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    rate = sc.nextDouble();
                    sc.nextLine();
                    film.addFirst(new Film24(id, judul, rate));
                    break;
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film: ");
                    id = sc.nextLine();
                    System.out.print("Judul Film: ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    rate = sc.nextDouble();
                    sc.nextLine();
                    film.addLast(new Film24(id, judul, rate));
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("ID Film: ");
                    id = sc.nextLine();
                    System.out.print("Judul Film: ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    rate = sc.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke- ");
                    indeks = sc.nextInt();
                    sc.nextLine();
                    film.add(new Film24(id, judul, rate), indeks);
                    break;
                case 4:
                    film.removeFirst();
                    break;
                case 5:
                    film.removeLast();
                    break;
                case 6:
                    System.out.print("Data Film yang dihapus urutan ke- ");
                    indeks = sc.nextInt();
                    sc.nextLine();
                    film.remove(indeks);
                    break;
                case 7:
                    film.cetak();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    String key = sc.nextLine();
                    film.searchByID(key);
                    break;
                case 9:
                    film.sortRatingDesc();
                    film.cetak();
                    break;
                default:
                    break;
            }       
        } while (pilihan != 10);
        sc.close();
    }
}
