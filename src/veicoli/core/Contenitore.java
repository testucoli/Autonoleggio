package veicoli.core;

public class Contenitore {
    private Veicolo[] contenitore;
    private int counter = 0;
    private int veicoli = 0;
    private final int MAX;

    public Contenitore(int max) {
        this.MAX = max;
        this.contenitore = new Veicolo[MAX];
    }

    public boolean aggiungiVeicolo(String targa, String marca, String modello, int numeroPosti) {
        if (veicoli >= MAX) return false;
        contenitore[veicoli++] = new Veicolo(counter++, targa, marca, modello, numeroPosti);
        return true;
    }

    public boolean eliminaVeicolo(int codice) {
        for (int i = 0; i < veicoli; i++) {
            if (contenitore[i].getCodice() == codice) {
                contenitore[i] = contenitore[veicoli--];
                contenitore[veicoli] = null;
                return true;
            }
        }
        return false;
    }

    public Veicolo cercaVeicoloPerCodice(int codice) {
        for (int i = 0; i < veicoli; i++)
            if (contenitore[i].getCodice() == codice) return contenitore[i];
        return null;
    }

    public Veicolo cercaVeicoloPerTarga(String targa) {
        for (int i = 0; i < veicoli; i++)
            if (contenitore[i].getTarga().equalsIgnoreCase(targa)) return contenitore[i];
        return null;
    }

    public void visualizzaVeicoli() {
        for (int i = 0; i < veicoli; i++)
            System.out.println(contenitore[i]);
    }
}
