package org.example;

public class Jogador {

    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorEstadoIntegrado.getInstance();
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }

    public boolean integrar() {
        return estado.integrar(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean rescindirContrato() {
        return estado.rescindirContrato(this);
    }

    public boolean convocar() {
        return estado.convocar(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }
}