public class Main {

    public static void main(String[] args) {

        Factory rechnungFactory=Factory.getInstance();

        Rechnung r1 = rechnungFactory.getRechnung("GANZZAHL");

        r1.berechnung();

        Rechnung r2 = rechnungFactory.getRechnung("GLEITKOMMA");

        r2.berechnung();

    }

}
