import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entrada;

        try {

            do {
                System.out.println("**********************\n"
                        + "Par ou ímpar?\n"
                        + "[-1] Sair\n"
                        + "**********************\n"
                        + "Digite um número: ");

                entrada = scanner.nextInt();


                System.out.println("***********************\n"
                        + "Resultado: " + resultadoFinal(entrada));

            } while (entrada != -1);

        } catch (Exception ex) {
            System.out.println(ex.toString() + " - Erro na operação!");
        }
    }

    public static String resultadoFinal(Integer entrada) {

        if (entrada % 2 == 0) {
            return "Número Par!";
        }
        return "Número Ímpar!";
    }
}