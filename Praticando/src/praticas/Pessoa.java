package praticas;
import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	String doc;
	Data dtnascimento;
	
	public Pessoa() {
		nome = JOptionPane.showInputDialog("Nome: ");
		doc = JOptionPane.showInputDialog("CPF: ");
		dtnascimento = new Data ();
	}
	
    public Pessoa(String nome) {
        this.nome = nome;
        doc = JOptionPane.showInputDialog("CPF: ");
        dtnascimento = new Data();
    }
	
	public String imprimePessoa() {
		return "Nome: " + nome + "\nCPF: " + doc + "\nData de Nascimento: " + dtnascimento.imprimeData();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public Data getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(Data dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

}
