package Pertemuan14;

public class BinaryTree24 {
    Node24 root;

    public BinaryTree24(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add (Mahasiswa24 mahasiswa){
        Node24 newNode = new Node24(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node24 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node24 node){
        if (node!= null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node24 node){
        if ( node != null) {
            traverseInOrder(node.left);
            traverseInOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node24 getSuccessor(Node24 del){
        Node24 successor = del.right;
        Node24 successorParrent = del;
        while (successor.left != null) {
            successorParrent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParrent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;

                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else if (current .right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRekursif(Mahasiswa24 data) {
        root = addRekursif(root, data);
    }

    Node24 addRekursif(Node24 current, Mahasiswa24 mahasiswa) {
        if (current == null) {
            return new Node24(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    Mahasiswa24 cariMinIPK() {
        if (root == null) 
        return null;
        Node24 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    Mahasiswa24 cariMaxIPK() {
        if (root == null) 
        return null;
        Node24 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(Node24 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    

}
