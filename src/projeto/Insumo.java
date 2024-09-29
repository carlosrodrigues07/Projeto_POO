package projeto;

public class Insumo extends Materiais {
    private String lote;

    public Insumo(int id, String nome, String descricao, int quantidade, String lote) {
        super(id, nome, descricao, quantidade, "Insumo");
        this.lote = lote;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando insumo: " + getNome() + " com lote " + lote);
    }
}