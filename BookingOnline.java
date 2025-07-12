public class BookingOnline extends Booking {
    public BookingOnline(String nama, String noHP, Tiket tiket, int jumlah) {
        super(nama, noHP, tiket, jumlah);
    }

    @Override
    public void tampilkanRincian() {
        super.tampilkanRincian();
        System.out.println("[Pemesanan dilakukan secara online]");
    }
}