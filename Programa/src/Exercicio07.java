public class Exercicio07 {
    public static void executar() {
        String nome = Prompt.lerLinha("Digite o nome");
        double nota = Prompt.lerDecimal("Digite a nota");
        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Nota: " + nota);
    }
}
