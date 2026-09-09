//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean verificador = true;
        Scanner sc = new Scanner(System.in);
        GerenciarOrdens ordens = new GerenciarOrdens(100);
        while (verificador) {
            System.out.println("=== OFICINA BOX 42 ===");
            System.out.println("Para cadastrar uma ordem de serviço digite 1\n");
            System.out.println("Para listar as ordens de serviço existentes digite 2\n");
            System.out.println("Para buscar ordens de serviço pelo nome do cliente digite 3\n");
            System.out.println("Para buscar ordens de serviço pela placa digite 4\n");
            System.out.println("Para Sair do programa digite 5");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                System.out.println("Digite o nome do cliente: ");
                String nome = sc.nextLine();
                System.out.println("Digite o placa do Veiculo: ");
                String placa = sc.nextLine();
                System.out.println("Digite o modelo do Veiculo:");
                String modelo = sc.nextLine();
                System.out.println("Digite o ano de fabricação do Veiculo");
                int anofabri = sc.nextInt();
                sc.nextLine();
                System.out.println("Quantos servicos voce ira fazer?");
                int qtdservico = sc.nextInt();
                sc.nextLine();
                Servico servico;
                Veiculo veiculo = new Veiculo(placa, modelo, anofabri);
                OrdemServico ordemServico = new OrdemServico(nome,veiculo,qtdservico);
                for (int i = 0; i < qtdservico; i++) {
                    System.out.println("--------------");
                    System.out.println("Serviços disponiveis:\n");
                    System.out.println("Para troca de oleo no valor de 180 R$  Digite 1\n");
                    System.out.println("Para alinhamento no valor de 100 R$  Digite 2\n");
                    System.out.println("Para balanceamento no valor de 120 R$  Digite 3\n");
                    System.out.println("Para revisao eletrica no valor de 250 R$  Digite 4\n");
                    System.out.println("Para troca de pastilhas de freio no valor de 200 R$  Digite 5\n");
                    int opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1:
                            servico = new Servico("Troca de oleo", 180);
                            ordemServico.addServico(servico);
                            break;
                        case 2:
                            servico = new Servico("alinhamento", 100);
                            ordemServico.addServico(servico);
                            break;
                        case 3:
                            servico = new Servico("balanceamento", 120);
                            ordemServico.addServico(servico);
                            break;
                        case 4:
                            servico = new Servico("revisao eletrica", 250);
                            ordemServico.addServico(servico);
                            break;
                        case 5:
                            servico = new Servico("troca de pastilhas de freio", 200);
                            ordemServico.addServico(servico);
                            break;
                        default:
                            System.out.println("Numero digitado invalido. Não encontrado um serviço registrado.");
                            break;

                }
                }
                ordens.addOrden(ordemServico);
                break;
                case 2:
                    ordens.exibirOrden();
                    break;
                case 3:
                    System.out.println("Digite o nome do cliente ou as primeiras letras do mesmo: ");
                    String incial = sc.nextLine();
                    ordens.buscarOrdensPorInicioDoNome(incial);
                    break;
                case 4:
                    System.out.println("Digite exatamente a placa do veiculo que deseja buscar: ");
                    String placa1 = sc.nextLine();
                    ordens.buscarOrdensPorPlaca(placa1);
                    break;
                case 5:
                    System.out.println("Obrigado por usar o sistema da oficina box 42");
                    verificador = false;
                    break;
                default:
                    System.out.println("Voce digitou um valor errado favor tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}