import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a nota 1 do aluno");
        double nota1 = ler.nextDouble();
        System.out.println("Digite a nota 2 do aluno");
        double nota2 = ler.nextDouble();
        System.out.println("Digite a nota 3 do aluno");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f", media);
    }
}
