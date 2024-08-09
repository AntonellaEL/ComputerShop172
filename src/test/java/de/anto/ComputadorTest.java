package de.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.anto.models.Computador;

public class ComputadorTest {
    private Computador computador;

    @BeforeEach
    void setUp(){
        computador = new Computador("MSI", 20,"intel i8", "windows 11", 1.200);
    }

    @Test
    void testGetMarca(){
        assertEquals("MSI", computador.getMarca());
    } 
    
    @Test
    void testSetMarca() {
        computador.setMarca("HP");
        assertEquals("HP", computador.getMarca());
    }

    @Test
    void getMemoriaRAM(){
        assertEquals(20, computador.getMemoriaRAM());
    }

    @Test
    void setMemoriaRAM(){
        computador.setMemoriaRAM(21);
        assertEquals(21, computador.getMemoriaRAM());
    }

    @Test
    void  testGetProcesador (){
        assertEquals("intel i8", computador.getProcesador());
    }

    @Test
    void testSetProcesador(){
        computador.setProcesador("intel9");
        assertEquals("intel9", computador.getProcesador());
    }

    @Test
    void testGetSistemaOperativo(){
        assertEquals("windows 11", computador.getSistemaOperativo());
    }

    @Test
    void testSetSistemaOperativo(){
        computador.setSistemaOperativo("windows 12");
        assertEquals("windows 12", computador.getSistemaOperativo());
    }

    @Test
    void testGetPrecio(){
        assertEquals(1.200, computador.getPrecio());
    }

    @Test
    void testSetPrecio(){
        computador.setPrecio(3.000);
        assertEquals(3.000, computador.getPrecio());
    }
}
