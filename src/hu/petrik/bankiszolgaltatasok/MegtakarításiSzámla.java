package hu.petrik.bankiszolgaltatasok;

public class MegtakarításiSzámla extends Számla {
    private double kamatMertek;
    private static double kamatAlap;

    public MegtakarításiSzámla(Tulajdonos t, double kamatAlap) {
        super(t);
        this.kamatMertek = kamatAlap;
    }

    public double getKamatMertek() {
        return kamatMertek;
    }

    public void setKamatMertek(double kamatMertek) {
        this.kamatMertek = kamatMertek;
    }

    public double Kamatjóváírás() {
        if (Kivesz(this.kamatMertek)) {
            setKamatMertek(this.kamatMertek * this.kamatAlap);
            return getKamatMertek();
        } else {
            return getKamatMertek();
        }
    }
}
