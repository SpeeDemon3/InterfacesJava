package arquitectura.limpia.demo.entities;

public class Futbolista {
    public String nombreUsuario;
    public String nombre;
    public String apellidos;
    public String email = "";
    public int nivelAcceso;

    @Override
    public String toString() {
        return "Nombre usuario: " + nombreUsuario + "\r\n"
                + "Nombre: " + nombre + "\r\n"
                + "Apellidos: " + apellidos + "\r\n"
                + "Email: " + email + "\r\n"
                + "Nivel de acceso:" + nivelAcceso;
    }
}
