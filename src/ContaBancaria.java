import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Vanessa Carvalho";
        String tipoConta = "Corrente";
        double saldo = 5000;

        System.out.println("""
                ************************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ************************************************
                """.formatted(nome, tipoConta, saldo));

        System.out.println("""
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

        Scanner leituraDoTeclado = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        int opcao = leituraDoTeclado.nextInt();

        while(opcao != 4){
            switch (opcao){
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Qual o valor a ser depositado na sua conta?");
                    double valorDeposito = leituraDoTeclado.nextDouble();

                    if (valorDeposito <= 0) {
                        System.out.println("Não é possível depositar valores inferiores a R$ 0,00");
                    } else {
                        saldo += valorDeposito;
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor a ser transferido?");
                    double valorTransferencia = leituraDoTeclado.nextDouble();

                    if (valorTransferencia > saldo) {
                        System.out.println("Você não tem saldo suficiente. Realize um depósito");
                    } else {
                        saldo -= valorTransferencia;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("""
                ---------------------------------------------------
                Operações

                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.println("Digite a opção desejada:");
            opcao = leituraDoTeclado.nextInt();
        }

    }
}