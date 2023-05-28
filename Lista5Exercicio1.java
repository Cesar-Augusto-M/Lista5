import java.util.Scanner;

public class Lista5Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double MediaAritmetica = calcularMedia(numero1, numero2);
        System.out.println("A média aritmética dos números é: " + MediaAritmetica);
        scanner.close();
    }
    
    public static double calcularMedia(double numeroUm, double numeroDois) {
        return (numeroUm + numeroDois) / 2;
        
    }
}
