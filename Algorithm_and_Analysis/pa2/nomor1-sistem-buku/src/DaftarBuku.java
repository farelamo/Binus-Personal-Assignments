// single linked list buat ngatur daftar buku perpustakaan
public class DaftarBuku {
    Buku head;
    int jumlahBuku;

    public DaftarBuku() {
        this.head = null;
        this.jumlahBuku = 0;
    }

    // nambah buku baru di akhir daftar, kode bukunya dibatasin max 5 karakter
    public void tambahBuku(String kodeBuku, String judul, String penulis) {
        if (kodeBuku.length() > 5) {
            System.out.println("Gagal nambah, kode buku kepanjangan (maksimal 5 karakter)");
            return;
        }

        Buku bukuBaru = new Buku(kodeBuku, judul, penulis);

        if (head == null) {
            head = bukuBaru;
        } else {
            Buku sekarang = head;
            while (sekarang.next != null) {
                sekarang = sekarang.next;
            }
            sekarang.next = bukuBaru;
        }

        jumlahBuku++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // hapus buku yang paling terakhir masuk (kayak pop di stack)
    public void hapusBukuTerakhir() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        if (head.next == null) {
            System.out.println("Buku \"" + head.judul + "\" berhasil dihapus");
            head = null;
            jumlahBuku--;
            return;
        }

        Buku sekarang = head;
        while (sekarang.next.next != null) {
            sekarang = sekarang.next;
        }

        System.out.println("Buku \"" + sekarang.next.judul + "\" berhasil dihapus");
        sekarang.next = null;
        jumlahBuku--;
    }

    // nyari buku berdasarkan kode bukunya
    public void cariBuku(String kodeBuku) {
        Buku sekarang = head;
        while (sekarang != null) {
            if (sekarang.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan!");
                System.out.println("Kode: " + sekarang.kodeBuku + " | Judul: " + sekarang.judul + " | Penulis: " + sekarang.penulis);
                return;
            }
            sekarang = sekarang.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // tampilin semua buku urut dari yang pertama diinput
    public void tampilkanSemua() {
        if (head == null) {
            System.out.println("Belum ada data buku.");
            return;
        }

        System.out.println("Daftar Buku:");
        Buku sekarang = head;
        while (sekarang != null) {
            System.out.println("Kode: " + sekarang.kodeBuku + " | Judul: " + sekarang.judul + " | Penulis: " + sekarang.penulis);
            sekarang = sekarang.next;
        }
        System.out.println("Total Buku: " + jumlahBuku);
    }
}
