package AplicandoL;

public class AritmeticaMejoradaChivata extends Aritmetica{
    @Override
    public int suma(int a, int b) {
        System.out.println("Estoy en suma()");
        return a + b;
    }

    @Override
    public int resta (int a, int b) {
        System.out.println("Estoy en resta()");
        return a - b;
    }

    @Override
    public int division(int a, int b) {
        System.out.println("Estoy en division()");
        return a / b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        System.out.println("Estoy en multiplicacion()");
        return a * b;
    }
}
