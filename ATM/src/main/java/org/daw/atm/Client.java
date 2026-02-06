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

    public boolean comprovarPin(String pinIntroduit) {
        if (this.bloquejat) {
            return false;
        }
    
        if (pinIntroduit.equals(this.pin)) {
            return true;
        } else {
            this.intentsFallits++;
            if (this.intentsFallits >= 3) {
                this.bloquejat = true;
            }
            return false;
        }
    }

    public void resetIntents() {
        this.intentsFallits = 0;
        this.bloquejat = false;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws Exception {
        char[] lletres = { 'T', 'R', 'W', 'A', 'G', 'M' };

        if ( dni == null ) {
            throw new IllegalArgumentException("El DNI no pot ser null");
        }
        if (dni.length() != 9) {
            throw new IllegalArgumentException("El DNI ha de tenir 9 dígits");
        }            

        int numero;
        try {
            numero = Integer.parseInt(dni.substring(0, 8));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Els primers 8 caràcters del DNI han de ser numeros");
        }

        char lletraCorrecta = lletres[numero % 23];
        char lletraDni = Character.toUpperCase(dni.charAt(8));

        if (lletraDni != lletraCorrecta) {
            throw new IllegalArgumentException("La lletra del DNI no és correcta");
        }
        this.dni = dni.toUpperCase();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        // Comprovar que PIN es correcte
        // Numero 4 xifres
        if (pin==null) throw new IllegalArgumentException("El pin ha de tenir un valor correcte");
        if (pin.length() != 4) throw new IllegalArgumentException("Llargada pin incorrecte");

        try {
            int num = Integer.parseInt(pin);
            this.pin = pin;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Pin incorrecte");
        }
    }

    public int getIntentsFallits() {
        return intentsFallits;
    }

    public boolean isBloquejat() {
        return bloquejat;
    }


}
