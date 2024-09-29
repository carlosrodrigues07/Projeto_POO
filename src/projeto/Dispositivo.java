package projeto;

public class Dispositivo extends Materiais {
    private String numeroArmario;
    private String modelo;

    public Dispositivo(int id, String nome, String descricao, int quantidade, String numeroArmario, String modelo) {
        super(id, nome, descricao, quantidade, "Dispositivo");
        this.numeroArmario = numeroArmario;
        this.modelo = modelo;
    }

    public String getNumeroArmario() {
        return numeroArmario;
    }

    public void setNumeroArmario(String numeroArmario) {
        this.numeroArmario = numeroArmario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando dispositivo: " + getNome() + " com número do armário " + numeroArmario + " e modelo " + modelo);
    }
}
