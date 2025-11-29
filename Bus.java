import java.util.ArrayList;

public class Bus {

    private ArrayList<Penumpang> penumpangPrioritas;
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangBerdiri;

    public static final int ONGKOS_BUS = 2000;
    private int totalPendapatan = 0;

    public Bus() {
        penumpangPrioritas = new ArrayList<>();
        penumpangBiasa = new ArrayList<>();
        penumpangBerdiri = new ArrayList<>();
    }

    public int totalPenumpang() {
        return penumpangPrioritas.size() +
               penumpangBiasa.size() +
               penumpangBerdiri.size();
    }

 public boolean naikkanPenumpang(Penumpang p) {

        // Cek kapasitas total 40 orang
        if (totalPenumpang() >= 40) {
            System.out.println("Bus penuh, penumpang tidak dapat naik!");
            return false;
        }

        // Proses bayar ongkos
        try {
            p.bayarOngkos(ONGKOS_BUS);
            totalPendapatan += ONGKOS_BUS;
        } catch (SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
            return false;
        }

        // Prioritas dulu
        if (p.isPrioritas()) {
            if (penumpangPrioritas.size() < 4) {
                penumpangPrioritas.add(p);
                return true;
            }
        }

        // Kursi biasa
        if (penumpangBiasa.size() < 16) {
            penumpangBiasa.add(p);
            return true;
        }

        // Berdiri
        if (penumpangBerdiri.size() < 20) {
            penumpangBerdiri.add(p);
            return true;
        }

        return false;
    }

    public boolean turunkanPenumpang(int id) {

        boolean removed = 
            penumpangPrioritas.removeIf(p -> p.getID() == id) ||
            penumpangBiasa.removeIf(p -> p.getID() == id) ||
            penumpangBerdiri.removeIf(p -> p.getID() == id);

        return removed;
    }

    private void tampilkanList(String label, ArrayList<Penumpang> list) {
        System.out.print(label + ": ");
        if (list.isEmpty()) {
            System.out.println("<kosong>");
        } else {
            list.forEach(p -> System.out.print(p.getNama() + " "));
            System.out.println();
        }
    }

    public void tampilkanData() {
        System.out.println("\n===== DAFTAR PENUMPANG =====");
        tampilkanList("Prioritas", penumpangPrioritas);
        tampilkanList("Biasa", penumpangBiasa);
        tampilkanList("Berdiri", penumpangBerdiri);
        System.out.println("Total Penumpang : " + totalPenumpang());
        System.out.println("Total Pendapatan: " + totalPendapatan);
        System.out.println("=============================\n");
    }
}
