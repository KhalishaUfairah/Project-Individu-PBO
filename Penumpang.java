public class Penumpang implements PembayaranOngkos {
    protected int id;
    protected String nama;
    protected int umur;
    protected boolean hamil;
    protected int saldo;

    public Penumpang(int id, String nama, int umur, boolean hamil) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
        this.saldo = 10000;
    }

public int getID() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public boolean getHamil() { return hamil; }
    public int getSaldo() { return saldo; }

    public void tambahSaldo(int s) {
        saldo += s;
    }

    @Override
    public void bayarOngkos(int ongkos) throws SaldoTidakCukupException {
        if (saldo < ongkos)
            throw new SaldoTidakCukupException("Saldo tidak cukup untuk " + nama);
        saldo -= ongkos;
    }

    public boolean isPrioritas() {
        return umur > 60 || umur < 10 || hamil;
    }

    public String toString() {
        return "[" + id + "] " + nama + " | Umur: " + umur + 
               " | Hamil: " + hamil + " | Saldo: " + saldo;
    }
} 
