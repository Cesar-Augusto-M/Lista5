public class Lista5Exercicio7 {
    public static void main(String[] args) {
        int numero = 10;
        char resultado = verificarValor(numero);
        System.out.println("O resultado é: " + resultado);
    }

    public static char verificarValor(int valor) {
        if (valor > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
