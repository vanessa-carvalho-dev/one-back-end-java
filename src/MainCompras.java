import java.util.Scanner;

public class MainCompras {
    public static void main(String[] args) {
        Scanner leituraDoTeclado = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        float limite = leituraDoTeclado.nextFloat();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int menu = 1;
        while (menu != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leituraDoTeclado.next();

            System.out.println("Digite o valor da compra:");
            float valor = leituraDoTeclado.nextFloat();

            Compra item = new Compra(descricao, valor);
            if(!cartao.novaCompra(item)){
                System.out.println("Saldo insuficiente!");
            }
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para SAIR ou 1 para CONTINUAR");
            menu = leituraDoTeclado.nextInt();
        }

        //listagem compras

    }
}
