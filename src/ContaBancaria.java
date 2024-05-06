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

        String menu = """
                ** Digite sua opção: **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                """;

        int opcao = 0;

        while(opcao != 4){
            System.out.println(menu);
            Scanner leituraDoTeclado = new Scanner(System.in);
            opcao = leituraDoTeclado.nextInt();

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
                        System.out.println(String.format("Seu novo saldo é: R$ %.2f", saldo));

                    }
                    break;
                case 3:
                    System.out.println("Qual o valor a ser transferido?");
                    double valorTransferencia = leituraDoTeclado.nextDouble();

                    if (valorTransferencia > saldo) {
                        System.out.println("Não há saldo para realizar a transferência");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println(String.format("Seu novo saldo é: R$ %.2f", saldo));
                    }
                    break;
                case 4:
                    System.out.println("Aplicação finalizada. Volte sempre ^^");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}