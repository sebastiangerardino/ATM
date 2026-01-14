package org.daw.atm;

public class ATM {
public static void main(String[] args) {
    
    Client client1 = new Client("11111111S", "Fabiana", "1111");
    Client client2 = new Client("22222222F", "Sebastian", "2222");
    Client client3 = new Client("333333333V", "Mateo", "3333");
    Client client4 = new Client("44444444M", "Victor", "4444");
    Client client5 = new Client("55555555M", "Maricela", "5555");

    Compte compte1 = new Compte();
    compte1.setTitular(client1);
    System.out.println(compte1.getNumero());
    System.out.println(compte1.getTitular().getNom());

    Client[] clients = new Client[5];

    clients[0] = client1;
    clients[1] = client2;
    clients[2] = client3;
    clients[3] = client4;
    clients[4] = client5;

    Compte compte2 = new Compte(1000);
    compte2.setTitular(client1);

    Compte compte3 = new Compte();
    compte3.setTitular(client2);

    Compte compte4 = new Compte(1000);
    compte4.setTitular(client2);

    Compte compte5 = new Compte();
    compte5.setTitular(client3);

    Compte compte6 = new Compte(1000);
    compte6.setTitular(client3);

    Compte compte7 = new Compte();
    compte7.setTitular(client4);

    Compte compte8 = new Compte(1000);
    compte8.setTitular(client4);

    Compte compte9 = new Compte();
    compte9.setTitular(client5);

    Compte compte10 = new Compte(1000);
    compte10.setTitular(client5);

    Compte[] comptes = new Compte[10];

    comptes[0] = compte1;
    comptes[1] = compte2;
    comptes[2] = compte3;
    comptes[3] = compte4;
    comptes[4] = compte5;
    comptes[5] = compte6;
    comptes[6] = compte7;
    comptes[7] = compte8;
    comptes[8] = compte9;
    comptes[9] = compte10;
    
    for (int i = 0; i < 5; i++) {
        System.out.println(clients[i].getNom());
    }
/*

    try {
        Client client1 = new Client("11111111A", "Ana", "AAAA");
        client1.setPin("1234");
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
    
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
    */
}
}
