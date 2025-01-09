public class TapparellaElettrica extends Tapparella {

    public TapparellaElettrica(int larghezza, int altezza) {
        super(larghezza, altezza);
    }

    public void scendiCompletamente() {
        super.scendi(getAltezza());
    }

    public void saliCompletamente() {
        super.sali(getAltezza());
    }

    @Override
    public String toString() {
        return super.toString() + " (Elettrica)";
    }
}
