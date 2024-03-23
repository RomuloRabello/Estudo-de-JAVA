package praticas;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	String ra;
	String nomeAluno;
	int nrFaltas;
	Data dtnascimento;
	
	Professor prof = new Professor();
	public Aluno() {
		nomeAluno = JOptionPane.showInputDialog("Nome do Aluno: ");
		ra = JOptionPane.showInputDialog("RA do Aluno: ");
		nrFaltas = Integer.parseInt(JOptionPane.showInputDialog("RA do Aluno: "));
		dtnascimento = new Data();
		dtnascimento.dia = Integer.parseInt(JOptionPane.showInputDialog("Dia do Nercimento do Aluno: "));
		dtnascimento.mes = Integer.parseInt(JOptionPane.showInputDialog("Mes do Nercimento do Aluno: "));
		dtnascimento.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Nercimento do Aluno: "));
	}

	 public String imprimePessoa() {
	        String nomePessoa = super.getNome(); 
	        
	        if (nomePessoa == null || nomePessoa.isEmpty()) {
	            nomePessoa = "N/A"; 
	        }
	        if (prof.nomeProf == null || prof.nomeProf.isEmpty()) {
	        	prof.nomeProf = "N/A"; 
	        }
	        return "Nome: " + nomePessoa + "\nCPF: " + super.getDoc() +
	        		"\nData de Nascimento: " + super.getDtnascimento().imprimeData() +
	        		"\nNome do Professor: " + prof.nomeProf +
	        		"\nCódigo do Professor: " + prof.codigo +
	        		"\nNome do Aluno: " + nomeAluno +
	        		"\nRA do Aluno: " + ra +
	        		"\nNumero de Faltas: " + nrFaltas +
	        		"\nDia do Nascimento do Aluno: " + dtnascimento.dia +
	        		"\nMes do Nascimento do Aluno: " + dtnascimento.mes +
	        		"\nAno do Nascimento do Aluno: " + dtnascimento.ano;
	    }

}
