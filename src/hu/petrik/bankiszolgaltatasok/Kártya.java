package hu.petrik.bankiszolgaltatasok;

public class Kártya extends BankiSzolgáltatás {
    private Számla s;
    private String kartyaSzam;

    public Kártya(Tulajdonos t, Számla s, String kartyaSzam) {
        super(t);
        this.s = s;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean Vásárlás(double osszeg) {
        Számla s = new Számla(super.getT());
        if (s.Kivesz(osszeg)) {
            return true;
        } else {
            return false;
        }
    }
}
