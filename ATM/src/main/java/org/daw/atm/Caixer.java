package org.daw.atm;

public class Caixer {

    private Banc banc;
    private Client clientConnectat;

    public Caixer(Banc banc) {
        this.banc = banc;
        this.clientConnectat = null;
    }

 public boolean login(String dni, String pin) {
    if (clientConnectat != null) return false;

    for (Client c : banc.getClients()) {
        if (c.getDni().equals(dni)) { 
            if (c.isBloquejat()) {
                System.out.println("Aquest client està bloquejat");
                return false;
            }
            if (c.comprovarPin(pin)) {
                clientConnectat = c;
                return true;
            } else {
               
                return false;
            }
        }
    }

    System.out.println("DNI no trobat"); 
    return false;
}

    public void logout() {
        clientConnectat = null;
    }

    public Client getClientConnectat() {
        return clientConnectat;
    }

    public Banc getBanc() {
        return banc;
    }
}