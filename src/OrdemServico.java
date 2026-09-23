public class OrdemServico {
    private String nomecliente;
    private Veiculo veiculo;
    private BaseServico[] servicos;
    private int qtdServicos; // Contador de serviços inseridos

    // Recebe a capacidade máxima que esta ordem pode suportar de serviços
    public OrdemServico(String nomecliente, Veiculo veiculo, int capacidadeMaximaServicos) {
        this.nomecliente = nomecliente;
        this.veiculo = veiculo;
        this.servicos = new BaseServico[capacidadeMaximaServicos];
        this.qtdServicos = 0;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public BaseServico[] getServicos() {
        return servicos;
    }

    public int getQtdServicos() {
        return qtdServicos;
    }

    public void addServico(BaseServico servico) {
        if (qtdServicos < servicos.length) {
            servicos[qtdServicos] = servico;
            qtdServicos++;
        } else {
            System.out.println("Limite de serviços atingido para esta ordem.");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < qtdServicos; i++) {
            total += servicos[i].calcularPrecoFinal();
        }
        return total;
    }

    public void exibirOrdemServico() {
        System.out.println("Cliente: " + nomecliente);
        veiculo.exibirinfo();
        System.out.println("--- Serviços ---");
        for (int i = 0; i < qtdServicos; i++) {
            servicos[i].exibirInformacoesBase();
        }
        System.out.println("Total da Ordem: R$ " + calcularValorTotal());
    }
}