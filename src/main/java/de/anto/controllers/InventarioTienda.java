package de.anto.controllers;

import de.anto.repositories.RepositorioComputador;
import de.anto.models.Computador;

public class InventarioTienda {
    private RepositorioComputador repositorio;

    public InventarioTienda() {
        this.repositorio = new RepositorioComputador();
    }

    public void agregarComputador(Computador computador) {
        repositorio.agregarComputador(computador);
    }

    public boolean eliminarComputadorPorMarca(String marca) {
        return repositorio.eliminarComputadorPorMarca(marca);
    }

    public Computador buscarComputadorPorMarca(String marca) {
        return repositorio.buscarComputadorPorMarca(marca);
    }

    public void listarComputadores() {
        for (Computador computador : repositorio.listarComputadores()) {
            System.out.println(computador);  
        }
    }
}
Ñ