# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini merupakan sistem pemesanan tiket berbasis Java yang menerima input berupa data pelanggan, pilihan tiket, dan jumlah pemesanan, kemudian menghasilkan output berupa rincian transaksi lengkap seperti jenis tiket, tujuan perjalanan, total pembayaran, dan status pemesanan online.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Booking`, `BookingOnline`, `Main`, `Tiket` dan `TiketPromo` adalah contoh dari class.

```bash
public class Booking { ... }  
public class BookingOnline extends Booking { ... }  
public class Tiket { ... }  
public class TiketPromo extends Tiket { ... }  
public class Main { ... }
```

2. **Object** adalah instance dari class. Pada kode ini, `Booking booking = new BookingOnline(nama, noHP, tiket, jumlah);` adalah contoh pembuatan object.

```bash
Booking booking = new BookingOnline(nama, noHP, tiket, jumlah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `noHP`, `jumlah`, `kode`, dan `tujuan` adalah contoh atribut.

```bash
protected String nama;  
protected String noHP;  
protected int jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Booking` dan `TiketPromo`.

```bash
public Booking(String nama, String noHP, Tiket tiket, int jumlah) { ... }  
public TiketPromo(String kode, String tujuan, double harga, double diskon) { ... }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) { this.nama = nama; }  
public void setHarga(double harga) { this.harga = harga; }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `private` dan `protected` adalah contoh method accessor.

```bash
public double getHarga() { return harga; }  
public String getKode() { return kode; }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `protected` dan `privat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private double diskon;  
protected String noHP;
```

8. **Inheritance** adalah konsep di mana `BookingOnline` mewarisi class `Booking`, dan `TiketPromo` mewarisi `Tiket`.

```bash
public class BookingOnline extends Booking {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, `tampilkanInfo()` dan `getHarga()` dioverride oleh `TiketPromo`.

```bash
@Override  
public double getHarga() { ... }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk menentukan jenis tiket berdasarkan input pengguna.
```bash
if (pilihan == 2) { tiket = new TiketPromo(...); }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menerima dan menampilkan banyak data pemesanan.

```bash
for (int i = 0; i < total; i++) { ... }
```

12. **Input Output Sederhana** - Menggunakan `Scanner` untuk input dan `System.out.println` untuk output.

```bash
Scanner input = new Scanner(System.in);  
System.out.println("Nama: " + nama);
```

13. **Array** Menyimpan data pemesanan dalam bentuk array.

```bash
Booking[] bookings = new Booking[total];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, menggunakan blok `try`, `catch`, dan `finally`.


```bash
try { ... } catch (Exception e) { ... } finally { ... }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Jefry
NPM: 2310010647
