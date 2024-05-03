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

        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        int opcao = leitorTeclado.nextInt();

        while(opcao != 4){
            switch (opcao){
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Em desenvolvimento...");
                    break;
                case 3:
                    System.out.println("Em desenvolvimento...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("""
                Operações

                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.println("Digite a opção desejada:");
            opcao = leitorTeclado.nextInt();
        }

    }
}