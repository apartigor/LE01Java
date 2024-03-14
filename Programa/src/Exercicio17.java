import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o peso e a nota 1 do aluno");
        int peso1 = ler.nextInt();
        double nota1 = ler.nextDouble();
        System.out.println("Digite o peso e a nota 2 do aluno");
        int peso2 = ler.nextInt();
        double nota2 = ler.nextDouble();
        System.out.println("Digite o peso e a nota 3 do aluno");
        int peso3 = ler.nextInt();
        double nota3 = ler.nextDouble();

        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.printf("Média Aritmética: %.2f", media);
        ler.close();
    }
}
