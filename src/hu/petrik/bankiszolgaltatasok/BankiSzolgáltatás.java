package hu.petrik.bankiszolgaltatasok;

public abstract class BankiSzolgáltatás {
    private Tulajdonos t;

    public BankiSzolgáltatás(Tulajdonos t) {
        this.t = t;
    }

    public Tulajdonos getT() {
        return t;
    }
}
