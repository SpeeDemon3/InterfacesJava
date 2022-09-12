package AplicandoS.EjemploUsuarios;

public class Usuario {
    // La clase usuario tendria que tener como funcion principal gestionar usuarios
    public void crearUsuario(String username) {}
    public void obtenerUsuario(String username) {}

    // Enviar un email no cumple el uso de responsabilidad unica, habria que tener una
    // clase dedicada a la gestion de correos
    // public void enviarEmail(String username) {}

    public void notificarUsuario(String username) {
        Emailer emailer = new Emailer();
        emailer.enviarEmail(this);
    }

}
