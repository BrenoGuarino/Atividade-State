package org.example;

public abstract class JogadorEstado {

    public abstract String getEstado();

    public boolean integrar(Jogador jogador) {
        return false;
    }

    public boolean aposentar(Jogador jogador) {
        return false;
    }

    public boolean rescindirContrato(Jogador jogador) {
        return false;
    }

    public boolean convocar(Jogador jogador) {
        return false;
    }

    public boolean transferir(Jogador jogador) {
        return false;
    }

}