import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro termo(A1) da PA");
        double a1 = ler.nextDouble();
        System.out.println("Digite o número de termos(n) da PA");
        double n = ler.nextDouble();
        System.out.println("Digite a razão(R) da PA");
        double r = ler.nextDouble();

        double an = (a1 + (n - 1) * r);

        System.out.println("A n-ésimo termo(An) da PA é " + an);
        
        ler.close();
    }
}
