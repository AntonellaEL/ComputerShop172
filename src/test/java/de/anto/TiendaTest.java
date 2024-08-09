package de.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.anto.models.Tienda;

public class TiendaTest {
    private Tienda tienda;

    @BeforeEach
    void setUp(){
        tienda = new Tienda("pepitoCompu", "Roberto Jose", "22332");
    }
    @Test
    void testConstructor() {
        assertEquals("pepitoCompu", tienda.getNombre());
        assertEquals("Roberto Jose", tienda.getPropietario());
        assertEquals("22332", tienda.getIdentificadorTributario());
    }

  
    @Test
    void testGetNombre() {
        assertEquals("pepitoCompu", tienda.getNombre());
    }

    @Test
    void testSetNombre(){
        tienda.setNombre("nuevoPepito");
        assertEquals("nuevoPepito", tienda.getNombre());
    }

    @Test
    void testGetPropietario(){
       assertEquals("Roberto Jose", tienda.getPropietario());
    }

    @Test
    void testSetPropietario(){
        tienda.setPropietario("juanRobert");
        assertEquals("juanRobert", tienda.getPropietario());
    }

    @Test
    void testGetIdentificador(){
        assertEquals("22332", tienda.getIdentificadorTributario());
    }

    @Test
    void testSetIdentificador(){
        tienda.setIdentificadorTributario("22222");
        assertEquals("22222", tienda.getIdentificadorTributario());
    }
}
