
import java.util.Scanner;

class RegiaoProduto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entrada;

        try {

            do {
                System.out.println("*******************\n"
                        + "Produtos do Brasil - Regiões \n"
                        + "[-1]Sair\n"
                        + "*******************\n"
                        + "Digite o número do produto: \n");

                entrada = scanner.nextInt();

                System.out.println("*******************\n"
                        + "Produto da Região: " + verificarRegiaoDoProduto(entrada));
            } while (entrada != -1);

        } catch (Exception ex) {
            System.out.println(ex.toString() + " - Erro na operação!");
        }
    }

    public static String verificarRegiaoDoProduto(Integer entrada) {

        switch (entrada) {
            case 1:
                return "Sul";
            case 2:
                return "Norte";
            case 3:
                return "Leste";
            case 4:
                return "Oeste";
            case 5:
            case 6:
                return "Nordeste";
            case 7:
            case 8:
            case 9:
                return "Sudeste";
            case 10:
                return "Centro-oeste";
            case 11:
                return "Noroeste";
            default:
                return "Produto importado";
        }
    }
}