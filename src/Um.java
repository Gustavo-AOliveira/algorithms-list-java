import java.util.Scanner;

public class Um {
    /*************************************************************************
     *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
     *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
     *
     *************************************************************************/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double estoqueMedio, quantidadeMinima, quantidadeMaxima;

        System.out.println("Calcudora de estoque médio!\n");

        System.out.println("Digite a quantiade mínima: ");
        quantidadeMinima = scanner.nextDouble();

        System.out.println("Digite a quantidae máxima: ");
        quantidadeMaxima = scanner.nextDouble();

        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("Estoque médio: " + estoqueMedio);
    }
}
