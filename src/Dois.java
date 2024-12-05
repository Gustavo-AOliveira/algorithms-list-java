import java.text.DecimalFormat;
import java.util.Scanner;

public class Dois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double cotacaoDollarAtual, valorEmReal, valorConvertido;

        System.out.print("Conversor de doláres para real!\n");

        System.out.print("Digite a cotação atual do dollar: ");
        cotacaoDollarAtual = scanner.nextDouble();

        System.out.println("Digite em REAIS o valor que você deseja converter para DOLÁRES: ");
        valorEmReal = scanner.nextDouble();

        valorConvertido = valorEmReal / cotacaoDollarAtual;

        System.out.printf("R$ %.2f equivalem a $ %.2f dólares%n", valorEmReal, valorConvertido);
        // Imprime o resultado formatado com o método printf:
        // % - Indica que estamos usando um especificador de formato.
        // .2f - Formata o número como um float com 2 casas decimais.
        // %n - Insere uma nova linha (compatível com diferentes sistemas).
        // O primeiro valor (valorEmReal) será substituído no primeiro %.2f.
        // O segundo valor (valorConvertido) será substituído no segundo %.2f.


    }
}
