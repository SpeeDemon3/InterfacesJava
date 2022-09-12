package AplicandoI.ImplementandoInterfacesPequeñas;

public class RelojImpl implements Reloj{
    @Override
    public String horaActual() {
        return "10";
    }

    @Override
    public String minutoActual() {
        return "03";
    }

    @Override
    public String segundoActual() {
        return "50";
    }

}
