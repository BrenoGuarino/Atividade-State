import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JogadorTest {

    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    @Test
    public void naoDeveIntegrarJogadorIntegrado() {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        assertFalse(jogador.integrar());
    }

    @Test
    public void deveAposentarJogadorIntegrado() {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveRescindirJogadorIntegrado() {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        assertTrue(jogador.rescindirContrato());
        assertEquals(JogadorEstadoRescindido.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveConvocarJogadorIntegrado() {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        assertTrue(jogador.convocar());
        assertEquals(JogadorEstadoConvocado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveTransferirJogadorIntegrado() {
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        assertTrue(jogador.transferir());
        assertEquals(JogadorEstadoTransferido.getInstance(), jogador.getEstado());
    }

    // Jogador Convocado

    @Test
    public void deveIntegrarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.integrar());
        assertEquals(JogadorEstadoIntegrado.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveTransferirJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveConvocarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void deveAposentarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveRescindirJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.rescindirContrato());
        assertEquals(JogadorEstadoRescindido.getInstance(), jogador.getEstado());
    }

    // Jogador aposentado

    @Test
    public void naoIntegrarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.integrar());
    }

    @Test
    public void naoAposentarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveConvocarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveTransferirJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveRescindirJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.rescindirContrato());
    }

    // Jogador Rescindido

    @Test
    public void naoDeveIntegrarJogadorRescindido() {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        assertFalse(jogador.integrar());
    }

    @Test
    public void naoDeveAposentarJogadorRescindido() {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveConvocarJogadorRescindido() {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveRescindirJogadorRescindido() {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        assertFalse(jogador.rescindirContrato());
    }

    @Test
    public void naoDeveTransferirJogadorRescindido() {
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        assertFalse(jogador.transferir());
    }


    // Jogador transferido

    @Test
    public void naoDeveIntegrarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.integrar());
    }

    @Test
    public void naoDeveAposentarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveConvocarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveRescindirJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.rescindirContrato());
    }

    @Test
    public void naoDeveTransferirJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.transferir());
    }


}
