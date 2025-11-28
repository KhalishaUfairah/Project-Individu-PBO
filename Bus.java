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
