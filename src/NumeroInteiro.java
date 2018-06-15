
import java.util.Scanner;

class NumeroInteiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double entrada;

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

    }

    public static String verificarNumeroInteiro(Double entrada) {

        if (entrada % 1 == 0) {
            return "É um número inteiro!";
        }
        return "Não é um número inteiro!";
    }
}