package projeto;

public class Usuario {
	private int id;
    private String email;
    private String nome;
    private String cpf;
    private boolean cadastrado;

    public Usuario(int id, String email, String nome, String cpf) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.cadastrado = false; // Valor padrão
    }

    public Usuario(String nome2, int id2) {
		// TODO Auto-generated constructor stub
	}

	// Método para marcar o cadastro como feito
    public void cadastrar() {
        this.cadastrado = true;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }
}
	

