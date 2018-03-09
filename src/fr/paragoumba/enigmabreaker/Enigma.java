package fr.paragoumba.enigmabreaker;

public class Enigma {

    public Enigma(){}

    private Rotor[] rotors = new Rotor[3];

    public void setRotor(int i, Rotor rotor){

        rotors[i] = rotor;

    }

    public char hitKey(char key){

        return key;

    }
}
