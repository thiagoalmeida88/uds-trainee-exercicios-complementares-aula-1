#### 1. (1 ponto) O que são variáveis, e quais os seus tipos?

São objetos que possuem um espaço reservado na memória, no qual recebem algum tipo de dado conforme sua especificação. Integer (inteiros), Boolean (verdadeiro ou falso), Float (decimais), Numeric (numérico), String (texto, sempre entre aspas), Array (listas[]) e Object (objetos{}).

#### 2. (1 ponto) Explique com suas palavras, o que é Syntax (ou Sintaxe).

São palavras ou símbolos que significam algo na programação e que variam para cada linguagem específica, assim, diferenciando uma linguagem da outra.

#### 3. (1 ponto) Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.

```
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
```

#### 4. (1 ponto) Escreva uma função que receba um parâmetro e informe se o mesmo é ou não um número inteiro.

```
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
```

#### 5. (1 ponto) Escreva uma função para ler um valor, via Scanner, e alertar se é positivo ou negativo. Considere o valor zero como positivo.

```
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
```

#### 6. (1 ponto) Escreva uma função que leia o código de origem de um produto, via Scanner, e imprima na tela a região de sua procedência conforme a tabela abaixo:

Código 1: Sul
Código 2: Norte
Código 3: Leste
Código 4: Oeste
Código 5 ou 6: Nordeste
Código 7, 8 ou 9: Sudeste
Código 10: Centro-Oeste
Código 11: Noroeste
Observação: Caso o código não seja nenhum dos especificados o produto deve ser encarado como Importado.

```
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
                        + "Produto da Região: " +        verificarRegiaoDoProduto(entrada));
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
```

#### 7. (5 pontos) Resolver o exercícios hard core 3 dos slides acima citados.

```
import java.util.Scanner;

class Hard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entradaCategoria;
        Integer entradaArma;

        Double saldo = 1500.00;
        Double[] valoresArmas = new Double[]{};

        try {

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
                        Double[] valoresMetralhadoras = new Double[]{400.00, 560.00, 1090.00, 1200.00, 3600.00};
                        System.out.println("Categoria: Metralhadoras\n"
                                + "****************************************\n"
                                + "[1]P90 - " + valoresMetralhadoras[0] + "\n"
                                + "[2]K-47 - " + valoresMetralhadoras[1] + "\n"
                                + "[3]R-40 - " + valoresMetralhadoras[2] + "\n"
                                + "[4]F30 - " + valoresMetralhadoras[3] + "\n"
                                + "[5]SSW - " + valoresMetralhadoras[4] + "\n");

                        valoresArmas = valoresMetralhadoras;
                        break;

                    case 2:
                        Double[] valoresPistolas = new Double[]{200.00, 1500.00, 900.00, 1250.00, 600.00};
                        System.out.println("Categoria: Pistolas\n"
                                + "****************************************\n"
                                + "[1]P123190 - " + valoresPistolas[0] + "\n"
                                + "[2]K-12347 - " + valoresPistolas[1] + "\n"
                                + "[3]R1123-40 - " + valoresPistolas[2] + "\n"
                                + "[4]F13230 - " + valoresPistolas[3] + "\n"
                                + "[5]S132SW - " + valoresPistolas[4] + "\n");
                        valoresArmas = valoresPistolas;
                        break;

                    case 3:
                        Double[] valoresRifles = new Double[]{1100.00, 7560.00, 700.00, 400.00, 850.00};
                        System.out.println("Categoria: Rifles\n"
                                + "****************************************\n"
                                + "[1]T10 - " + valoresRifles[0] + "\n"
                                + "[2]K12 - " + valoresRifles[1] + "\n"
                                + "[3]R9000 - " + valoresRifles[2] + "\n"
                                + "[4]F33330 - " + valoresRifles[3] + "\n"
                                + "[5]SSwwwW - " + valoresRifles[4] + "\n");
                        valoresArmas = valoresRifles;
                        break;

                    case 4:
                        Double[] valoresFacas = new Double[]{120.00, 60.00, 300.00, 220.00, 500.00};
                        System.out.println("Categoria: Facas\n"
                                + "****************************************\n"
                                + "[1]Ninja - " + valoresFacas[0] + "\n"
                                + "[2]Seca - " + valoresFacas[1] + "\n"
                                + "[3]Serrinha - " + valoresFacas[2] + "\n"
                                + "[4]Cega - " + valoresFacas[3] + "\n"
                                + "[5]Lisa - " + valoresFacas[4] + "\n");
                        valoresArmas = valoresFacas;
                        break;

                    case 5:
                        Double[] valoresSerras = new Double[]{330.00, 580.00, 1350.00, 1400.00, 9000.00};
                        System.out.println("Categoria: Serras\n"
                                + "****************************************\n"
                                + "[1]Elétrica - " + valoresSerras[0] + "\n"
                                + "[2]Corta piso - " + valoresSerras[1] + "\n"
                                + "[3]Para Asfalto - " + valoresSerras[2] + "\n"
                                + "[4]Motorizada - " + valoresSerras[3] + "\n"
                                + "[5]Esmirilhadeira - " + valoresSerras[4] + "\n");
                        valoresArmas = valoresSerras;
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

        } catch (Exception ex) {
            System.out.println(ex.toString() + " - Erro na operação!");
        }
    }

    public static Double atualizarSaldo(Double valorArma, Double saldo) {

        return saldo - valorArma;
    }
}
```

## 8. (1 ponto) Foto do Github cadastrada no gravatar: OK!