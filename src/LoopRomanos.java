
class LoopRomanos {
    public static void main(String[] args) {

        System.out.println("\nConvertendo com FOR: \n"
                + "==================================================\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("O número convertido para algarismo romano é: " + converterInteiroParaRomanos(i));
        }

        System.out.println("\nConvertendo com WHILE: \n"
                + "==================================================\n");

        int i = 1;

        while (i <= 10) {
            System.out.println("O número convertido para algarismo romano é: " + converterInteiroParaRomanos(i));
            i++;
        }

        System.out.println("\nConvertendo do maior para o menor: \n"
                + "==================================================\n");

        for (i = 10; i >= 1; i--) {
            System.out.println("O número convertido para algarismo romano é: " + converterInteiroParaRomanos(i));
        }
    }

    public static String converterInteiroParaRomanos(int numeroDecimal) {

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