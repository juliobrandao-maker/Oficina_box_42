public class GerenciarOrdens {
    private OrdemServico[] ordens;
    private int qtdOrdens; // Contador de ordens cadastradas

    // Recebe a capacidade máxima de ordens que o sistema pode gerenciar
    public GerenciarOrdens(int capacidadeMaximaOrdens) {
        this.ordens = new OrdemServico[capacidadeMaximaOrdens];
        this.qtdOrdens = 0;
    }

    public void addOrden(OrdemServico ordem) {
        if (qtdOrdens < ordens.length) {
            this.ordens[qtdOrdens] = ordem;
            qtdOrdens++;
        } else {
            System.out.println("Capacidade máxima de ordens atingida no sistema.");
        }
    }

    public void exibirOrden() {
        if (qtdOrdens == 0) {
            System.out.println("Nenhuma ordem cadastrada.");
            return;
        }
        double valorTotal = 0;
        for (int i = 0; i < qtdOrdens; i++) {

            valorTotal += ordens[i].calcularValorTotal();
            ordens[i].exibirOrdemServico();

            System.out.println("--------------------------------");
        }

    }

    public void buscarOrdensPorInicioDoNome(String inicial) {
        boolean encontrou = false;
        for (int i = 0; i < qtdOrdens; i++) {
            if (ordens[i].getNomecliente().toLowerCase().startsWith(inicial.toLowerCase())) {
                ordens[i].exibirOrdemServico();
                System.out.println("--------------------------------");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma ordem encontrada para o nome iniciado em: " + inicial);
        }
    }

    public OrdemServico buscarOrdemPorPlaca(String placa) {
        for (int i = 0; i < qtdOrdens; i++) {
            if (ordens[i].getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                return ordens[i];
            }
        }
        System.out.println("Nenhuma ordem encontrada para a placa: " + placa);
        return null;
    }
}
