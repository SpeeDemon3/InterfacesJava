package AplicandoO.ConInterfaz;

public class Coche implements InterfazVehiculo {
    String tipo;

    public Coche(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }
}
