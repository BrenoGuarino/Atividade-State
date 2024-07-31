package org.example;

public class JogadorEstadoIntegrado extends JogadorEstado {

    private JogadorEstadoIntegrado() {};
    private static JogadorEstadoIntegrado instance = new JogadorEstadoIntegrado();
    public static JogadorEstadoIntegrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }


    public boolean rescindirContrato(Jogador jogador) {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        return true;
    }

    public boolean convocar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        return true;
    }

    public boolean transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return true;
    }

}
