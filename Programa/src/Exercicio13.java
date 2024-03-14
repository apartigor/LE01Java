import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número A");
        double numA = ler.nextDouble();
        System.out.println("Digite um número B");
        double numB = ler.nextDouble();
        ler.nextLine();
        System.out.println("Digite a operação que deseja (+, -, / ou *)");
        char op = ler.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                if (numB == 0) {
                    System.out.println("Impossível dividir por 0");
                    return;
                } else {
                    result = numA / numB;
                }
                break;
            default:
                System.out.println("Operador Inválido");
                return;
        }
        System.out.printf("%.2f %c %.2f = %.2f", numA, op, numB, result);
        ler.close();
    }
}
