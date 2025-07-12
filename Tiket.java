public class Tiket {
    protected String kode, tujuan;
    protected double harga;

    public Tiket(String kode, String tujuan, double harga) {
        this.kode = kode;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    // Accessor
    public String getKode() { return kode; }
    public String getTujuan() { return tujuan; }
    public double getHarga() { return harga; }

    // Mutator
    public void setKode(String kode) { this.kode = kode; }
    public void setTujuan(String tujuan) { this.tujuan = tujuan; }
    public void setHarga(double harga) { this.harga = harga; }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga: Rp" + harga);
    }
}