import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah pemesanan: ");
            int total = input.nextInt();
            input.nextLine(); // konsumsi enter

            Booking[] bookings = new Booking[total];

            for (int i = 0; i < total; i++) {
                System.out.println("\n=== Pemesanan ke-" + (i + 1) + " ===");

                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("No HP: ");
                String noHP = input.nextLine();

                System.out.println("\nPilih Jenis Tiket:");
                System.out.println("1. Reguler");
                System.out.println("2. Promo");
                System.out.print("Pilihan (1/2): ");
                int pilihan = input.nextInt();

                Tiket tiket;
                if (pilihan == 2) {
                    tiket = new TiketPromo("B002", "Banjarmasin - Surabaya", 200000, 10);
                } else {
                    tiket = new Tiket("B001", "Banjarmasin - Jakarta", 250000);
                }

                System.out.print("Jumlah Tiket: ");
                int jumlah = input.nextInt();
                input.nextLine(); // konsumsi enter

                if (jumlah <= 0) throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0!");

                bookings[i] = new BookingOnline(nama, noHP, tiket, jumlah);
            }

            // Menampilkan semua pemesanan
            System.out.println("\n=== Ringkasan Semua Pemesanan ===");
            for (Booking b : bookings) {
                b.tampilkanRincian();
                System.out.println("-------------------------");
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}