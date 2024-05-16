import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) {

        // Neste exemplo para ilustrar o "Do-while", uma pessoa liga para seu amigo pra
        // passar uma noticia. Enquanto o telefone estiver "tocando", o bloco sera executado
        // repetidamente(de forma aleatoria, por isso o metodo random) até que o telefone seja "atendido"

        System.out.println("Discando...");

        do {
            // executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }
}
