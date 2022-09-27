import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Menu.GerarMenu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n\n====================================================");
                    SaldoContaCorrente();
                    System.out.println("====================================================\n\n");
                    break;

                case 2:
                    System.out.println("\n\n====================================================");
                    SaldoContaPoupanca();
                    System.out.println("====================================================\n\n");
                    break;

                case 3:
                    SaqueContaCorrente();
                    break;

                case 4:
                    SaqueContaPoupanca();
                    break;
                case 5:
                    DepositoContaCorrente();
                    break;
                case 6:
                    DepositoContaPoupanca();

                    break;
                case 7:
                    System.out.println("\n\n====================================================");
                    ExtratoContaCorrente();
                    System.out.println("====================================================\n\n");
                    break;
                case 8:
                    System.out.println("\n\n====================================================");
                    ExtratoContaPoupanca();
                    System.out.println("====================================================\n\n");
                    break;
                case 0:
                    System.out.println("\n\n====================================================");
                    System.out.println("Volte Sempre");
                    System.out.println("====================================================\n\n");
                    break;

                default:
                    System.out.println("\n\n====================================================");
                    System.out.println("Opção inválida.");
                    System.out.println("====================================================\n\n");
            }
        } while (opcao != 0);
    }

    final static Cliente cli = new Cliente(002, 444, "Teste 2", "02/11/1993", "111.333.222.44");

    public static void SaldoContaCorrente() {
        final int saldo = cli.getSaldoContaCorrente();
        System.out.println("O saldo da conta corrente é: " + saldo);
    }

    public static void SaldoContaPoupanca() {
        final int saldo = cli.getSaldoContaPoupanca();
        System.out.println("O saldo da conta poupança é: " + saldo);
    }

    public static void SaqueContaPoupanca() {
        final int saldo = cli.getSaldoContaPoupanca();
        System.out.println("Valor em conta: " + saldo);
        System.out.println("Valor do Saque");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        if (valor >= saldo) {
            System.out.println("\n\n====================================================");
            System.out.println("Valor não disponível em conta!!");
            System.out.println("====================================================\n\n");
        } else {

            cli.saqueContaPoupanca(valor);
            cli.adicionarExtratoContaPoupanca("Saque no valor de: " + valor);
        }

    }

    public static void SaqueContaCorrente() {
        final int saldo = cli.getSaldoContaCorrente();
        System.out.println("Valor em conta: " + saldo);
        System.out.println("Valor");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        if (valor >= saldo) {
            System.out.println("\n\n====================================================");
            System.out.println("Valor não disponível em conta!!");
            System.out.println("====================================================\n\n");
        } else {

            cli.saqueContaCorrente(valor);
            cli.adicionarExtratoContaCorrente("Saque no valor de: " + valor);
        }
    }

    public static void DepositoContaPoupanca() {
        System.out.println("Valor");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        cli.depositoContaPoupanca(valor);
        cli.adicionarExtratoContaPoupanca("Deposito no valor de: " + valor);

    }

    public static void DepositoContaCorrente() {
        System.out.println("Valor");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        cli.depositoContaCorrente(valor);
        cli.adicionarExtratoContaCorrente("Deposito no valor de: " + valor);
    }

    public static void ExtratoContaPoupanca() {
        System.out.println( cli.getExtratoContaPoupanca());
    }

    public static void ExtratoContaCorrente() {
        System.out.println( cli.getExtratoContaCorrente());
       
    }

}
