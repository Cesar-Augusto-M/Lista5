public class Lista5Exercico6 {
    public static void main(String[] args) {
        int argumento1 = 2;
        int argumento2 = 4;
        int argumento3 = 6;
        
        int resultado = somaTresArgumentos(argumento1, argumento2, argumento3);
        System.out.println("A soma dos três argumentos é: " + resultado);
    }
    
    public static int somaTresArgumentos(int arg1, int arg2, int arg3) {
        return arg1 + arg2 + arg3;
    }
}
