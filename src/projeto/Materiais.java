package projeto;

public class Materiais extends Reservavel {
    private int quantidade;
    private String descricaoMaterial;

    // Construtor
    public Materiais(int id, String nome, String descricao, int quantidade, String descricaoMaterial) {
        super(id, nome, descricao);
        this.quantidade = quantidade;
        this.descricaoMaterial = descricaoMaterial;
    }

    // Métodos getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public void setDescricaoMaterial(String descricaoMaterial) {
        this.descricaoMaterial = descricaoMaterial;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando material: " + getNome() + " com quantidade de " + quantidade);
    }
}
