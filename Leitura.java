import javax.swing.JOptionPane;
import java.io.*;
import java.sql.*;
import com.mysql.jdbc.Driver;
import dadospessoais.Aluno;
import dadospessoais.Professor;

public class Leitura {
    public Professor pro(Professor p)
	{
		p.setNome(JOptionPane.showInputDialog("Nome: "));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
		p.setCpf(Integer.parseInt("CPF: "));
		p.setSexo(JOptionPane.showInputDialog("Sexo: "));
		p.setSiape(Integer.parseInt(JOptionPane.showInputDialog("Siape: ")));
		
		return p;
	}
	
	public Aluno alu(Aluno a)
	{
		a.setNome(JOptionPane.showInputDialog("Nome: "));
		a.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
		a.setCpf(Integer.parseInt("CPF: "));
		a.setSexo(JOptionPane.showInputDialog("Sexo: "));
		a.setRa(Integer.parseInt(JOptionPane.showInputDialog("RA: ")));

		return a;
	}

	public String nome()
	{
		String nome = JOptionPane.showInputDialog("Nome: ");
		return nome;
	}
	public String cpf()
	{
		String cpf = JOptionPane.showInputDialog("CPF: ");
		return cpf;
	}
}
