package Pertemuan14;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24(){
        this.dataMahasiswa = new Mahasiswa24[10];
    }

    void populateData (Mahasiswa24 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void add(Mahasiswa24 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }


}
