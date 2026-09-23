public class ServicoComPecas extends BaseServico{
    private double valorPecas;
    public ServicoComPecas(String descricao, double valorBase, double valorPecas){
        super(descricao,valorBase);
        this.valorPecas=valorPecas;
    }
    @Override
    public double calcularPrecoFinal(){

        return super.calcularPrecoFinal() + valorPecas;
    }
}
