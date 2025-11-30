# Project-Individu-PBO
Khalisha Ufairah - 2408107010084

Project Individu Pemrograman Berbasis Objek - Sistem Bus dan Penumpang

Project ini merupakan implementasi konsep Pemrograman Berorientasi Objek dalam Java, yang mensimulasikan sistem bus, kategori penumpang, pembayaran ongkos, serta penanganan exception ketika saldo tidak mencukupi. Struktur program terdiri dari beberapa class yang saling berhubungan, mencakup konsep inheritance, polymorphism, exception handling, dan enkapsulasi.

Project Individu PBO
•	Bus.java
•	Kategori.java
•	PembayaranOngkos.java
•	Penumpang.java
•	PenumpangBiasa.java
•	PenumpangPrioritas.java
•	SaldoTidakCukupException.java
•	TestBus.java 

Penjelasan Setiap Class

1.	 Bus.java
Class utama yang merepresentasikan sebuah bus.
Fiturnya: 
•	Menampung list penumpang
•	Maksimal kapasitas
•	Menambahkan penumpang (add)
•	Menghapus penumpang (remove)
•	Menampilkan informasi bus
•	Memproses pembayaran ongkos melalui PembayaranOngkos

2.	 Kategori.java
Class / enum yang mendefinisikan kategori penumpang seperti:
•	Biasa
•	Prioritas (misalnya lansia, ibu hamil)
•	Berdiri

3.	PembayaranOngkos.java
Class yang menangani proses pembayaran tarif bus.
•	Mengurangi saldo penumpang
•	Mengecek saldo cukup / tidak
•	Melempar SaldoTidakCukupException

4.	Penumpang.java
Class induk (superclass) untuk semua jenis penumpang.
•	Nama
•	Saldo
•	Kategori
•	Metode bayar ongkos
•	Getter & setter

5.	PenumpangBiasa.java
Subclass dari Penumpang.
•	Membayar ongkos normal
•	Tidak memiliki prioritas khusus

6.	PenumpangPrioritas.java
Subclass dari Penumpang.
•	Memiliki hak kursi prioritas
•	Bisa memiliki tarif berbeda atau fasilitas lain

7.	SaldoTidakCukupException.java
Exception khusus untuk menangani kasus ketika, saldo penumpang tidak cukup untuk membayar ongkos.
Digunakan dalam: throw new SaldoTidakCukupException(...)

8.  TestBus.java
Class untuk menjalankan seluruh simulasi.
•	Membuat objek bus
•	Membuat beberapa penumpang (biasa dan prioritas)
•	Menambah penumpang ke bus
•	Simulasi pembayaran ongkos
•	Menampilkan hasil akhir

Konsep PBO yang Digunakan
Class & Object: Bus, Penumpang, PembayaranOngkos
Inheritance: PenumpangBiasa & PenumpangPrioritas, Penumpang
Polymorphism: Metode bayar ongkos dapat berbeda untuk tiap jenis penumpang
Encapsulation: Variabel menggunakan private dan getter/setter
Exception Handling: SaldoTidakCukupException
Enum / Kategori: Jenis penumpang berdasarkan kategori


