package Jobsheet9;
public class StackSurat24 {
    Surat24[] stack;
    int top;
    int size;
    Surat24 s = new Surat24();

    public StackSurat24(){}

    public StackSurat24(int size){
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat24 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat24 pop(){
        if (!isEmpty()) {
            Surat24 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stck kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat24 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosng! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" +stack[i].durasi);
        }
        System.out.println("");
    }

    public void cari(String cari){
        boolean ditemukan = false;
        for (int i = 0; i < top; i++) {
            if (stack[i] != null && stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                System.out.println("Surat Izin Ditemukan");
                stack[i].tampil();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin tidak ditemukan");
        } 
    }
}
