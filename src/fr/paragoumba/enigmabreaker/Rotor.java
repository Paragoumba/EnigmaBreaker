package fr.paragoumba.enigmabreaker;

public class Rotor {

    Rotor(){}

    private char position;

    public final char a = 'a';
    public final char b = 'b';
    public final char c = 'c';
    public final char d = 'd';
    public final char e = 'e';
    public final char f = 'f';

    public char getChar(){

        switch (position){

            case 'a':
                return 'e';
            case 'b':
                return 'a';
            case 'c':
                return 'f';
            case 'd':
                return 'b';
            case 'e':
                return 'd';
            case 'f':
                return 'c';
        }

        return position;
    }
}