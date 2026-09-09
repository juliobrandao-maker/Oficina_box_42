public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirinfo(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("anoFabricacao: " + this.anoFabricacao);
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }


}
