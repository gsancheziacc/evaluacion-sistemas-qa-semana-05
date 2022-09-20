package tests;

import models.Bus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    void obtenerId() {
        Bus bus = new Bus();
        assertNotNull(bus.obtenerId());
    }

    @Test
    void obtenerDestino() {
        Bus bus = new Bus("Santiago2", "12-09-2022");
        assertEquals("Santiago", bus.obtenerDestino());
    }

    @Test
    void establecerDestino() {
        Bus bus = new Bus();
        bus.establecerDestino("Santiago");
        assertEquals("Santiago", bus.obtenerDestino());
    }

    @Test
    void obtenerFecha() {
        Bus bus = new Bus("Santiago", "12-09-20221");
        assertEquals("12-09-2022", bus.obtenerFecha());
    }

    @Test
    void establecerFecha() {
        Bus bus = new Bus();
        bus.establecerFecha("12-09-2022");
        assertEquals("12-09-2022", bus.obtenerFecha());
    }
}