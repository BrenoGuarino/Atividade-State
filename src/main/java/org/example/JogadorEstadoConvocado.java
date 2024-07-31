package org.example;

public class JogadorEstadoConvocado extends JogadorEstado {

    private JogadorEstadoConvocado() {};
    private static JogadorEstadoConvocado instance = new JogadorEstadoConvocado();
    public static JogadorEstadoConvocado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Convocado";
    }


    public boolean rescindirContrato(Jogador jogador) {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        return true;
    }

    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }

    public boolean integrar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        return true;
    }



}