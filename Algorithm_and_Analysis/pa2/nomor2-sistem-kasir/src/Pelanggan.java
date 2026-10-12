// node buat nyimpen data 1 pelanggan, dipakai bareng di queue maupun stack
public class Pelanggan {
    String nomorAntrian;
    String namaPelanggan;
    double totalBelanja;
    Pelanggan next;

    public Pelanggan(String nomorAntrian, String namaPelanggan, double totalBelanja) {
        this.nomorAntrian = nomorAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja = totalBelanja;
        this.next = null;
    }
}
