public class EstruturaCondicionalEncadeada {

    //Exemplo de estrutura condicional encadeada
    public static void main(String[] args) {
        int nota = 6;

        if (nota < 5) {
            System.out.println("Reprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em Recuperação.");
        } else {
            System.out.println("Aprovado!");
        }
    }
    
}
