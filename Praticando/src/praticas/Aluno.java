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
	        		"\nCódigo do Professor: " + prof.codigo;
	    }

}
