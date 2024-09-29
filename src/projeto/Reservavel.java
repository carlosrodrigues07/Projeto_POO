package projeto;

public class Reservavel {
	private int id;
    private String nome;
    private String descricao;

    // Construtor
    public Reservavel(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para cadastrar
    public void cadastrar() {
        System.out.println("Cadastrando " + nome);
    }
}

