public class EstruturaCondicionalTernario {

    //Exemplo de estrutura condicional ternaria.
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperaçãp" : "Reprovado";

        System.out.println(resultado);
    }
    
}
