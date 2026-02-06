package org.daw.atm;

import java.util.ArrayList;
import java.util.List;

public class CompteCorrent extends Compte {

    private double limitDescobert;
    private List<Moviment> moviments = new ArrayList<>();

    public CompteCorrent(Client titular, double saldo, double limitDescobert) {
        this.limitDescobert = limitDescobert;
    }

    public double getLimitDescobert() {
        return limitDescobert;
    }

    public void setLimitDescobert(double limitDescobert) {
        this.limitDescobert = limitDescobert;
    }

    @Override
    public boolean retirar(double quantitat) {
        if (quantitat > 0 && getSaldo() + limitDescobert >= quantitat) {
            setSaldo(getSaldo() - quantitat);
            moviments.add(new Moviment("Retirada caixer", TipusMoviment.RETIRADA, quantitat));
            return true;
        } else {
            System.out.println("Superat límit de descobert.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "CompteCorrent [limitDescobert=" + limitDescobert + "] " + super.toString();
    }
}