/**
 * BarangRental
 */
public class BarangRental {

    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
       }
    
    public void print() {
        System.out.printf("| %-10s | %-15s | %-10s | %-5d | %d |\n", noTNKB, namaKendaraan, jenisKendaraan, tahun, biayaSewa);
    }
}