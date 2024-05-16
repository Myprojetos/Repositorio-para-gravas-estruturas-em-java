public class EstruturaForArray {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        int[] numeros = { 1, 2, 3, 4, 5 };

        // Utilizando um laço for para iterar sobre o array
        for (int i = 0; i < numeros.length; i++) {
            // Imprimindo cada elemento do array
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }


        //for each

        // O for-each é ideal para iterar sobre todos os elementos de arrays e coleções
        // de maneira simples e legível, sem a complexidade de manipular índices. É
        // particularmente útil quando você não precisa modificar a coleção ou array
        // durante a iteração.

        // utilizando For Each
        for (int nume : numeros) {
            System.out.println(nume);
        }
    }

}
