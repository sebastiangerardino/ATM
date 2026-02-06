package org.daw.atm;

import java.util.ArrayList;
import java.util.List;

public class CompteEstalvi extends Compte {

    private double saldoMinim;
    private List<Moviment> moviments = new ArrayList<>();

    public CompteEstalvi(Client titular, double saldo, double saldoMinim) {
        super(titular, saldo);
        this.saldoMinim = saldoMinim;
    }

    public double getSaldoMinim() {
        return saldoMinim;
    }

    public void setSaldoMinim(double saldoMinim) {
        this.saldoMinim = saldoMinim;
    }

    @Override
    public boolean retirar(double quantitat) {
        if (quantitat > 0 && getSaldo() - quantitat >= saldoMinim) {
            setSaldo(getSaldo() - quantitat);
            moviments.add(new Moviment("Retirada caixer", TipusMoviment.RETIRADA, quantitat));
            return true;
        } else {
            System.out.println("No es pot retirar, saldo mínim.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "CompteEstalvi [saldoMinim=" + saldoMinim + "] " + super.toString();
    }
}