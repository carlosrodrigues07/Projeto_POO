package projeto;
public class Reserva {
   private int idReserva;
   private String dataReserva;
   private int duracao;
   private Usuario usuario;
   private Aluno monitor;
   private Reservavel reservavel;
   private int quantidade;
   // Construtor principal
   public Reserva(int idReserva, String dataReserva, int duracao, Usuario usuario, Aluno monitor, Reservavel reservavel, int quantidade) {
       this.idReserva = idReserva;
       this.dataReserva = dataReserva;
       this.duracao = duracao;
       this.usuario = usuario;
       this.monitor = monitor;
       this.reservavel = reservavel;
       this.quantidade = quantidade;
   }
   // Construtor para reserva de ambiente
   public Reserva(int idReserva, String dataReserva, int duracao, Aluno monitor, Ambiente ambiente, int quantidade) {
       this(idReserva, dataReserva, duracao, null, monitor, ambiente, quantidade);
   }
   // Construtor para reserva de materiais
   public Reserva(int idReserva, String dataReserva, int duracao, Aluno monitor, Materiais material, int quantidade) {
       this(idReserva, dataReserva, duracao, null, monitor, material, quantidade);
   }
   public Reserva(Usuario usuario, Ambiente ambiente, String dataReserva) {
	    this.usuario = usuario; // Inicializa o usuário
	    this.reservavel = ambiente; // Presumindo que reservavel é um ambiente
	    this.dataReserva = dataReserva;
	}

	public Reserva(Usuario usuario, Materiais material, String dataReserva) {
	    this.usuario = usuario; // Inicializa o usuário
	    this.reservavel = material; // Presumindo que reservavel é um material
	    this.dataReserva = dataReserva;
	}

	// Getters e Setters
   public int getIdReserva() {
       return idReserva;
   }
   public void setIdReserva(int idReserva) {
       this.idReserva = idReserva;
   }
   public String getDataReserva() {
       return dataReserva;
   }
   public void setDataReserva(String dataReserva) {
       this.dataReserva = dataReserva;
   }
   public int getDuracao() {
       return duracao;
   }
   public void setDuracao(int duracao) {
       this.duracao = duracao;
   }
   public Usuario getUsuario() {
       return usuario;
   }
   public void setUsuario(Usuario usuario) {
       this.usuario = usuario;
   }
   public Aluno getMonitor() {
       return monitor;
   }
   public void setMonitor(Aluno monitor) {
       this.monitor = monitor;
   }
   public Reservavel getReservavel() {
       return reservavel;
   }
   public void setReservavel(Reservavel reservavel) {
       this.reservavel = reservavel;
   }
   public int getQuantidade() {
       return quantidade;
   }
   public void setQuantidade(int quantidade) {
       this.quantidade = quantidade;
   }
   // Métodos de gerenciamento de reserva
   public void criar() {
       System.out.println("Reserva criada para o usuário: " + usuario.getNome() + " com " + quantidade + " unidades de " + reservavel.getNome());
   }
   public void alterar() {
       // Implemente a lógica para alterar uma reserva
       System.out.println("Reserva alterada para o usuário: " + usuario.getNome());
   }
   public void cancelar() {
       // Implemente a lógica para cancelar uma reserva
       System.out.println("Reserva cancelada para o usuário: " + usuario.getNome());
   }
   public void statusConcluido() {
       System.out.println("Reserva concluída para o usuário: " + usuario.getNome());
   }
	public Usuario getItemReservado() {
		// TODO Auto-generated method stub
		return null;
	}
	public Usuario getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}
	public Usuario getAmbiente() {
		// TODO Auto-generated method stub
		return null;
	}
}















