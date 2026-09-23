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
    public void exibirInformacoes(){
        super.exibirInformacoes();
        if (possuiReparo == true) {
            System.out.println("Possui reparo" + "\n");
        }
        else {
            System.out.println("Não possui Reparo" +"\n");
        }
    }

    public boolean isPossuiReparo() {
        return possuiReparo;
    }

    public void setPossuiReparo(boolean possuiReparo) {
        this.possuiReparo = possuiReparo;
    }
}
