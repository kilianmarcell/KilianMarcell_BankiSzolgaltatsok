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
        if (getEgyenleg() - osszeg >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
