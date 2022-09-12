package AplicandoS;

public class Vehiculo {
    private int velocidad;

    public void acelerar() {
        velocidad++;
    }

    public void frenar() {
        velocidad--;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Este metodo no deveria ir en la clase vehiculo porque no concuerda con la clase
    // El vehiculo no se echa gasolina a si mismo
    // public echarGasolina() {}

}
