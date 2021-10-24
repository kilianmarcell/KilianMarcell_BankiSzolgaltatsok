package hu.petrik.bankiszolgaltatasok;

public class Kártya extends BankiSzolgáltatás {
    private String kartyaSzam;
    private Számla s;

    public Kártya(Tulajdonos t, String kartyaSzam) {
        super(t);
        this.kartyaSzam = kartyaSzam;
        this.s = s;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean Vásárlás(double osszeg) {
        if (s.Kivesz(osszeg)) {
            return true;
        } else {
            return false;
        }
    }
}
