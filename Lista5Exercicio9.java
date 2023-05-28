import java.util.Scanner;

public class Lista5Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("O reverso do número é: " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
