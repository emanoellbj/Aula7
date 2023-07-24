
public class Calculadora {
    public static void main(String[] args) {

        // Subtracao: 10 - 5
        Subtracao subtracao = new Subtracao();
        double resultadoSubtracao = subtracao.executa(10, 5);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        // Multiplicacao: 6 * 2
        Multiplicacao multiplicacao = new Multiplicacao();
        double resultadoMultiplicacao = multiplicacao.executa(6, 2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        // Divisao: 15 / 3
        Divisao divisao = new Divisao();
        double resultadoDivisao = divisao.executa(15, 3);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
        
        // Exponenciacao: 2 ^ 3
        Exponenciacao exponenciacao = new Exponenciacao();
        double resultadoExponenciacao = exponenciacao.executa(2, 3);
        System.out.println("2 elevado a 3 = " + resultadoExponenciacao);

        // Percent: 10 % 40
        Percent percent = new Percent();
        double resultadoPercent = percent.executa(10, 40);
        System.out.println("10 porcento de 40 = " + resultadoPercent);
    }
}