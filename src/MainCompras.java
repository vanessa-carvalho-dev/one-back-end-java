import java.util.Scanner;

public class MainCompras {
    public static void main(String[] args) {
        Scanner leituraDoTeclado = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        float limite = leituraDoTeclado.nextFloat();

        System.out.println("Digite a descrição da compra:");
        String descricao = leituraDoTeclado.next();

        System.out.println("Digite o valor da compra:");
        float valor = leituraDoTeclado.nextFloat();

        System.out.println("Compra realizada!");

    }
}
