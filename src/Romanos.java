
import java.util.Scanner;

class Romanos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entrada;

        try {

            do {
                System.out.println("**********************\n"
                        + "Converter Inteiros para Romanos\n"
                        + "[-1] Sair\n"
                        + "**********************\n"
                        + "Digite um número inteiro: ");

                entrada = scanner.nextInt();

                System.out.println("O nº inteiro convertido para algarismo romano é: " + converterInteiroParaRomano(entrada));
            } while (entrada != -1);

        }catch (Exception ex){
            System.out.println(ex.toString()+" - Erro na operação!");
        }
    }

    public static String converterInteiroParaRomano(Integer numeroDecimal) {

        numeroDecimal--;
        String conveterRomano;

        String[] iniciaValores = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int i=0; i < 10; i++) {
            if (numeroDecimal == i) {
                conveterRomano = iniciaValores[i];
                return conveterRomano;
            }
        }
        return "Número deve ser de 1 até 10";
    }
}