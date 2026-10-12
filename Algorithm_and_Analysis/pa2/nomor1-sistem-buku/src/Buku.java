// node buat nyimpen data 1 buku, sekaligus nyambung ke buku selanjutnya
public class Buku {
    String kodeBuku;
    String judul;
    String penulis;
    Buku next;

    public Buku(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
