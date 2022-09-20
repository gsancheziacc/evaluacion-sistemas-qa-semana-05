package tests;

import models.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void obtenerId() {
        Cliente cliente = new Cliente("1-9");
        assertNotNull(cliente.obtenerId());
    }

    @Test
    void obtenerRut() {
        Cliente cliente = new Cliente("1-9");
        assertEquals("1-9", cliente.obtenerRut());
    }

    @Test
    void establecerRut() {
        Cliente cliente = new Cliente("1-9");
        cliente.establecerRut("2-7");
        assertEquals("2-7", cliente.obtenerRut());
    }
}