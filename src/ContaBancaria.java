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
    }
}