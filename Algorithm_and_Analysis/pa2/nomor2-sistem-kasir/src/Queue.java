// antrian pelanggan (FIFO), pakai linked list dengan batas maksimal 5 orang
public class Queue {
    Pelanggan depan;
    Pelanggan belakang;
    int jumlahAntrian;
    static final int MAKSIMAL_ANTRIAN = 5;

    public Queue() {
        this.depan = null;
        this.belakang = null;
        this.jumlahAntrian = 0;
    }

    // nambah pelanggan baru ke paling belakang antrian
    public void enqueue(String nomorAntrian, String namaPelanggan, double totalBelanja) {
        if (jumlahAntrian >= MAKSIMAL_ANTRIAN) {
            System.out.println("Gagal menambah, antrian sudah penuh (maksimal " + MAKSIMAL_ANTRIAN + " pelanggan)");
            return;
        }

        Pelanggan pelangganBaru = new Pelanggan(nomorAntrian, namaPelanggan, totalBelanja);

        if (depan == null) {
            depan = pelangganBaru;
            belakang = pelangganBaru;
        } else {
            belakang.next = pelangganBaru;
            belakang = pelangganBaru;
        }

        jumlahAntrian++;
        System.out.println("Data pelanggan ditambahkan ke antrian!");
    }

    // ngeluarin pelanggan paling depan buat dilayani
    public Pelanggan dequeue() {
        if (depan == null) {
            System.out.println("Antrian kosong, tidak ada pelanggan untuk dilayani.");
            return null;
        }

        Pelanggan terlayani = depan;
        depan = depan.next;
        if (depan == null) {
            belakang = null;
        }

        jumlahAntrian--;
        return terlayani;
    }

    // tampilin semua pelanggan yang masih ngantri dari depan ke belakang
    public void tampilkanAntrian() {
        if (depan == null) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        System.out.println("Antrian saat ini:");
        Pelanggan sekarang = depan;
        int nomor = 1;
        while (sekarang != null) {
            System.out.println(nomor + ". " + sekarang.nomorAntrian + " - " + sekarang.namaPelanggan + " | Total: Rp" + sekarang.totalBelanja);
            sekarang = sekarang.next;
            nomor++;
        }
        System.out.println("Jumlah antrian: " + jumlahAntrian);
    }
}
