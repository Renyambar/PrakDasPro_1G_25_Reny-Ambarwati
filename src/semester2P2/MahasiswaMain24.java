package semester2P2;
public class MahasiswaMain24 {
    
    public static void main(String[] args) {
        Mahasiswa24 mhsl = new Mahasiswa24();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk (3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nabila", "24141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
