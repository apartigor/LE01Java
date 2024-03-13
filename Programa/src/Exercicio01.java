import java.util.Scanner;

public class Exercicio01 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O número é maior do que 10!");
        } else {
            System.out.println("O número é menor ou igual a 10!");
        }

        scanner.close();
    }
}
