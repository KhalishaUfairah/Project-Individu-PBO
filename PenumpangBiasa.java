public class PenumpangBiasa extends Penumpang {
    public PenumpangBiasa(int id, String nama, int umur, boolean hamil) {
        super(id, nama, umur, hamil);
    }

    @Override
    public boolean isPrioritas() {
        return false;
    }
}
