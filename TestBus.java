import java.util.Scanner;

public class TestBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();

        while (true) {
            System.out.println("===== BUS TRANS KOETARADJA =====");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();

            if (pilihan == 1) {

                System.out.print("ID Penumpang : ");
                int id = in.nextInt();
                in.nextLine(); // clear buffer

                System.out.print("Nama         : ");
                String nama = in.nextLine();

                System.out.print("Umur         : ");
                int umur = in.nextInt();

                System.out.print("Hamil (y/n)  : ");
                char h = in.next().charAt(0);
                boolean hamil = (h == 'y' || h == 'Y');

                Penumpang p;

                // Penumpang prioritas otomatis
                if (umur > 60 || umur < 10 || hamil) {
                    p = new PenumpangPrioritas(id, nama, umur, hamil);
                } else {
                    p = new PenumpangBiasa(id, nama, umur, hamil);
                }

                if (bus.naikkanPenumpang(p)) {
                    System.out.println("Penumpang berhasil naik!");
                } else {
                    System.out.println("Penumpang gagal naik!");
                }

            
