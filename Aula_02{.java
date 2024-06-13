import java.util.Scanner;

public class Aula_02 {
    public static void main(String[] args) {
        // Passo 1: Importar a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Criar o Vetor
        int[] numeros = new int[10];

        // Passo 3: Ler os Números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Passo 4: Calcular a Soma
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Passo 5: Exibir a Soma
        System.out.println("A soma dos elementos é: " + soma);
    }
}

