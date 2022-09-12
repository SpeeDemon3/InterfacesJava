package AplicandoD;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Antonio");

        DataBaseStore db = new DataBaseMySQL();
        guardarEnBaseDeDatos(db, usuario);

    }

    public static void guardarEnBaseDeDatos(DataBaseStore db, Usuario usuario) {
        db.guardar(usuario);
    }

}
