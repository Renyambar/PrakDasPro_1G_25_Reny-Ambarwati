package semester2P2;
public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk = new MataKuliah24();
        mk.kodeMK = "ALSD";
        mk.nama = "Algoritma dan Struktur Data";
        mk.sks = 2;
        mk.jumlahJam = 4;

        mk.tampilInformasi();
        mk.ubahSKS(3);
        mk.tambahJam(4);
        mk.tampilInformasi();
        MataKuliah24 mk2 = new MataKuliah24("BD", "Basis Data", 3, 6);
        mk2.ubahSKS(2);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
