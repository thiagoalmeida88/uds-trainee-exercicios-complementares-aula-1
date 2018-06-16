
import java.util.Scanner;

class PositivoNegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double entrada;

        try {

            do {
                System.out.println("*******************\n"
                        + "Positvo ou Negativo?\n"
                        + "[-1]Sair\n"
                        + "*******************\n"
                        + "Digite um número: \n");

                entrada = scanner.nextDouble();

                System.out.println("*******************\n"
                        + "Resultado: \n" + verificarPositivoOuNegativo(entrada));
            } while (entrada != -1);

        } catch (Exception ex) {
            System.out.println(ex.toString() + " - Erro na operação!");
        }
    }

    public static String verificarPositivoOuNegativo(Double entrada) {

        if (entrada >= 0) {
            return "É um número positivo!";
        }
        return "É um número negativo!";
    }
}