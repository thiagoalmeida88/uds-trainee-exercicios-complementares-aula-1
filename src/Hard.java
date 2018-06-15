import java.util.Scanner;

class Hard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entradaCategoria;
        Integer entradaArma;
        Double saldo = 1500.00;

        Double[] valoresMetralhadoras = new Double[]{400.00, 560.00, 1090.00, 1200.00, 3600.00};
        Double[] valoresPistolas = new Double[]{200.00, 1500.00, 900.00, 1250.00, 600.00};
        Double[] valoresRifles = new Double[]{1100.00, 7560.00, 700.00, 400.00, 850.00};
        Double[] valoresFacas = new Double[]{120.00, 60.00, 300.00, 220.00, 500.00};
        Double[] valoresSerras = new Double[]{330.00, 580.00, 1350.00, 1400.00, 9000.00};


        do {
            System.out.println("****************************************\n"
                    + "Sistema de Compras 1.0\n"
                    + "****************************************\n"
                    + "[1]Metralhadoras\n"
                    + "[2]Pistolas\n"
                    + "[3]Rifles\n"
                    + "[4]Facas\n"
                    + "[5]Serras\n"
                    + "[-1]Sair\n"
                    + "****************************************\n"
                    + "Digite o número da categoria desejada: ");

            entradaCategoria = scanner.nextInt();


            switch (entradaCategoria) {

                case 1:
                    System.out.println("Categoria: Metralhadoras\n"
                            + "****************************************\n"
                            + "[1]P90 - " + valoresMetralhadoras[0] + "\n"
                            + "[2]K-47 - " + valoresMetralhadoras[1] + "\n"
                            + "[3]R-40 - " + valoresMetralhadoras[2] + "\n"
                            + "[4]F30 - " + valoresMetralhadoras[3] + "\n"
                            + "[5]SSW - " + valoresMetralhadoras[4] + "\n");
                    break;

                case 2:
                    System.out.println("Categoria: Pistolas\n"
                            + "****************************************\n"
                            + "[1]P123190 - " + valoresPistolas[0] + "\n"
                            + "[2]K-12347 - " + valoresPistolas[1] + "\n"
                            + "[3]R1123-40 - " + valoresPistolas[2] + "\n"
                            + "[4]F13230 - " + valoresPistolas[3] + "\n"
                            + "[5]S132SW - " + valoresPistolas[4] + "\n");
                    break;

                case 3:
                    System.out.println("Categoria: Rifles\n"
                            + "****************************************\n"
                            + "[1]T10 - " + valoresRifles[0] + "\n"
                            + "[2]K12 - " + valoresRifles[1] + "\n"
                            + "[3]R9000 - " + valoresRifles[2] + "\n"
                            + "[4]F33330 - " + valoresRifles[3] + "\n"
                            + "[5]SSwwwW - " + valoresRifles[4] + "\n");
                    break;

                case 4:
                    System.out.println("Categoria: Facas\n"
                            + "****************************************\n"
                            + "[1]Ninja - " + valoresFacas[0] + "\n"
                            + "[2]Seca - " + valoresFacas[1] + "\n"
                            + "[3]Serrinha - " + valoresFacas[2] + "\n"
                            + "[4]Cega - " + valoresFacas[3] + "\n"
                            + "[5]Lisa - " + valoresFacas[4] + "\n");
                    break;

                case 5:
                    System.out.println("Categoria: Serras\n"
                            + "****************************************\n"
                            + "[1]Elétrica - " + valoresSerras[0] + "\n"
                            + "[2]Corta piso - " + valoresSerras[1] + "\n"
                            + "[3]Para Asfalto - " + valoresSerras[2] + "\n"
                            + "[4]Motorizada - " + valoresSerras[3] + "\n"
                            + "[5]Esmirilhadeira - " + valoresSerras[4] + "\n");
                    break;

                case -1:
                    System.out.println("Obrigado por utilizar nosso sistema. Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida! Digite opções de 1 a 5.");
                    break;
            }

            if (entradaCategoria > 0 && entradaCategoria < 6) {

                System.out.println("Digite o número da arma para comprá-la: ");
                entradaArma = scanner.nextInt();

                if (entradaArma > 0 && entradaArma < 6) {

                    entradaArma--;

                    Double valorArma = 0.00;
                    Double[] valoresArmas = new Double[]{};

                    switch (entradaCategoria) {
                        case 1:
                            valoresArmas = valoresMetralhadoras;
                            break;
                        case 2:
                            valoresArmas = valoresPistolas;
                            break;
                        case 3:
                            valoresArmas = valoresRifles;
                            break;
                        case 4:
                            valoresArmas = valoresFacas;
                            break;
                        case 5:
                            valoresArmas = valoresSerras;
                            break;
                    }

                    for (int i = 0; i < 5; i++) {
                        if (entradaArma == i) {
                            valorArma = valoresArmas[i];
                        }
                    }

                    System.out.println("Valor da arma: R$ " + valorArma);
                    System.out.println("Saldo atual: " + ((valorArma <= saldo) ? ("R$ " + (saldo = atualizarSaldo(valorArma, saldo)))
                            : "Você não tem saldo suficiente ( R$ " + saldo + " )"));

                } else {
                    System.out.println("Opção inválida! Digite opções de 1 a 5.");
                }
            }

        } while (entradaCategoria != -1);
    }

    public static Double atualizarSaldo(Double valorArma, Double saldo) {

        return saldo - valorArma;
    }
}