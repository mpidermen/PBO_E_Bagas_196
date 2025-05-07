import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Buku
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Anggota
        Anggota anggota1 = new Anggota("Bagas", "E196");
        Anggota anggota2 = new Anggota("Ridlo", "E212");

        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();
        System.out.println();

        // Pinjam buku
        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);
        System.out.println();

        // Kembalikan buku
        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
        System.out.println();
    }
}
