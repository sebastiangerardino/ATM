/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.daw.atm;

/**
 *
 * @author alumne
 */
public class Compte {
    // poden ser publics o privats
    // atributs de la classe
    private String numero;
    private double saldo;
    private String titular;
    private double interesAnual;
    private static int comptador = 1;
    private static String prefix = "ES450-";

    public Compte() {
        numero = prefix + comptador;
        comptador++;
        // System.out.println("Compte creat.");
    }

    public Compte(double saldo) {
        numero = prefix + comptador;
        comptador++;
        this.saldo = saldo;
    }

    public double calculaInteresAnual() {
        double ambInteres = this.saldo * (this.interesAnual / 100);
        this.saldo = this.saldo + ambInteres;
        return this.saldo;
    }

    public void ingressar(double quantitat) {
        if (quantitat > 0) {
            this.saldo = this.saldo + quantitat;
        }
    }

    public boolean retirar(double quantitat) {
        if (quantitat > 0 && this.saldo >= quantitat) {
            this.saldo = this.saldo - quantitat;
            return true;
        }
        return false;
    }

    public boolean transferencia(Compte destinacio, double quantitat) {
        if (quantitat <= 0) {
            return false;
        }
         if (this.retirar(quantitat)) {
            destinacio.ingressar(quantitat);   
            return true;
        }
        return false;
    }

    public Compte(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }


}
