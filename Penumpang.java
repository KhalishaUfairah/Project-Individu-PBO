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
