package dadospessoais;

import java.sql.SQLException;
import java.util.*;
import  javax.swing.JOptionPane ;

public class DadosPessoais {

    public static void main(String[] args) throws SQLException {

        int opcao = -1;
        BancoDados banco = new BancoDados();
        Scanner leia = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("************************");
            System.out.println("\n\nMenu de entrada");
            System.out.println("Digite 1 para salvar Professor");
            System.out.println("Digite 2 para salvar alunos ");
            System.out.println("Digite 3 para exibir professores");
            System.out.println("Digite 4 para exibir alunos");
            System.out.println("Digite 5 para remover Professores");
            System.out.println("Digite 6 para remover Alunos");
            System.out.println("Digite 7 para remover todos os Professores");
            System.out.println("Digite 8 para remover todos os Alunos");
            System.out.println("Digite 0 para sair");
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch (opcao) {
               
                case 1:
                    Professor prof = new Professor();

                    banco.salvarProfessoresNoBancoDeDados(prof);

                    break;
            }
            switch (opcao) {
                case 2:
                    Aluno aluno = new Aluno();

                    banco.salvarAlunosNoBancoDeDados(aluno);

                    break;

                case 3:

                    banco.exibirTodosProfessores();
                    break;

                case 4:

                    banco.exibirTodosAlunos();

                    break;

                case 5:
                    Professor professor = new Professor();
                    banco.removerProfessor(professor);
                    System.out.println("Professor removido com sucesso!!!!");
                    break;
                case 6:
                    Aluno aluno1 = new Aluno();
                    banco.removerAluno(aluno1);
                    System.out.println("Aluno removido com sucesso!!!!!");
                    break;

                case 7:

                    banco.removerTodosProfessores();
                    System.out.println("Professores removidos com sucesso!!!!");

                    break;

                case 8:
                    banco.removerTodosAlunos();
                    System.out.println("Alunos removidos com sucesso!!!!!");
                    break;

                case 0:
                    System.out.println("Saindo do programa!!!!!!!!");
                    opcao = 0;
                    break;
                default:
                   
            }
        }

    }
}
