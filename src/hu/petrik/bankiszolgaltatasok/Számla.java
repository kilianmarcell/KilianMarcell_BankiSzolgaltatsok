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
        HitelSzámla h = new HitelSzámla(this.getT(), getEgyenleg()); //TODO: getEgyenleg() javítása
        if (egyenleg - osszeg > -1 * h.getHitelkeretOsszeg()) {
            egyenleg -= osszeg;
            return true;
        } else {
             return false;
        }
    }

    public Kártya ÚjKártya(String leendoKartyaszam) {
        Számla s = new Számla(super.getT());
        Kártya k = new Kártya(this.getT(), s, leendoKartyaszam);
        return k;
    }
}
