package TugasJobsheet10;

public class AntrianKRS24 {
    Mahasiswa24[] data;
    int front;
    int rear;
    int max = 10;
    int size;
    int jmlDiproses = 0;

    public AntrianKRS24(int max){
        this.max = max;
        this.data = new Mahasiswa24[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else{
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        } else{
            return false;
        }
    }

    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            jmlDiproses = 0;
            System.out.println("Queue masih dikosongkan");
        } else {
            System.out.println("Queue masih kosng");
        } 
    }

    public void tambahAntrian(Mahasiswa24 mhs){
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public void proses2KRS() {
        if (size < 2) {
            System.out.println("Antrian mahasiswa tidak cukup untuk diproses.");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa24 mhs = data[front];
            front = (front + 1) % max;
            size--;
            jmlDiproses++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int JumlahAntrian(){
        return size;
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah yang sudah proses KRS: " + jmlDiproses);
    }

    public void jumlahBelumProses() {
        int ditangani = 30;
        int blmProses = ditangani - jmlDiproses;
        System.out.println("Jumlah mahasiswa yang belum proses KRS: " + blmProses);
    }

    public void tampilkan2Terdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Dua Mahasiswa Terdepan:");
        int jumlahTampil;
        if (size >= 2) {
            jumlahTampil = 2;
        } else {
            jumlahTampil = size;
        }
    
        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }
    
    public void AntrianTerakhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        }else{
            System.out.print("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
