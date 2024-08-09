package de.anto.repositories;

import de.anto.models.Computador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RepositorioComputador {
    private List<Computador> inventario;

    public RepositorioComputador() {
        this.inventario = new ArrayList<>();
    }

    public void agregarComputador(Computador computador) {
        inventario.add(computador);
    }

    public boolean eliminarComputadorPorMarca(String marca) {
        Iterator<Computador> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Computador computador = iterator.next();
            if (computador.getMarca().equalsIgnoreCase(marca)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Computador buscarComputadorPorMarca(String marca) {
        for (Computador computador : inventario) {
            if (computador.getMarca().equalsIgnoreCase(marca)) {
                return computador;
            }
        }
        return null; 
    }

    public List<Computador> listarComputadores() {
        return new ArrayList<>(inventario);
    }
}
