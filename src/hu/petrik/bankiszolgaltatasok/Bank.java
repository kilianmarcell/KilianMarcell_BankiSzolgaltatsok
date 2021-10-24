package hu.petrik.bankiszolgaltatasok;

public class Bank {
    private int maximalisHossz;

    public Bank(int maximalisHossz) {
        this.maximalisHossz = maximalisHossz;
    }

    public void Számlanyitás(Tulajdonos t, double hitelKeret) {
        HitelSzámla h = new HitelSzámla(t, hitelKeret);
        MegtakarításiSzámla m = new MegtakarításiSzámla(t, 1);
    }
}
