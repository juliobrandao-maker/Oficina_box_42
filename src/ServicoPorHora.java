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
    public void exibirInformacoesBase(){
        super.exibirInformacoesBase();
        System.out.println("\nEste é o valor por hora Trabalhada: " + valorHora);
        System.out.println("\nEsta é a quantidade de horas trabalhadas: " + horasTrabalhadas );
    }

    }


