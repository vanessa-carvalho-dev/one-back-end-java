public class Compra {
    private String descricao;
    private float valor;

    public Compra(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }
}
