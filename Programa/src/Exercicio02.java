import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("\nDigite o segundo numero:");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma total deu : " + soma);

        sc.close();
    }
}