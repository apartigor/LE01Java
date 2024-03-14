import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a velocidade média do carro (KM/h)");
        double velMedia = ler.nextDouble();
        System.out.println("Digite o tempo(Horas) da viagem");
        double horas = ler.nextInt();

        double dist = horas * velMedia;
        double litrosCons = dist / 12;

        System.out.printf("Foram consumidos %.2f litros nessa viagem de %.2f Km", litrosCons, dist);



        ler.close();
    }
}
