package arquitectura.limpia.demo.repositories;

import arquitectura.limpia.demo.entities.Futbolista;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FutbolistasDBFichero extends FutbolistasDB{
    public String ficheroDatos = "futbolistas.txt";

    @Override
    public ArrayList<Futbolista> obtener() {
        ArrayList<Futbolista> futbolistas = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String futbolistaActual = scanner.next();
                String[] partes = futbolistaActual.split(",");

                Futbolista futbolista = new Futbolista();
                futbolista.nombreUsuario = partes[0];
                futbolista.nombre = partes[1];
                futbolista.apellidos = partes[2];
                futbolista.email = partes[3];
                futbolista.nivelAcceso = Integer.parseInt(partes[4]);
                futbolistas.add(futbolista);
            }
            scanner .close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

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
