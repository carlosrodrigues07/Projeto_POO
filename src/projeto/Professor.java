package projeto;

public class Professor extends Usuario {
    private String grauAcademico;
    private String anoIngresso;
    private String disciplina;

    public Professor(int id, String email, String nome, String cpf, String grauAcademico, String anoIngresso, String disciplina) {
        super(id, email, nome, cpf); // Chama o construtor da classe base
        this.grauAcademico = grauAcademico;
        this.anoIngresso = anoIngresso;
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public String getGrauAcademico() {
        return grauAcademico;
    }

    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void fazerReserva() {
        System.out.println("Reserva feita pelo professor.");
    }
}