import java.util.Scanner;

public class Lista5Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double mediaAritmetica = calcularMediaAritmetica(valor1, valor2, valor3);
        double mediaHarmonica = calcularMediaHarmonica(valor1, valor2, valor3);
        double mediaGeometrica = calcularMediaGeometrica(valor1, valor2, valor3);

        System.out.println("A média aritmética é: " + mediaAritmetica);
        System.out.println("A média harmônica é: " + mediaHarmonica);
        System.out.println("A média geométrica é: " + mediaGeometrica);

        scanner.close();
    }

    public static double calcularMediaAritmetica(double valor1, double valor2, double valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public static double calcularMediaHarmonica(double valor1, double valor2, double valor3) {
        return 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
    }

    public static double calcularMediaGeometrica(double valor1, double valor2, double valor3) {
        return Math.pow(valor1 * valor2 * valor3, 1.0 / 3.0);
    }
}
