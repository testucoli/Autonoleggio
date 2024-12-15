package autonoleggio.core;

import veicoli.core.Contenitore;

public class Main {
    public static void main(String[] args) {
        Contenitore autonoleggio = new Contenitore(1000);

        autonoleggio.aggiungiVeicolo("AB123CD", "Fiat", "Panda", 4);
        autonoleggio.aggiungiVeicolo("EF456GH", "Volkswagen", "Golf", 5);

        System.out.println("Veicoli presenti:");
        autonoleggio.visualizzaVeicoli();

        System.out.println("\nRicerca veicolo con codice 1:");
        System.out.println(autonoleggio.cercaVeicoloPerCodice(1));

        System.out.println("\nRicerca veicolo con targa EF456GH:");
        System.out.println(autonoleggio.cercaVeicoloPerTarga("EF456GH"));

        System.out.println("\nEliminazione veicolo con codice 1:");
        autonoleggio.eliminaVeicolo(1);

        System.out.println("\nVeicoli presenti dopo eliminazione:");
        autonoleggio.visualizzaVeicoli();
    }
}