package hu.petrik.bankiszolgaltatasok;

public class Számla extends BankiSzolgáltatás {
    private double egyenleg;

    public Számla(Tulajdonos t) {
        super(t);
    }

    public double getEgyenleg() {
        return egyenleg;
    }

    public double Befizet(double osszeg) {
        egyenleg += osszeg;
        return egyenleg;
    }

    public boolean Kivesz(double osszeg) {
        HitelSzámla h = new HitelSzámla(this.getT(), getEgyenleg());
        if (getEgyenleg() - osszeg >= -1 * h.getHitelkeretOsszeg()) {
            return true;
        } else {
            return false;
        }
    }

    public void ÚjKártya(String leendoKartyaszam) {
        Kártya k = new Kártya(super.getT(), leendoKartyaszam);
    }
}
