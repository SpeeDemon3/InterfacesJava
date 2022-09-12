package AplicandoO.ConInterfaz;

public class CocheElectrico implements InterfazVehiculo{
    String tipo;
    String baterias;

    public CocheElectrico(String tipo) {
        this.tipo = tipo;
        this.baterias = "si";
    }

    public String getBaterias() {
        return this.baterias;
    }

    @Override
    public String getTipoVehiculo() {
        return null;
    }
}
