package view;

import controller.ControleCurso;
import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleCurso controller = new ControleCurso();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Curso");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Buscar Curso");
            System.out.println("4. Remover Curso");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Título do Curso: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Descrição do Curso: ");
                        String desc = scanner.nextLine();
                        System.out.println("Duração do curos: ");
                        int duracao = scanner.nextInt();
                        System.out.println("ID do curos: ");
                        int id = scanner.nextInt();
                        System.out.print("Nome do Instrutor: ");
                        String nomeProfessor = scanner.nextLine();
                        System.out.print("CPF do Professor: ");
                        int cpf = scanner.nextInt();
                        System.out.print("Idade do Professor: ");
                        int idade = scanner.nextInt();
                        Professor instrutor = new Professor(nomeProfessor, cpf, idade);
                        Curso curso = new Curso(titulo, desc, duracao, id);

                        String addOutra;
                        do {
                            System.out.print("Título da Aula: ");
                            String tituloAula = scanner.nextLine();
                            System.out.print("Descrição da Aula: ");
                            String desc_aula = scanner.nextLine();
                            System.out.print("Duração da Aula: ");
                            int duracao_aula = scanner.nextInt();
                            System.out.print("ID da Aula: ");
                            int id_aula = scanner.nextInt();
                            curso.adicionar_aula(new Aula(tituloAula, desc_aula, duracao_aula, id_aula));
                            System.out.print("Adicionar outra aula? (s/n): ");
                            addOutra = scanner.nextLine();
                        } while (addOutra.equalsIgnoreCase("s"));

                        controller.cadastrarCurso(curso);
                        System.out.println("Curso cadastrado com sucesso!");
                        break;

                    case 2:
                        for (Curso c : controller.listarCursos()) {
                            c.exibir_dados();
                            System.out.println();
                        }
                        break;

                    case 3:
                        System.out.print("Nome do curso: ");
                        String nomeBusca = scanner.nextLine();
                        Curso encontrado = controller.buscarCurso(nomeBusca);
                        encontrado.exibir_dados();
                        break;

                    case 4:
                        System.out.print("Nome do curso a remover: ");
                        String nomeRemover = scanner.nextLine();
                        controller.removerCurso(nomeRemover);
                        System.out.println("Curso removido.");
                        break;
                }
            } catch (CampoObrigatorioException | CursoNaoEncontradoException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}
