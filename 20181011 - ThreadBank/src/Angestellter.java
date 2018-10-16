public class Angestellter implements Runnable {

    private SimpleBank bank;
    private int von, nach, betrag;

    public SimpleBank getBank() {
        return bank;
    }

    public void setBank(SimpleBank bank) {
        this.bank = bank;
    }

    public int getVon() {
        return von;
    }

    public void setVon(int von) {
        this.von = von;
    }

    public int getNach() {
        return nach;
    }

    public void setNach(int nach) {
        this.nach = nach;
    }

    public int getBetrag() {
        return betrag;
    }

    public void setBetrag(int betrag) {
        this.betrag = betrag;
    }

    public Angestellter(SimpleBank bank, int von, int nach, int betrag) {
        this.bank = bank;
        this.von = von;
        this.nach = nach;
        this.betrag = betrag;
    }

    @Override
    public void run() {
        bank.ueberweisung(von, nach, betrag);
    }
}
