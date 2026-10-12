import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarBuku daftar = new DaftarBuku();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Kode Buku: ");
                    String kode = input.nextLine().trim();
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine().trim();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine().trim();
                    daftar.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    daftar.hapusBukuTerakhir();
                    break;

                case 3:
                    System.out.print("\nMasukkan Kode Buku yang dicari: ");
                    String kodeCari = input.nextLine().trim();
                    daftar.cariBuku(kodeCari);
                    break;

                case 4:
                    daftar.tampilkanSemua();
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
