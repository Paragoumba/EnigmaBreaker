package fr.paragoumba.enigmabreaker;

public class ConnectionTable {

    public ConnectionTable(){}

    private char[] connections = new char[6];

    public char a = 'a';
    public char b = 'b';
    public char c = 'c';
    public char d = 'd';
    public char e = 'e';
    public char f = 'f';

    public void setConnection(int i, char c){

        for (char c1 : connections){

            if (c1 == c){

                return;

            }
        }

        connections[i] = c;
    }
}
