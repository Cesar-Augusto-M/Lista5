import java.util.Scanner;

public class Lista5Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto em porcentagem: ");
        double taxaImposto = scanner.nextDouble();

        System.out.print("Digite o custo do item antes do imposto: ");
        double custo = scanner.nextDouble();

        double custoComImposto = somaImposto(taxaImposto, custo);

        System.out.println("O custo do item com imposto é: " + custoComImposto);
        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        double custoComImposto = custo + imposto;
        return custoComImposto;
    }
}
