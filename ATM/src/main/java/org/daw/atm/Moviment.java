package org.daw.atm;

import java.time.LocalDateTime;

public class Moviment {

    private LocalDateTime dataHora;
    private String descripcio;
    private TipusMoviment tipusMoviment;
    private double quantitat;

    public Moviment(String descripcio, TipusMoviment tipus, double quantitat) {
        this.dataHora = LocalDateTime.now();
        this.descripcio = descripcio;
        this.tipusMoviment = tipus;
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return dataHora + " - " + tipusMoviment + " - " + descripcio + " - " + quantitat + "€";
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public TipusMoviment getTipusMoviment() {
        return tipusMoviment;
    }

    public double getQuantitat() {
        return quantitat;
    }
}