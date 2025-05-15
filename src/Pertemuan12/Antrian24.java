package Pertemuan12;
public class Antrian24 {
    Node24 front;
    Node24 rear;
    int size;
    int max;

    public Antrian24(int max){
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.max = max;
    }

    public boolean IsEmpty(){
       return front == null || size == 0;
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        } else{
            return false; 
        }
    }

    public void clear(){
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian sudah dikosongkan.");
    }

    public void tambahAntrian(Mhs24 mhs){
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } else {
            Node24 temp = new Node24(mhs, null);
            if (IsEmpty()) {
                front = rear =temp;
            } else {
                rear = rear.next = temp;
            }
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public Mhs24 proses(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa untuk dihapus");
            return null;
        }
        Mhs24 prosesMhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        prosesMhs.tampilkanData();
        System.out.println("sedang diproses");
        return prosesMhs;
    } 

    public Mhs24 peekFront(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return front.data;
    }

    public Mhs24 peekRear(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return rear.data;
    }

    public void jmlAntrian(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Jumlah Antrian saat ini: ");
        Node24 jml = front;
        while (jml != null) {
            jml.data.tampilkanData();
            jml = jml.next;
        }
        System.out.println("Jumlah mahasiswa dalam antrian: "+ size);
    }

}
