import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu para o usuário
        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("1. Exercício 1");
        System.out.println("2. Exercício 2");
        System.out.println("3. Exercício 3");
        System.out.println("4. Exercício 4");
        System.out.println("5. Exercício 5");
        System.out.println("6. Exercício 6");
        // Adicione mais opções de menu conforme necessário

        // Lê a escolha do usuário
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Executa o exercício selecionado
        switch (opcao) {
            case 1:
                executarExercicio1();
                break;
            case 2:
                executarExercicio2();
                break;
            case 3:
                executarExercicio3();
                break;
            case 4:
                executarExercicio4();
                break;
            case 5:
                executarExercicio5();
                break;
            case 6:
                executarExercicio6();
                break;
            // Adicione mais casos conforme necessário
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static void executarExercicio1() {
        Exercicio01 exercicio = new Exercicio01();
        exercicio.executar();
    }

    public static void executarExercicio2() {
        Exercicio02 exercicio = new Exercicio02();
        exercicio.executar();
    }

    public static void executarExercicio3() {
        Exercicio03 exercicio = new Exercicio03();
        exercicio.executar();
    }

    public static void executarExercicio4() {
        Exercicio04 exercicio = new Exercicio04();
        exercicio.executar();
    }

    public static void executarExercicio5() {
        Exercicio05 exercicio = new Exercicio05();
        exercicio.executar();
    }

    public static void executarExercicio6() {
        Exercicio06 exercicio = new Exercicio06();
        exercicio.executar();
    }
}
