package Praktikum05;
public class DataDosen24 {
    Dosen24[] dataDsn = new Dosen24[50];
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

    void PencarianDataSequential(String namaDsn){
        boolean ditemukan = false;
        System.out.println("Hasil Pencarian: ");
        for (int i = 0; i < idx; i++) {
            if (dataDsn[i].nama.equalsIgnoreCase(namaDsn)) {
                dataDsn[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama "+namaDsn+" tidak ditemukan");
        }
    }

    int PencarianDataBinary(int cariUsia, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cariUsia ==dataDsn[mid].usia) {
                return mid;
            } else if (dataDsn[mid].usia>cariUsia) {
                return PencarianDataBinary(cariUsia, left, mid-1);
            } else {
                return PencarianDataBinary(cariUsia, mid+1, right);
            }
        }
        return -1;
    }

    void CariDataBerdasarkanUsia(int cariUsia){
        bubbleSortASC();
        System.out.println("Hasil Pencarian: ");
        int pss = PencarianDataBinary(cariUsia, 0, idx-1);

        if (pss != -1) {
            dataDsn[pss].tampil();
            int hasil = 1;
            
            int i = pss - 1;
            while (i >= 0 && dataDsn[i].usia == cariUsia) {
                dataDsn[i].tampil();
                hasil++;
                i--;
            }

            int j = pss + 1;
            while (j < idx && dataDsn[j].usia == cariUsia) {
                dataDsn[j].tampil();
                hasil++;
                j++;
            }

            if (hasil > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia '" + cariUsia + "'!");
            }
        } else {
        System.out.println("Dosen dengan usia '" + cariUsia + "' tidak ditemukan!");
        }
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
