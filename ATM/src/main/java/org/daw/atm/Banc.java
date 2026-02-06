package org.daw.atm;
import java.util.ArrayList;

public class Banc {

    private String nom; 
    private ArrayList<Client> clients; 
    private ArrayList<Compte> comptes;

    public Banc(String nom) {
        this.nom = nom;
        clients = new ArrayList<>();
        comptes = new ArrayList<>();
        inicialitzarClients();
    }

    private void inicialitzarClients() {

    Client client1 = new Client("11111111S", "Fabiana", "1111");
    Client client2 = new Client("22222222F", "Sebastian", "2222");
    Client client3 = new Client("33333333V", "Mateo", "3333");
    Client client4 = new Client("44444444M", "Victor", "4444");
    Client client5 = new Client("55555555M", "Maricela", "5555");

    Compte compte1 = new Compte();

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

    }

    public String getNom() {
        return nom;
    } 
/** 
    public boolean validar (String dni, String pin) {

        for (Client cli : this.clients) {

            if (cli.getDni().equals(dni)) {
                return cli.comprovarPin(pin);
            }
        }
        
        return false; 
        
    }
        */
    /**
     * Es valida al client comprovant si el Dni està correctament introduit llavors 
     * s'aplica el mètode de ComprovarPin() i si tot va bé es valida al 
     * client. 
     * 
     * Si algo falla llavor es retorna null
     * @param dni
     * @param pin
     * @return null
     */

    public Client validar(String dni, String pin) {
        for (Client client : this.clients) {
            if (client.getDni().equals(dni)) {
                if (!client.isBloquejat() && client.comprovarPin(pin)) {
                    return client;
                }
                return null;
            }
        }
        return null;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}