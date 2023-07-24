
public class Percent extends Operacao {
    @Override
    public double executa(double a, double b) {
        return (a / 100) * b;
    }
}