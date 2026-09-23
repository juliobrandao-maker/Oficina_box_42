public class ServicoDiagnostico extends BaseServico{
    private boolean possuiReparo;

    public ServicoDiagnostico(String descricao,double valorBase,boolean possuiReparo){
        super(descricao,valorBase);
        this.possuiReparo=possuiReparo;
    }
    @Override
    public double calcularPrecoFinal(){
        if (possuiReparo){
            return super.calcularPrecoFinal()/2;
        }
        return super.calcularPrecoFinal();
    }
    @Override
    public void exibirInformacoesBase(){
        super.exibirInformacoesBase();
        if (possuiReparo = true) {
            System.out.println("\nPossui reparo");
        }
        else {
            System.out.println("\nNão possui Reparo");
        }
    }
}
