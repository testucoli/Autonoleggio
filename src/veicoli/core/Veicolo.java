package veicoli.core;

public class Veicolo {

    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int np;

    public Veicolo(int codice, String targa, String marca, String modello, int np) {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.np = np;
    }

    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNp() {
        return np;
    }

    @Override
    public String toString() {
        return "Codice: " + codice + ", Targa: " + targa + ", Marca: " + marca +
                ", Modello: " + modello + ", Posti: " + np;
    }


}
