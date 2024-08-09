package de.anto;

import de.anto.controllers.InventarioTienda;
import de.anto.models.Computador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTiendaTest {

    private InventarioTienda inventario;

    @BeforeEach
    void setUp() {
        inventario = new InventarioTienda();
    }

    @Test
    void testAgregarComputador() {
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        inventario.agregarComputador(computador);
        Computador result = inventario.buscarComputadorPorMarca("Dell");
        assertNotNull(result);
        assertEquals("Dell", result.getMarca());
    }

    @Test
    void testEliminarComputadorPorMarca() {
        Computador computador = new Computador("HP", 8, "Intel i5", "Windows 10", 800.00);
        inventario.agregarComputador(computador);
        boolean eliminado = inventario.eliminarComputadorPorMarca("HP");
        assertTrue(eliminado);
        assertNull(inventario.buscarComputadorPorMarca("HP"));
    }

    @Test
    void testBuscarComputadorPorMarca() {
        Computador computador = new Computador("Apple", 16, "M1", "macOS", 1500.00);
        inventario.agregarComputador(computador);
        Computador result = inventario.buscarComputadorPorMarca("Apple");
        assertNotNull(result);
        assertEquals("Apple", result.getMarca());
    }

    @Test
    void testListarComputadores() {
        Computador computador1 = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        Computador computador2 = new Computador("HP", 8, "Intel i5", "Windows 10", 800.00);
        inventario.agregarComputador(computador1);
        inventario.agregarComputador(computador2);

        assertDoesNotThrow(() -> inventario.listarComputadores());
    }
}
