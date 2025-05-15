package Pertemuan12;
public class SSLMain24 {
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa24 mhs2 = new Mahasiswa24("24212201", "Bimon", "1B", 3.8);
        Mahasiswa24 mhs3 = new Mahasiswa24("24212202", "Cintia", "1C", 3.5);
        Mahasiswa24 mhs4 = new Mahasiswa24("24212203", "Dirga", "1D", 3.6);

        SingleLinkedList24 sll = new SingleLinkedList24();
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa Bimon berada pada index:  "+sll.indexOf("bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
