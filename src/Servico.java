public class Servico {
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
         return valor;
    }
    public void exibiServico() {
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
    }

}
