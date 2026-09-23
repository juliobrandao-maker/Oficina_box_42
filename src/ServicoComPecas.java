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
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Este é o valor das peças: " + valorPecas+ "\n");
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }
}
