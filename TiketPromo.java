public class TiketPromo extends Tiket {
    private double diskon;

    public TiketPromo(String kode, String tujuan, double harga, double diskon) {
        super(kode, tujuan, harga);
        this.diskon = diskon;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Setelah Diskon: Rp" + getHarga());
    }

    @Override
    public double getHarga() {
        return harga - (harga * diskon / 100);
    }

    // Mutator
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    // Accessor
    public double getDiskon() {
        return diskon;
    }
}