import java.util.Scanner;

public class Exercicio18 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a nota 1 do aluno");
        double nota1 = ler.nextDouble();
        System.out.println("Digite a nota 2 do aluno");
        double nota2 = ler.nextDouble();
        System.out.println("Digite a nota 3 do aluno");
        double nota3 = ler.nextDouble();

        double media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.printf("Média Harmônica: %.2f", media);
        ler.close();
    }
}
