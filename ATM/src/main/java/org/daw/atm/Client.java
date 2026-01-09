package org.daw.atm;

public class Client {
    private String dni;
    private String nom;
    private String pin;
    private int intentsFallits;
    private boolean bloquejat;

    public Client(String dni, String nom, String pin) {
        this.dni = dni;
        this.nom = nom;
        this.pin = pin;
        this.bloquejat = false;
        this.intentsFallits = 0;
    }

    public boolean comprovarPin(String pinIntroduit, int intentsFallits, boolean bloquejat) {
        while (intentsFallits < 3 || bloquejat == false) {
            if (pinIntroduit.equals(this.pin)) {
                intentsFallits = 4;
                return true;
            }
            else { 
                intentsFallits++;
                if (intentsFallits == 3) {
                    bloquejat = true;
                }
            }
        }
    return false;
    }

    public void resetIntents(int intentsFallits) {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws Exception {
        String nums = dni.substring(0, 8);
        char[] dniArray = dni.toCharArray();
        if ( dni.charAt(8) < 'a' || dni.charAt(8) > 'z') throw new Exception("Ultima lletra incorrecta");

        try {
            
    } catch (Exception e) {}
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) throws Exception {
        // Comprovar que PIN es correcte
        // Numero 4 xifres
        if (pin.length() != 4) throw new Exception("Llargada pin incorrecta");
        try {
        int num = Integer.parseInt(pin);
        this.pin = pin;
        } 
        catch(Exception e) {
            throw new Exception("Pin incorrecte");
        }
    }

    public int getIntentsFallits() {
        return intentsFallits;
    }

    public boolean isBloquejat() {
        return bloquejat;
    }


}
