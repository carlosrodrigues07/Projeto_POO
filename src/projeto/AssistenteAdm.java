package projeto;

public class AssistenteAdm extends Usuario {
    private String departamento;

    public AssistenteAdm(int id, String email, String nome, String cpf, String departamento) {
        super(id, email, nome, cpf); // Chama o construtor da classe base
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}