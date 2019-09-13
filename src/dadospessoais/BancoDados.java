package dadospessoais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class BancoDados {

    Scanner leia = new Scanner(System.in);

    List<Professor> listaProfessores = new ArrayList<>();

    List<Aluno> listaAlunos = new ArrayList<>();

    public String salvarProfessor(Professor professor) {

        System.out.println("Digite o nome do professor");
        professor.setNome(leia.nextLine());

        System.out.println("Digite a idade do professor");
        professor.setIdade(leia.nextInt());
        leia.nextLine();
        System.out.println("Digite o sexo do professor");
        professor.setSexo(leia.nextLine());

        System.out.println("Digite o siape do professor");
        professor.setSiape(leia.nextInt());
        leia.nextLine();

        System.out.println("Digite o cpf do professor");
        professor.setCpf(leia.nextInt());
        leia.nextLine();

        listaProfessores.add(professor);

        return "Professor salvo com sucesso";
    }

    public String salvarAluno(Aluno aluno) {

        System.out.println("Digite o nome do aluno");
        aluno.setNome("mar");//leia.nextLine());
        
        System.out.println("Digite a idade do aluno");
        aluno.setIdade(123);//leia.nextInt());
        leia.nextLine();

        System.out.println("Digite o sexo do aluno");
        aluno.setSexo("mar");//leia.nextLine());

        System.out.println("Digite o RA do aluno");
        aluno.setRa(123);//leia.nextInt());
        leia.nextLine();
        System.out.println("Digite o cpf do aluno");
        aluno.setCpf(123);//leia.nextInt());
        leia.nextLine();

        listaAlunos.add(aluno);

        return "Aluno salvo com sucesso";

    }

    public List<Aluno> exibirTodosAlunos() {
        List<Aluno> alunos = listaAlunos;

        for (int i = 0; i < alunos.size(); i++) {

            System.out.println("O Nome do aluno é:" + alunos.get(i).getNome());
            System.out.println("O cpf do Aluno é:" + alunos.get(i).getCpf());
            System.out.println("O sexo do Aluno é:" + alunos.get(i).getSexo());
            System.out.println("A idade do Aluno é:" + alunos.get(i).getIdade());
        }

        return alunos;

    }

    public List<Professor> exibirTodosProfessores() {

        List<Professor> professor = listaProfessores;
        for (int i = 0; i < professor.size(); i++) {

            System.out.println("O Nome do professor é:" + professor.get(i).getNome());
            System.out.println("O cpf do professor é:" + professor.get(i).getCpf());
            System.out.println("O sexo do professor é:" + professor.get(i).getSexo());
            System.out.println("A idade do professor é:" + professor.get(i).getIdade());
        }
        return professor;

    }

    public String removerProfessor(Professor prof) {
        List<Professor> professor = listaProfessores;

        for (int i = 0; i < professor.size(); i++) {
            System.out.println("Digite o siape do professor");
            prof.setSiape(leia.nextInt());
            if (professor.get(i).getSiape() == prof.getSiape()) {

            }
            professor.remove(i).getSiape();
        }
        return "Professor removido com sucesso!!!";

    }

    public String removerAluno(Aluno alu) {
        List<Aluno> aluno = listaAlunos;

        for (int i = 0; i < aluno.size(); i++) {

            System.out.println("Digite o RA do aluno");
            alu.setRa(leia.nextInt());

            if (aluno.get(i).getRa() == alu.getRa()) {

            }
            aluno.remove(i).getRa();
        }
        return "Aluno excluido com sucesso";
    }

    void removerTodosProfessores() {

        List<Professor> professores = listaProfessores;

        professores.clear();

    }

    void removerTodosAlunos() {
        List<Aluno> alunos = listaAlunos;

        alunos.clear();
    }
    public void salvarNoBancoDeDados(Aluno aluno) throws SQLException{
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/lp2db","root","");
            String sql = "insert into alunos(nome,sexo,idade,cpf, RA)"+ "values ('Marcos','masculino',"
                    + "'32','2343',22))";
            
            PreparedStatement prepare = conexao.prepareStatement(sql);
            
            prepare.executeLargeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
          conexao.close();
        }
    
    
    }
}
