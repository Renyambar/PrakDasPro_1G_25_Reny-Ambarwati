package semester2P2;
public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dsn = new Dosen24();
        dsn.idDosen = "24";
        dsn.nama= "Reny Ambarwati";
        dsn.statusAktif = true;
        dsn.tahunBergabung = 2020;
        dsn.bidangKeahlian = "Matematika";

        dsn.tampilInformasi();
        dsn.setStatusAktif(true);
        dsn.ubahKeahlian("English");
        dsn.tampilInformasi();
        dsn.setStatusAktif(true);

        Dosen24 dsn2 = new Dosen24("23", "Rafa", false, 2018, "Sistem Operasi");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
    }
}
