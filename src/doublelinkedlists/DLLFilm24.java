package doublelinkedlists;
public class DLLFilm24 {
    NodeFilm24 head;
    int size;
    public DLLFilm24(){
        head = null;
        size = 0;
    }

    public boolean isEmpty (){
        return head == null;
    }

    public void addFirst(Film24 item){

        if (isEmpty()) {
            head = new NodeFilm24(null, item, null);
        } else {
            NodeFilm24 newNode = new NodeFilm24(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film24 item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeFilm24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm24 newNode = new NodeFilm24(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film24 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            NodeFilm24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev== null) {
                NodeFilm24 newNode = new NodeFilm24(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeFilm24 newNode = new NodeFilm24(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            NodeFilm24 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println( "\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihappus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) { 
            head = null;
            size--;
            return;
        }
        NodeFilm24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception{

        if (isEmpty() || index >= size) {
            throw new Exception("Linked List masih kosong, tidak bisa dihapus!");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeFilm24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void cetak() {
        System.out.println("=================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("=================================");
        NodeFilm24 current = head;
        while (current != null) {
            System.out.println("ID: " + current.data.id);
            System.out.println("Judul Film: " + current.data.judul);
            System.out.println("Rating: " + current.data.rating);
            current = current.next;
        }
    }

    public void searchByID(String key) {
    NodeFilm24 current = head;
    int index = 0;

    while (current != null) {
        if (current.data.id.equalsIgnoreCase(key)) {
            System.out.println("Data ID Film: "+key+ "berada di node ke-" + index+1);
            System.out.println("IDENTITAS:");
            System.out.println("ID: " + current.data.id);
            System.out.println("Judul Film: " + current.data.judul);
            System.out.println("IMDB: " + current.data.rating);
        }
        current = current.next;
        index++;
        } 
    }

    public void sortRatingDesc() {
        if (size < 2) return;
        for (NodeFilm24 i = head; i != null; i = i.next) {
            for (NodeFilm24 j = i.next; j != null; j = j.next) {
                if (i.data.rating < j.data.rating) {
                    Film24 tmp = i.data; 
                    i.data = j.data; 
                    j.data = tmp;
                }
            }
        }
    }
}
