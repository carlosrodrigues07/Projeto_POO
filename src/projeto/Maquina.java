package projeto;

public class Maquina extends Materiais {
    private String modelo;

    public Maquina(int id, String nome, String descricao, int quantidade, String modelo) {
        super(id, nome, descricao, quantidade, "Máquina");
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void cadastrar() {
        System.out.println("Cadastrando máquina: " + getNome() + " com modelo " + modelo);
    }
}