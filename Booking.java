public class Booking {
    protected String nama;
    protected String noHP;
    protected Tiket tiket;
    protected int jumlah;

    public Booking(String nama, String noHP, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.noHP = noHP;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return tiket.getHarga() * jumlah;
    }

    public void tampilkanRincian() {
        System.out.println("\n=== Ringkasan Pemesanan ===");
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("No HP: " + noHP);
        tiket.tampilkanInfo();
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Bayar: Rp" + hitungTotal());
    }
}