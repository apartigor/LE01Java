import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o (x1, x2) do P1");
        double x1 = ler.nextDouble();
        double y1 = ler.nextDouble();

        System.out.println("Digite o (x2,y2) do P2");
        double x2 = ler.nextDouble();
        double y2 = ler.nextDouble();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distância entre os dois pontos é %.2f", dist);
        
        ler.close();
    }
}
