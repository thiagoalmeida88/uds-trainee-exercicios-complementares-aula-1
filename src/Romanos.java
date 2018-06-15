
import java.util.Scanner;

class Romanos {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Integer entrada;

        do {
            System.out.println("Digite ai: ");

            entrada = scanner.nextInt();

            System.out.println("O número convertido para algarismo romano é: " + converterInteiroParaRomanos(entrada));
        } while (entrada != -1);
    }


    public static String converterInteiroParaRomanos(Integer numeroDecimal) {

        numeroDecimal--;
        String conveterRomano = "";
        Integer cont;

        String[] iniciaValores = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (cont = 0; cont < 10; cont++) {
            if (numeroDecimal == cont) {
                conveterRomano = iniciaValores[cont];
                return conveterRomano;
            }
        }
        return "Número deve ser de 1 até 10";
    }
}