
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean verificador = true;
        Scanner sc = new Scanner(System.in);
        GerenciarOrdens ordens = new GerenciarOrdens(100);
        while (verificador) {
            System.out.println("=== OFICINA BOX 42 ===");
            System.out.println("Para cadastrar uma ordem de serviço digite 1\n");
            System.out.println("Para adicionar um serviço a uma ordem digite 2\n");
            System.out.println("Para listar as ordens de serviço existentes digite 3\n");
            System.out.println("Para buscar ordens de serviço pelo nome do cliente digite 4\n");
            System.out.println("Para buscar ordens de serviço pela placa digite 5\n");
            System.out.println("Para Sair do programa digite 6");
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
                Veiculo veiculo = new Veiculo(placa, modelo, anofabri);
                OrdemServico ordemServico = new OrdemServico(nome,veiculo, 100);

                ordens.addOrden(ordemServico);
                break;

                case 2:
                    System.out.println("Digite a placa do veiculo que voce ira querer fazer o servico");
                    String Placa1= sc.nextLine();
                    System.out.println("Quantos servicos voce ira adicionar?");
                    int qtdservico = sc.nextInt();
                    OrdemServico ordemServico1 = ordens.buscarOrdemPorPlaca(Placa1);
                    if (ordemServico1 == null){
                        System.out.println("Ordem de serviço não encontrada de acordo com a placa digitada");
                        break;
                    }
                    for (int i=0; i <qtdservico; i++) {
                        System.out.println("===Tipo de Serviço===\n");
                        System.out.println("Se for um serviço comum digite 1");
                        System.out.println("Se for um serviço com peças digite 2");
                        System.out.println("Se for um serviço por hora 3");
                        System.out.println("Se for um serviço diagnostico digite 4");
                        int opcao3 = sc.nextInt();

                        switch (opcao3) {
                            case 1:
                                    System.out.println("--------------");
                                    System.out.println("Serviços disponiveis:\n");
                                    System.out.println("Para troca de oleo no valor de 180 R$  Digite 1\n");
                                    System.out.println("Para alinhamento no valor de 100 R$  Digite 2\n");
                                    System.out.println("Para balanceamento no valor de 120 R$  Digite 3\n");
                                    System.out.println("Para revisao eletrica no valor de 250 R$  Digite 4\n");
                                    System.out.println("Para troca de pastilhas de freio no valor de 200 R$  Digite 5\n");
                                    int opcao2 = sc.nextInt();
                                    BaseServico servico;
                                    switch (opcao2) {
                                        case 1:
                                            servico = new BaseServico("Troca de oleo", 180);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 2:
                                            servico = new BaseServico("alinhamento", 100);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 3:
                                            servico = new BaseServico("balanceamento", 120);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 4:
                                            servico = new BaseServico("revisao eletrica", 250);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 5:
                                            servico = new BaseServico("troca de pastilhas de freio", 200);
                                            ordemServico1.addServico(servico);
                                            break;
                                        default:
                                            System.out.println("Numero digitado invalido. Não encontrado um serviço registrado.");
                                            break;

                                    }
                                    break;

                            case 2:
                                    System.out.println("--------------");
                                    System.out.println("Serviços disponiveis:\n");
                                    System.out.println("Para troca de oleo no valor de 180 R$  Digite 1\n");
                                    System.out.println("Para alinhamento no valor de 100 R$  Digite 2\n");
                                    System.out.println("Para balanceamento no valor de 120 R$  Digite 3\n");
                                    System.out.println("Para revisao eletrica no valor de 250 R$  Digite 4\n");
                                    System.out.println("Para troca de pastilhas de freio no valor de 200 R$  Digite 5\n");
                                    int opcao4 = sc.nextInt();
                                    BaseServico servico1;
                                    System.out.println("Digite o valor das Peças:");
                                    double valorPeacas = sc.nextDouble();
                                    switch (opcao4) {
                                        case 1:
                                            servico = new ServicoComPecas("Troca de oleo", 180, valorPeacas);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 2:
                                            servico = new ServicoComPecas("alinhamento", 100, valorPeacas);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 3:
                                            servico = new ServicoComPecas("balanceamento", 120, valorPeacas);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 4:
                                            servico = new ServicoComPecas("revisao eletrica", 250, valorPeacas);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 5:
                                            servico = new ServicoComPecas("troca de pastilhas de freio", 200, valorPeacas);
                                            ordemServico1.addServico(servico);
                                            break;
                                        default:
                                            System.out.println("Numero digitado invalido. Não encontrado um serviço registrado.");
                                            break;

                                    }


                                break;
                            case 3:
                                    System.out.println("--------------");
                                    System.out.println("Serviços disponiveis:\n");
                                    System.out.println("Para troca de oleo no valor de 180 R$  Digite 1\n");
                                    System.out.println("Para alinhamento no valor de 100 R$  Digite 2\n");
                                    System.out.println("Para balanceamento no valor de 120 R$  Digite 3\n");
                                    System.out.println("Para revisao eletrica no valor de 250 R$  Digite 4\n");
                                    System.out.println("Para troca de pastilhas de freio no valor de 200 R$  Digite 5\n");
                                    int opcao5 = sc.nextInt();
                                    BaseServico servico2;
                                    System.out.println("Digite o valor por hora:");
                                    double valorHora = sc.nextDouble();
                                    sc.nextLine();
                                    System.out.println("Digite a quantidade de horas  trabalhadas");
                                    double horasTrabalhadas = sc.nextDouble();
                                    sc.nextLine();
                                    switch (opcao5) {
                                        case 1:
                                            servico = new ServicoPorHora("Troca de oleo", 180, horasTrabalhadas, valorHora);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 2:
                                            servico = new ServicoPorHora("alinhamento", 100, horasTrabalhadas, valorHora);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 3:
                                            servico = new ServicoPorHora("balanceamento", 120, horasTrabalhadas, valorHora);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 4:
                                            servico = new ServicoPorHora("revisao eletrica", 250, horasTrabalhadas, valorHora);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 5:
                                            servico = new ServicoPorHora("troca de pastilhas de freio", 200, horasTrabalhadas, valorHora);
                                            ordemServico1.addServico(servico);
                                            break;
                                        default:
                                            System.out.println("Numero digitado invalido. Não encontrado um serviço registrado.");
                                            break;

                                    }


                                break;
                            case 4:
                                    System.out.println("--------------");
                                    System.out.println("Serviços disponiveis:\n");
                                    System.out.println("Para troca de oleo no valor de 180 R$  Digite 1\n");
                                    System.out.println("Para alinhamento no valor de 100 R$  Digite 2\n");
                                    System.out.println("Para balanceamento no valor de 120 R$  Digite 3\n");
                                    System.out.println("Para revisao eletrica no valor de 250 R$  Digite 4\n");
                                    System.out.println("Para troca de pastilhas de freio no valor de 200 R$  Digite 5\n");
                                    int opcao6 = sc.nextInt();
                                    sc.nextLine();
                                    BaseServico servico3;
                                    System.out.println("O veiculo possui Reparo (sim/nao)");
                                    String confirmacao = sc.nextLine();
                                    boolean possuiReparo = false;
                                    if (confirmacao.equalsIgnoreCase("sim")) {
                                        possuiReparo = true;
                                    } else if (confirmacao.equalsIgnoreCase("nao")) {
                                        possuiReparo = false;
                                    } else {
                                        System.out.println("Digite um valor valido dentro desses parametros (sim/nao) sem acento");
                                    }
                                    switch (opcao6) {
                                        case 1:
                                            servico = new ServicoDiagnostico("Troca de oleo", 180, possuiReparo);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 2:
                                            servico = new ServicoDiagnostico("alinhamento", 100, possuiReparo);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 3:
                                            servico = new ServicoDiagnostico("balanceamento", 120, possuiReparo);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 4:
                                            servico = new ServicoDiagnostico("revisao eletrica", 250, possuiReparo);
                                            ordemServico1.addServico(servico);
                                            break;
                                        case 5:
                                            servico = new ServicoDiagnostico("troca de pastilhas de freio", 200, possuiReparo);
                                            ordemServico1.addServico(servico);
                                            break;
                                        default:
                                            System.out.println("Numero digitado invalido. Não encontrado um serviço registrado.");
                                            break;

                                    }


                                break;
                            default:
                                System.out.println("Caractere digitado invalido para qualquer tipo de serviço disponivel atualmente.");
                                break;
                        }
                    }
                    break;

                case 3:
                    ordens.exibirOrden();
                    break;
                case 4:
                    System.out.println("Digite o nome do cliente ou as primeiras letras do mesmo: ");
                    String incial = sc.nextLine();
                    ordens.buscarOrdensPorInicioDoNome(incial);
                    break;
                case 5:
                    System.out.println("Digite exatamente a placa do veiculo que deseja buscar: ");
                    String placa1 = sc.nextLine();
                    OrdemServico encontrada = ordens.buscarOrdemPorPlaca(placa1);
                    if (encontrada != null) {
                        encontrada.exibirOrdemServico();
                    }
                    break;
                case 6:
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