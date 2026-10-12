import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue antrian = new Queue();
        Stack riwayat = new Stack();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Nomor Antrian: ");
                    String nomorAntrian = input.nextLine().trim();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String namaPelanggan = input.nextLine().trim();
                    System.out.print("Masukkan Total Belanja: ");
                    double totalBelanja = Double.parseDouble(input.nextLine().trim());
                    antrian.enqueue(nomorAntrian, namaPelanggan, totalBelanja);
                    break;

                case 2:
                    System.out.println();
                    Pelanggan terlayani = antrian.dequeue();
                    if (terlayani != null) {
                        System.out.println("Melayani pelanggan " + terlayani.nomorAntrian + " (" + terlayani.namaPelanggan + ")");
                        terlayani.next = null;
                        riwayat.push(terlayani);
                    }
                    break;

                case 3:
                    System.out.println();
                    antrian.tampilkanAntrian();
                    break;

                case 4:
                    System.out.println();
                    riwayat.displayRiwayat();
                    break;

                case 5:
                    System.out.println("Program ditutup, sampai jumpa");
                    break;

                default:
                    System.out.println("Menu gaada, coba lagi ya");
            }

        } while (pilihan != 5);

        input.close();
    }
}
