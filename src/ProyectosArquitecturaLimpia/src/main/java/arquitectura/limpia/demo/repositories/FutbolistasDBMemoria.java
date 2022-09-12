package arquitectura.limpia.demo.repositories;

import arquitectura.limpia.demo.entities.Futbolista;
import java.util.ArrayList;

public class FutbolistasDBMemoria extends FutbolistasDB{
    ArrayList<Futbolista> futbolistas = new ArrayList();

    @Override
    public ArrayList<Futbolista> obtener() { return futbolistas;}

    @Override
    public Futbolista buscar(Futbolista futbolista) {
        for (Futbolista futbolistaActual : obtener()) {
            if (futbolistaActual.nombreUsuario.equalsIgnoreCase(futbolista.nombreUsuario)) {
                return futbolista;
            }
        }
        return null;
    }
    @Override
    public void insertar(Futbolista futbolista) {
        for (Futbolista futbolistaActual : futbolistas) {
            if (futbolistaActual.nombreUsuario.equalsIgnoreCase(futbolista.nombreUsuario)) {
                return;
            }
        }

        futbolistas.add(futbolista);
        incrementarIserciones();
    }

    @Override
    public void borrar(Futbolista futbolista) {
        for (int i = 0; i > futbolistas.size(); i++) {
            if (futbolistas.get(i).nombreUsuario.equalsIgnoreCase(futbolista.nombreUsuario)) {
                futbolistas.remove(i);

            }
        }
    }

}
