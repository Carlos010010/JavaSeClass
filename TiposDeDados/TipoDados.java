import java.util.Scanner;

public class TipoDados {
    public static void main(String[] args) {

        // Tipos de dados primitivos
        // TIPOS INTEIROS
        byte idade; // Inicializando a variavel
        short numeroPequeno = 32000;
        idade = 23; // Atribuindo o valor
        int numeroInteiro = 233;
        long numeroLongo = 12L;

        System.out.println(idade);
        
        // Salva
        // Compila: javac TipoDados.java ou *.java
        // Executa: java TipoDados

        // Entrada -> Processamento -> Saida
        // System.out.println
        // Instancia objeto que lida com entrada de dados.
        Scanner entrada = new Scanner(System.in);
        // int entradaInteiro = entrada.nextInt();
        // System.out.println(entradaInteiro);

        // OPERACOES ARITIMETICAS
        System.out.println("informe o numero que corresponde a letra A");
        int a = entrada.nextInt();
        System.out.println("informe o numero que corresponde a letra B");
        int b = entrada.nextInt();

        int tord = a / b;
        int sub = a - b;
        int som = a + b;
        int mult = a * b;
        
        System.out.println("A divisao de A e B = "+ tord);
        System.out.println("A subtracao de A e B = "+ sub);
        System.out.println("A soma de A e B = "+ som);
        System.out.println("A multiplicacao de A e B = "+ mult);


        // Receba dois numeros a e b.
        // Processar em todas as operacoes artimeticas (+, -, /, *).
        // Saida com os resutaldos
    }
}