public class ServicoPorHora extends BaseServico{
        private double horasTrabalhadas;
        private double valorHora;
        public ServicoPorHora(String descricao, double valorBase, double horasTrabalhadas,double valorHora){
            super(descricao,valorBase);
            this.valorHora=valorHora;
            this.horasTrabalhadas=horasTrabalhadas;
        }
        @Override
        public double calcularPrecoFinal(){

            return super.calcularPrecoFinal() + (horasTrabalhadas*valorHora);
        }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Este é o valor por hora Trabalhada: " + valorHora);
        System.out.println("\nEsta é a quantidade de horas trabalhadas: " + horasTrabalhadas + "\n" );
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}


