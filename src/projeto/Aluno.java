package projeto;

public class Aluno extends Usuario {
    private String curso;
    private String anoIngresso;
    private boolean isMonitor;

    public Aluno(int id, String email, String nome, String cpf, String curso, String anoIngresso, boolean isMonitor) {
        super(id, email, nome, cpf); // Chama o construtor da classe base
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.isMonitor = isMonitor;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public boolean isMonitor() {
        return isMonitor;
    }

    public void setMonitor(boolean monitor) {
        isMonitor = monitor;
    }

    public void fazerReserva() {
        System.out.println("Reserva feita pelo aluno.");
    }
}