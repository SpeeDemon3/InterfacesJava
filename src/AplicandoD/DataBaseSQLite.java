package AplicandoD;

public class DataBaseSQLite implements DataBaseStore{
    @Override
    public void guardar(Usuario usuario) {
        System.out.println("Soy guardar() en DataBaseSQLite");
    }
}
