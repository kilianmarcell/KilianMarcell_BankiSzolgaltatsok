package hu.petrik.bankiszolgaltatasok;

public class MegtakarításiSzámla extends Számla {
    private static double kamat;

    public MegtakarításiSzámla(Tulajdonos t) {
        super(t);
        this.kamat = 1;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public double Kamatjóváírás() {
        if (Kivesz(getKamat())) {
            setKamat(getEgyenleg() * kamat);
            return getKamat();
        } else {
            return getKamat();
        }
    }
}
