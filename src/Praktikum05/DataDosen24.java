package Praktikum05;
public class DataDosen24 {
    Dosen24[] dataDsn = new Dosen24[5];
    int idx = 0;

    void tambah(Dosen24 dsn){
        if (idx < dataDsn.length) {
            dataDsn[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil (){
        for (int i = 0; i < idx; i++) {
            dataDsn[i].tampil();
        }
        System.out.println("------------------");
    }

    void bubbleSortASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDsn[j-1].usia>dataDsn[j].usia) {
                    Dosen24 temp = dataDsn[j];
                    dataDsn[j]=dataDsn[j-1];
                    dataDsn[j-1]=temp;
                } 
            }
        }
    }

    void selectionSortDESC(){
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDsn[j].usia > dataDsn[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen24 temp = dataDsn[maxIdx];
            dataDsn[maxIdx] = dataDsn[i];
            dataDsn[i] = temp;
        }
    }

    void insertionSortDESC(){
        for (int i = 1; i < idx; i++) {
            Dosen24 temp = dataDsn[i];
            int j = i - 1;
            while (j >= 0 && dataDsn[j].usia < temp.usia) {
                dataDsn[j + 1] = dataDsn[j];
                j--;
            }
            dataDsn[j + 1] = temp;
        }
    }
}
