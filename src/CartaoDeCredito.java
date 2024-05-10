import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private float limite;
    private float saldo;
    private List<Compra> compras;

    public CartaoDeCredito(float limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean novaCompra(Compra item){
        if (item.getValor() > this.saldo){
            return false;
        }
        this.compras.add(item);
        this.saldo -= item.getValor();
        return true;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public float getSaldo() {
        return saldo;
    }
}
