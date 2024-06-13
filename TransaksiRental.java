/**
 * TransaksiRental
 */
public class TransaksiRental {

    String kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;

    public TransaksiRental(String kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;  
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }

    public void print() {
        System.out.printf("| %-10d | %-15s | %-15s | %-5d | %-15.2f |\n", kodeTransaksi, namaPeminjam, br.noTNKB, lamaPinjam, totalBiaya);
    }
}