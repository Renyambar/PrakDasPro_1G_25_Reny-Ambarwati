package doublelinkedlists;
public class Vaksin24 {
    Node24 head, tail;
    int size = 0;

    public void enqueue(String no, String nama) {
        Node24 newNode = new Node24(no, nama);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Tidak ada data untuk divaksinasi.");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            size--;
        }
    }

    public void printQueue() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.printf("|%-5s|%-10s|\n", "No.", "Nama");

        Node24 current = head;
        while (current != null) {
            System.out.printf("|%-5s|%-10s|\n", current.no, current.nama);
            current = current.next;
        }

        System.out.println("Sisa Antrian: " + size);
    }
}
