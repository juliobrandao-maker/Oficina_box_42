public class BaseServico {
    private  String descricao;
    private double valorBase;

    public BaseServico(String descricao, double valorBase){
        this.descricao=descricao;
        this.valorBase=valorBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public double calcularPrecoFinal(){
        return valorBase;
    }
    public void exibirInformacoesBase() {
        System.out.println("Esta é a descrição do serviço: " + descricao);
        System.out.println("Este é o Valor Base do seu Serviço: " + valorBase);
    }

}
