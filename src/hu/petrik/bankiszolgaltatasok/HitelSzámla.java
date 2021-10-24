package hu.petrik.bankiszolgaltatasok;

public class HitelSzámla extends Számla {
    private double hitelkeretOsszeg;

    public HitelSzámla(Tulajdonos t, double hitelkeretOsszeg) {
        super(t);
        this.hitelkeretOsszeg = hitelkeretOsszeg;
    }

    public double getHitelkeretOsszeg(double kiveszOsszeg) {
        if (Kivesz(kiveszOsszeg)) {
            return getEgyenleg() - kiveszOsszeg;
        }
        return hitelkeretOsszeg;
    }
}
