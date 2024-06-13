import java.util.Scanner;

public class Main_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double_Linked_List transactions = new Double_Linked_List();

        // Data Barang Rental
        BarangRental[] daftarKendaraan = {
            new BarangRental("S 4567 VV", "Honda Beat", "Motor", 2017, 10000),
            new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
            new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000),
            new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000),
            new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000)
        };

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan Rental Serba Serbi");
                    System.out.println("+++++++++++++++++++++++");
                    System.out.printf("| %-10s | %-15s | %-10s | %-5s | %-15s |\n", "Nomor TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
                    for (BarangRental namaKendaraan : daftarKendaraan) {
                        namaKendaraan.print();
                    }
                    break;

                case 2:
                    System.out.print("Nama Peminjam: ");
                    String namaPeminjam = scanner.nextLine();
                    System.out.print("Lama Pinjam (hari): ");
                    int lamaPinjam = scanner.nextInt();
                    System.out.println("Pilih Kendaraan:");
                    for (int i = 0; i < daftarKendaraan.length; i++) {
                        System.out.println((i + 1) + ". " + daftarKendaraan[i].namaKendaraan);
                    }
                    System.out.print("Pilih kendaraan (1-5): ");
                    int barangChoice = scanner.nextInt();
                    BarangRental selectedBarang = daftarKendaraan[barangChoice - 1];

                    TransaksiRental transaksi = new TransaksiRental(namaPeminjam, namaPeminjam, lamaPinjam, lamaPinjam, selectedBarang);
                    transactions.addLast(transaksi);
                    break;

                case 3:
                    System.out.println("Daftar Transaksi:");
                    System.out.printf("| %-10s | %-15s | %-15s | %-5s | %-15s |\n", "Kode Transaksi", "Nama Peminjam", "Nomor TNKB", "Lama", "Total Biaya");
                    transactions.displayForward();
                    break;

                case 4:
                    transactions.sortByTNKB();
                    System.out.println("Transaksi telah diurutkan berdasarkan no TNKB.");
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
