public class SimpleBank  {

    public int[] konten = {30, 50, 100};


    public void ueberweisung(int von, int nach, int betrag) {
        konten[von] = konten[von] - betrag;
        konten[nach] = konten[nach] + betrag;

        try {
            Thread.sleep((int) Math.random() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void kontostand() {
        for (int i = 0; i < konten.length; i++) {
            System.out.println("Kontonummer: " + i + "\nBetrag: " + konten[i]);
        }

    }

}
