
package projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cadastro {
   private Scanner sc;
   private List<Usuario> usuarios; // Lista para armazenar os usuários
   private List<Ambiente> ambientes; // Lista para armazenar os ambientes
   private List<Materiais> materiais; // Lista para armazenar os materiais
   private List<Reserva> reservasMateriais; // Lista para armazenar as reservas de materiais
   private List<Reserva> reservasAmbientes; // Lista para armazenar as reservas de ambientes
   public Cadastro(Scanner sc) {
       this.sc = sc;
       this.usuarios = new ArrayList<>();
       this.ambientes = new ArrayList<>();
       this.materiais = new ArrayList<>(); // Inicializando a lista de materiais
       this.reservasMateriais = new ArrayList<>(); // Inicializando a lista de reservas de materiais
       this.reservasAmbientes = new ArrayList<>(); // Inicializando a lista de reservas de ambientes
   }
   // Métodos de cadastro de usuários
   public void cadastrarProfessor() {
       System.out.println("Cadastro de Professor:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String email = obterString("Email: ");
       String cpf = obterString("CPF: ");
       String grauAcademico = obterString("Grau Acadêmico: ");
       String anoIngresso = obterString("Ano de Ingresso: ");
       String disciplina = obterString("Disciplina: ");
       Professor professor = new Professor(id, email, nome, cpf, grauAcademico, anoIngresso, disciplina);
       professor.cadastrar();
       usuarios.add(professor);
       System.out.println("Professor cadastrado com sucesso!\n");
   }
   public void cadastrarAluno() {
       System.out.println("Cadastro de Aluno:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String email = obterString("Email: ");
       String cpf = obterString("CPF: ");
       String curso = obterString("Curso: ");
       String anoIngresso = obterString("Ano de Ingresso: ");
       boolean isMonitor = obterBoolean("É monitor? (true/false): ");
       Aluno aluno = new Aluno(id, email, nome, cpf, curso, anoIngresso, isMonitor);
       aluno.cadastrar();
       usuarios.add(aluno);
       System.out.println("Aluno cadastrado com sucesso!\n");
   }
   public void cadastrarAssistenteAdm() {
       System.out.println("Cadastro de Assistente Administrativo:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String email = obterString("Email: ");
       String cpf = obterString("CPF: ");
       String departamento = obterString("Departamento: ");
       AssistenteAdm assistenteAdm = new AssistenteAdm(id, email, nome, cpf, departamento);
       assistenteAdm.cadastrar();
       usuarios.add(assistenteAdm);
       System.out.println("Assistente Administrativo cadastrado com sucesso!\n");
   }
   public void listarUsuarios() {
       if (usuarios.isEmpty()) {
           System.out.println("Nenhum usuário cadastrado.");
       } else {
           System.out.println("\nLista de Usuários Cadastrados:");
           for (Usuario usuario : usuarios) {
               System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail() + ", CPF: " + usuario.getCpf() + ", Cadastrado: " + usuario.isCadastrado());
           }
           System.out.println();
       }
   }
   public void cadastrarMaterial() {
       System.out.println("Cadastro de Material:");
       System.out.println("Escolha o tipo de material para cadastro:");
       System.out.println("(1) Máquinas");
       System.out.println("(2) Insumos");
       System.out.println("(3) Ferramentas");
       System.out.println("(4) Dispositivos");
       int tipoMaterial = obterInteiro("Digite o número correspondente ao tipo de material: ");
       Materiais material = null; // Variável para armazenar o material criado
       switch (tipoMaterial) {
           case 1: material = cadastrarMaquina(); break;
           case 2: material = cadastrarInsumo(); break;
           case 3: material = cadastrarFerramenta(); break;
           case 4: material = cadastrarDispositivo(); break;
           default: System.out.println("Opção inválida."); break;
       }
       if (material != null) {
           materiais.add(material); // Adiciona o material à lista
           System.out.println("Material cadastrado com sucesso!\n");
       }
   }
   public void listarMateriais() {
       if (materiais.isEmpty()) {
           System.out.println("Nenhum material cadastrado.");
       } else {
           System.out.println("\nLista de Materiais Cadastrados:");
           for (Materiais material : materiais) {
               System.out.println("ID: " + material.getId() + ", Nome: " + material.getNome() + ", Descrição: " + material.getDescricaoMaterial() + ", Quantidade: " + material.getQuantidade());
           }
           System.out.println();
       }
   }
   public void cadastrarAmbiente() {
       System.out.println("Cadastro de Ambiente:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String descricao = obterString("Descrição: ");
       String tipo = obterString("Tipo: ");
       int capacidade = obterInteiro("Capacidade: ");
       Ambiente ambiente = new Ambiente(id, nome, descricao, tipo, capacidade);
       ambiente.cadastrar();
       ambientes.add(ambiente); // Adicionando o ambiente à lista
       System.out.println("Ambiente cadastrado com sucesso!\n");
   }
   public void listarAmbientes() {
       if (ambientes.isEmpty()) {
           System.out.println("Nenhum ambiente cadastrado.");
       } else {
           System.out.println("\nLista de Ambientes Cadastrados:");
           for (Ambiente ambiente : ambientes) {
               System.out.println("ID: " + ambiente.getId() + ", Nome: " + ambiente.getNome() + ", Tipo: " + ambiente.getTipo() + ", Capacidade: " + ambiente.getCapacidade());
           }
           System.out.println();
       }
   }
   // Métodos adicionais para cadastro de máquina, insumo, ferramenta e dispositivo
   public Materiais cadastrarMaquina() {
       System.out.println("Cadastro de Máquina:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String descricao = obterString("Descrição: ");
       int quantidade = obterInteiro("Quantidade: ");
       String modelo = obterString("Modelo: ");
       Maquina maquina = new Maquina(id, nome, descricao, quantidade, modelo);
       maquina.cadastrar();
       return maquina; // Retorna a máquina cadastrada
   }
   public Materiais cadastrarInsumo() {
       System.out.println("Cadastro de Insumo:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String descricao = obterString("Descrição: ");
       int quantidade = obterInteiro("Quantidade: ");
       String lote = obterString("Lote: ");
       Insumo insumo = new Insumo(id, nome, descricao, quantidade, lote);
       insumo.cadastrar();
       return insumo; // Retorna o insumo cadastrado
   }
   public Materiais cadastrarFerramenta() {
       System.out.println("Cadastro de Ferramenta:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String descricao = obterString("Descrição: ");
       int quantidade = obterInteiro("Quantidade: ");
       String numeroArmario = obterString("Número do Armário: ");
       Ferramenta ferramenta = new Ferramenta(id, nome, descricao, quantidade, numeroArmario);
       ferramenta.cadastrar();
       return ferramenta; // Retorna a ferramenta cadastrada
   }
   public Materiais cadastrarDispositivo() {
       System.out.println("Cadastro de Dispositivo:");
       int id = obterInteiro("ID: ");
       String nome = obterString("Nome: ");
       String descricao = obterString("Descrição: ");
       int quantidade = obterInteiro("Quantidade: ");
       String numeroArmario = obterString("Número do Armário: ");
       String modelo = obterString("Modelo: ");
       Dispositivo dispositivo = new Dispositivo(id, nome, descricao, quantidade, numeroArmario, modelo);
       dispositivo.cadastrar();
       return dispositivo; // Retorna o dispositivo cadastrado
   }
   // Métodos para reserva de materiais e ambientes
   public void reservarMaterial() {
	    if (materiais.isEmpty()) {
	        System.out.println("Nenhum material disponível para reserva.");
	        return;
	    }
	    System.out.println("Lista de Materiais Disponíveis para Reserva:");
	    listarMateriais();
	    
	    int materialId = obterInteiro("Digite o ID do material que deseja reservar: ");
	    Materiais material = buscarMaterialPorId(materialId);
	    if (material == null) {
	        System.out.println("Material não encontrado.");
	        return;
	    }
	    if (material.getQuantidade() <= 0) {
	        System.out.println("Material não disponível para reserva.");
	        return;
	    }
	    
	    int usuarioId = obterInteiro("Digite o ID do usuário que está realizando a reserva: ");
	    Usuario usuario = buscarUsuarioPorId(usuarioId);
	    if (usuario == null) {
	        System.out.println("Usuário não encontrado.");
	        return;
	    }
	    
	    int monitorId = obterInteiro("Digite o ID do monitor responsável: ");
	    Usuario monitor = buscarUsuarioPorId(monitorId); // Presumindo que monitor é um usuário
	    if (monitor == null || !(monitor instanceof Aluno) || !((Aluno) monitor).isMonitor()) {
	        System.out.println("Monitor não encontrado ou o usuário não é um monitor.");
	        return;
	    }
	    
	    String dataReserva = obterString("Digite a data da reserva (dd/mm/yyyy): ");
	    
	    // Criar a reserva e verificar se o usuário não é nulo
	    Reserva reserva = new Reserva(usuario, material, dataReserva);
	    if (reserva.getUsuario() == null) { // Verificação se o usuário não é nulo
	        System.out.println("Erro: Usuário na reserva é nulo.");
	        return;
	    }

	    reservasMateriais.add(reserva);
	    material.setQuantidade(material.getQuantidade() - 1); // Reduz a quantidade do material
	    System.out.println("Reserva de material realizada com sucesso!");
	}

   public void reservarAmbiente() {
       if (ambientes.isEmpty()) {
           System.out.println("Nenhum ambiente disponível para reserva.");
           return;
       }
       System.out.println("Lista de Ambientes Disponíveis para Reserva:");
       listarAmbientes();
       int ambienteId = obterInteiro("Digite o ID do ambiente que deseja reservar: ");
       Ambiente ambiente = buscarAmbientePorId(ambienteId);
       if (ambiente == null) {
           System.out.println("Ambiente não encontrado.");
           return;
       }
       int usuarioId = obterInteiro("Digite o ID do usuário que está realizando a reserva: ");
       Usuario usuario = buscarUsuarioPorId(usuarioId);
       if (usuario == null) {
           System.out.println("Usuário não encontrado.");
           return;
       }
       int monitorId = obterInteiro("Digite o ID do monitor responsável: ");
       Usuario monitor = buscarUsuarioPorId(monitorId); // Presumindo que monitor é um usuário
       if (monitor == null || !(monitor instanceof Aluno) || !((Aluno) monitor).isMonitor()) {
           System.out.println("Monitor não encontrado ou o usuário não é um monitor.");
           return;
       }

       String dataReserva = obterString("Digite a data da reserva (dd/mm/yyyy): ");
       Reserva reserva = new Reserva(usuario, ambiente, dataReserva);
       reservasAmbientes.add(reserva);
       System.out.println("Reserva de ambiente realizada com sucesso!");
   }
   // Listar reservas de materiais
   public void listarReservasMateriais() {
	    if (reservasMateriais.isEmpty()) {
	        System.out.println("Nenhuma reserva de material realizada.");
	    } else {
	        System.out.println("\nLista de Reservas de Materiais:");
	        for (Reserva reserva : reservasMateriais) {
	            if (reserva.getUsuario() != null) { // Verifica se o usuário não é null
	                System.out.println("Usuário: " + reserva.getUsuario().getNome() + ", Material: " + reserva.getMaterial().getNome() + ", Data da Reserva: " + reserva.getDataReserva());
	            } else {
	                System.out.println("Reserva sem usuário associado.");
	            }
	        }
	        System.out.println();
	    }
	}

   // Listar reservas de ambientes
   public void listarReservasAmbientes() {
	    if (reservasAmbientes.isEmpty()) {
	        System.out.println("Nenhuma reserva de ambiente realizada.");
	    } else {
	        System.out.println("\nLista de Reservas de Ambientes:");
	        for (Reserva reserva : reservasAmbientes) {
	            if (reserva.getUsuario() != null) { // Verifica se o usuário não é null
	                System.out.println("Usuário: " + reserva.getUsuario().getNome() + ", Ambiente: " + reserva.getAmbiente().getNome() + ", Data da Reserva: " + reserva.getDataReserva());
	            } else {
	                System.out.println("Reserva sem usuário associado.");
	            }
	        }
	        System.out.println();
	    }
	}

   // Métodos auxiliares para buscar material e ambiente por ID
   private Materiais buscarMaterialPorId(int id) {
       for (Materiais material : materiais) {
           if (material.getId() == id) {
               return material;
           }
       }
       return null;
   }
   private Ambiente buscarAmbientePorId(int id) {
       for (Ambiente ambiente : ambientes) {
           if (ambiente.getId() == id) {
               return ambiente;
           }
       }
       return null;
   }
   private Usuario buscarUsuarioPorId(int id) {
       for (Usuario usuario : usuarios) {
           if (usuario.getId() == id) {
               return usuario;
           }
       }
       return null;
   }
   // Métodos auxiliares para obter entradas do usuário
   private int obterInteiro(String mensagem) {
       while (true) {
           try {
               System.out.print(mensagem);
               int valor = sc.nextInt();
               sc.nextLine(); // Consumir a linha pendente após a entrada numérica
               return valor;
           } catch (Exception e) {
               System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
               sc.nextLine(); // Limpar o buffer do scanner
           }
       }
   }
   private String obterString(String mensagem) {
       System.out.print(mensagem);
       return sc.nextLine();
   }
   private boolean obterBoolean(String mensagem) {
       while (true) {
           System.out.print(mensagem);
           String entrada = sc.nextLine();
           if (entrada.equalsIgnoreCase("true")) {
               return true;
           } else if (entrada.equalsIgnoreCase("false")) {
               return false;
           } else {
               System.out.println("Entrada inválida. Por favor, insira 'true' ou 'false'.");
           }
       }
   }
}

