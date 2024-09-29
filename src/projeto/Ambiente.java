package projeto;

public class Ambiente extends Reservavel {
    private String tipo;
    private int capacidade;

    // Construtor
    public Ambiente(int id, String nome, String descricao, String tipo, int capacidade) {
        super(id, nome, descricao);
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    // Métodos getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando ambiente: " + getNome() + " com capacidade de " + capacidade);
    }

    public void deletar() {
        System.out.println("Ambiente deletado: " + getNome());
    }
}