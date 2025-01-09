public class Tapparella {
    private int larghezza;
    private int altezza;
    private int posizione;

    public Tapparella(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.posizione = 0;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getPosizione() {
        return posizione;
    }

    public void scendi(int distanza) {
        if (posizione + distanza > altezza) {
            posizione = altezza;
        } else {
            posizione += distanza;
        }
    }

    public void sali(int distanza) {
        if (posizione - distanza < 0) {
            posizione = 0;
        } else {
            posizione -= distanza;
        }
    }

    @Override
    public String toString() {
        return "Tapparella [Larghezza: " + larghezza + " cm, Altezza: " + altezza + " cm, Posizione: " + posizione + " cm";
    }
}
