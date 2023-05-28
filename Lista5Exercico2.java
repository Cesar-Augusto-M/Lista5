import java.util.Scanner;

public class Lista5Exercico2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        
     
        double novoPreco = calcularAcrescimo(preco);
        
        System.out.println("O preço do produto acrescido de 10% é: " + novoPreco);
        
        scanner.close();
    }
    
    public static double calcularAcrescimo(double preco) {

        double acrescimo = preco * 0.10;
        double novoPreco = preco + acrescimo;
        return novoPreco;
    }
}
