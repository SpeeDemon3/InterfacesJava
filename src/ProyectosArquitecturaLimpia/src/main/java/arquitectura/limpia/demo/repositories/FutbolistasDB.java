package arquitectura.limpia.demo.repositories;

import arquitectura.limpia.demo.entities.Futbolista;

import java.util.ArrayList;

abstract public class FutbolistasDB {

    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    protected void incrementarIserciones() { totalInserciones++; }
    protected void incrementarEliminaciones() { totalEliminaciones++; }
    abstract public ArrayList<Futbolista> obtener();
    abstract public Futbolista buscar(Futbolista futbolista);
    abstract public void insertar(Futbolista futbolista);
    abstract public void borrar(Futbolista futbolista);

}
