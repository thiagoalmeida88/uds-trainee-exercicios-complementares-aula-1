
import java.util.Scanner;

class NumeroInteiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double entrada;

        try {

            do {
                System.out.println("*******************\n"
                        + "Numeros inteiros\n"
                        + "[-1]Sair\n"
                        + "*******************\n"
                        + "Digite um número: \n");

                entrada = scanner.nextDouble();

                System.out.println("*******************\n"
                        + "Resultado: \n" + verificarNumeroInteiro(entrada));
            } while (entrada != -1);

        } catch (Exception ex) {
            System.out.println(ex.toString() + " - Erro na operação!");
        }
    }

    public static String verificarNumeroInteiro(Double entrada) {

        int aux = entrada.intValue();

        if (aux == entrada) {
            return " É um número inteiro!";
        }
        return " Não é um número inteiro!";
    }
}