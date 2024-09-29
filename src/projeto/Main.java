package projeto;

import java.util.Scanner;

public class Main {
    private static boolean EXIT = false;
    private static Scanner sc = new Scanner(System.in);
    private static Cadastro cadastro = new Cadastro(sc);
    private static final String MENSAGEM_BOAS_VINDAS =
            "| ---------------------------------------------------- | " +
                    "\n      BEM VINDO(A) AO SISTEMA DE GESTAO" +
                    "\n| ---------------------------------------------------- | ";

    private static final String MENU_INICIAL = "QUAL OPERAÇÃO DESEJA FAZER?"
            + "\n (1) CADASTRAR USUARIO"
            + "\n (2) CADASTRAR MATERIAIS"
            + "\n (3) CADASTRAR AMBIENTES"
            + "\n (4) RESERVAR MATERIAIS"
            + "\n (5) RESERVAR AMBIENTES"
            + "\n (6) SAIR";

    private static final String MENU_USUARIOS = "QUAL USUÁRIO DESEJA CADASTRAR?"
            + "\n (1) CADASTRAR PROFESSOR"
            + "\n (2) CADASTRAR ALUNO"
            + "\n (3) CADASTRAR ASSISTENTE ADMINISTRATIVO"
            + "\n (4) LISTAR USUÁRIOS"
            + "\n (5) VOLTAR";

    private static final String MENU_MATERIAIS = "O QUE DESEJA FAZER COM MATERIAIS?"
            + "\n (1) CADASTRAR MATERIAL"
            + "\n (2) LISTAR MATERIAIS"
            + "\n (3) VOLTAR";

    private static final String MENU_AMBIENTES = "O QUE DESEJA FAZER COM AMBIENTES?"
            + "\n (1) CADASTRAR AMBIENTE"
            + "\n (2) LISTAR AMBIENTES"
            + "\n (3) VOLTAR";

    private static final String MENU_RESERVAS_MATERIAIS = "O QUE DESEJA FAZER COM RESERVAS DE MATERIAIS?"
            + "\n (1) RESERVAR MATERIAL"
            + "\n (2) LISTAR RESERVAS DE MATERIAIS"
            + "\n (3) VOLTAR";

    private static final String MENU_RESERVAS_AMBIENTES = "O QUE DESEJA FAZER COM RESERVAS DE AMBIENTES?"
            + "\n (1) RESERVAR AMBIENTE"
            + "\n (2) LISTAR RESERVAS DE AMBIENTES"
            + "\n (3) VOLTAR";

    public static void main(String[] args) {
        while (!EXIT) {
            System.out.println(MENSAGEM_BOAS_VINDAS);
            System.out.println(MENU_INICIAL);
            int opcao_menu = obterOpcaoMenu();
            try {
                switch (opcao_menu) {
                    case 1:
                        menuUsuarios();
                        break;
                    case 2:
                        menuMateriais();
                        break;
                    case 3:
                        menuAmbientes();
                        break;
                    case 4:
                        menuReservasMateriais();
                        break;
                    case 5:
                        menuReservasAmbientes();
                        break;
                    case 6:
                        EXIT = true;
                        System.out.println("Saiu com sucesso!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao processar a opção selecionada: " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void menuUsuarios() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println(MENU_USUARIOS);
            int opcao_menu_usuario = obterOpcaoMenu();
            try {
                switch (opcao_menu_usuario) {
                    case 1:
                        cadastro.cadastrarProfessor();
                        limparConsole();
                        break;
                    case 2:
                        cadastro.cadastrarAluno();
                        limparConsole();
                        break;
                    case 3:
                        cadastro.cadastrarAssistenteAdm();
                        limparConsole();
                        break;
                    case 4:
                        cadastro.listarUsuarios();
                        break;
                    case 5:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a operação de usuário: " + e.getMessage());
            }
        }
    }

    private static void menuMateriais() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println(MENU_MATERIAIS);
            int opcao_menu_material = obterOpcaoMenu();
            try {
                switch (opcao_menu_material) {
                    case 1:
                        cadastro.cadastrarMaterial();
                        limparConsole();
                        break;
                    case 2:
                        cadastro.listarMateriais();
                        break;
                    case 3:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a operação de materiais: " + e.getMessage());
            }
        }
    }

    private static void menuAmbientes() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println(MENU_AMBIENTES);
            int opcao_menu_ambiente = obterOpcaoMenu();
            try {
                switch (opcao_menu_ambiente) {
                    case 1:
                        cadastro.cadastrarAmbiente();
                        limparConsole();
                        break;
                    case 2:
                        cadastro.listarAmbientes();
                        break;
                    case 3:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a operação de ambientes: " + e.getMessage());
            }
        }
    }

    private static void menuReservasMateriais() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println(MENU_RESERVAS_MATERIAIS);
            int opcao_menu_reserva_material = obterOpcaoMenu();
            try {
                switch (opcao_menu_reserva_material) {
                    case 1:
                        cadastro.reservarMaterial();
                        limparConsole();
                        break;
                    case 2:
                        cadastro.listarReservasMateriais();
                        break;
                    case 3:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a operação de reservas de materiais: " + e.getMessage());
            }
        }
    }

    private static void menuReservasAmbientes() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println(MENU_RESERVAS_AMBIENTES);
            int opcao_menu_reserva_ambiente = obterOpcaoMenu();
            try {
                switch (opcao_menu_reserva_ambiente) {
                    case 1:
                        cadastro.reservarAmbiente();
                        limparConsole();
                        break;
                    case 2:
                        cadastro.listarReservasAmbientes();
                        break;
                    case 3:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a operação de reservas de ambientes: " + e.getMessage());
            }
        }
    }

    private static int obterOpcaoMenu() {
        while (true) {
            try {
                int opcao = sc.nextInt();
                sc.nextLine(); // Consumir a linha pendente após a entrada numérica
                return opcao;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

    private static void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Caso o comando não funcione, imprime várias linhas em branco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}




