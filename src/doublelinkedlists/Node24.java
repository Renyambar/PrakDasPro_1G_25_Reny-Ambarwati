package doublelinkedlists;
public class Node24 {
    int  data;
    Node24 next, prev;

    Node24(Node24 prev, int data, Node24 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    String no;
    String nama;

    public Node24(String no, String nama) {
        this.no = no;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}
