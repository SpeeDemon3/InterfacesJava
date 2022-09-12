package AplicandoO.ConClaseAbstracta;

public class CocheElectrico extends Vehiculo{
    String baterias;

    public CocheElectrico(String tipo) {
        this.tipo = tipo;
        this.baterias = "si";
    }

    public String getBaterias() {
        return this.baterias;
    }

}
