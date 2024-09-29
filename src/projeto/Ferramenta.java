package projeto;

public class Ferramenta extends Materiais {
    private String numeroArmario;

    public Ferramenta(int id, String nome, String descricao, int quantidade, String numeroArmario) {
        super(id, nome, descricao, quantidade, "Ferramenta");
        this.numeroArmario = numeroArmario;  
    }

    public String getNumeroArmario() {
        return numeroArmario;
    }

    public void setNumeroArmario(String numeroArmario) {
        this.numeroArmario = numeroArmario;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando ferramenta: " + getNome() + " com número do armário " + numeroArmario);
    }
}