package Praktikum03;
public class DataDosen24 {
    public static void datasemuaDosen(Dosen24[] arrDosen){
        for (Dosen24 dosen24 : arrDosen) {
            dosen24.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen24[] arrDosen){
            int pria = 0, wanita = 0;
            for (Dosen24 dosen : arrDosen) {
            if (dosen.jenisKelamin){
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("-----------------------");
}
    public static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrDosen){
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen24 dosen : arrDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jmlPria++;
            } else {
                totalWanita += dosen.usia;
                jmlWanita++;
            }
        }
       System.out.println("Rata-Rata Usia Dosen : ");
       System.out.println("Usia Dosen Pria : " + totalPria/jmlPria + " tahun");
       System.out.println("Usia Dosen Wanita : " + totalWanita/jmlWanita + " tahun");
       System.out.println("-------------------------------------------");

    }
    public static void infoDosenPalingTua(Dosen24[] arrDosen){
        Dosen24 tertua = arrDosen[0];
        for (Dosen24 dosen : arrDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
        System.out.println("-----------------------------");
    }
    public static void infoDosenPalingMuda(Dosen24[] arrDosen){
        Dosen24 termuda = arrDosen[0];
        for (Dosen24 dosen : arrDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
        System.out.println("------------------------------");
    }
    public static void dataSemuaDosen(Dosen24[] arrDosen) {
        
    }
}

