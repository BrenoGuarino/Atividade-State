package org.example;

public class JogadorEstadoRescindido extends JogadorEstado {

    private JogadorEstadoRescindido() {};
    private static JogadorEstadoRescindido instance = new JogadorEstadoRescindido();
    public static JogadorEstadoRescindido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contrato Rescindido";
    }


}