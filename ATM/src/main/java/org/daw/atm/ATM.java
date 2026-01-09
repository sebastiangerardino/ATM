package org.daw.atm;

public class ATM {
public static void main(String[] args) {
    
    
    Compte c1 = new Compte();
    //c1.numero = "EI!!11111";
    //c1.setNumero("EI!!11111");
    System.out.println(c1.getNumero());
    c1.setSaldo(100);
    c1.setInteresAnual(1.5);
    //c1.saldo = 100;
    c1.ingressar(100);
    c1.retirar(50);
    c1.calculaInteresAnual();
    System.out.println("Saldo del compte 1: " + c1.getSaldo());
    System.out.println("Numero del compte 1: " + c1.getNumero());

    Compte c2 = new Compte();
    //c1.numero = "EI!!22222";
    //c1.saldo = 100;
    //c2.setNumero("EI!!22222");
    c2.setSaldo(200);
    System.out.println("Numero del compte 2: " + c2.getNumero());

    Compte c3;
    c3=c1;
    //c3.saldo = 0;

    Compte c4 = new Compte();

    Client Juan = new Client("E03439544T", "Juan", "332ee");
    System.out.println("Nom client: " + Juan.getNom());
    System.out.println("DNI client: " + Juan.getDni());
    System.out.println("PIN client: " + Juan.getPin());
}
}
