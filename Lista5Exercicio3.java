import java.util.Scanner;

public class Lista5Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = converterParaCelsius(temperaturaFahrenheit);

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " °C");

        scanner.close();
    }

    public static double converterParaCelsius(double temperaturaFahrenheit) {
        double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
        return temperaturaCelsius;
    }
}
