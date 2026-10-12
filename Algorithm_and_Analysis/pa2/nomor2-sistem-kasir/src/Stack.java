// riwayat transaksi (LIFO), pakai linked list, transaksi terbaru selalu di paling atas
public class Stack {
    Pelanggan atas;
    int jumlahTransaksi;

    public Stack() {
        this.atas = null;
        this.jumlahTransaksi = 0;
    }

    // taruh transaksi pelanggan yang baru selesai dilayani ke puncak stack
    public void push(Pelanggan pelanggan) {
        pelanggan.next = atas;
        atas = pelanggan;
        jumlahTransaksi++;
        System.out.println("Transaksi disimpan ke riwayat.");
    }

    // tampilin riwayat transaksi dari yang paling baru ke yang paling lama
    public void displayRiwayat() {
        if (atas == null) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }

        System.out.println("Riwayat Transaksi (terbaru ke lama):");
        Pelanggan sekarang = atas;
        int nomor = 1;
        while (sekarang != null) {
            System.out.println(nomor + ". " + sekarang.nomorAntrian + " - " + sekarang.namaPelanggan + " | Total: Rp" + sekarang.totalBelanja);
            sekarang = sekarang.next;
            nomor++;
        }
        System.out.println("Jumlah transaksi: " + jumlahTransaksi);
    }
}
