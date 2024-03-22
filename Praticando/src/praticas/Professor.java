package praticas;
import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    String codigo;
    String nomeProf;
    
    public Professor() {
        super(); 
        codigo = JOptionPane.showInputDialog("Código do Professor: ");
        solicitarNomeProfessor();
    }
    
    public Professor(String pNome) {
        super(pNome); 
        codigo = JOptionPane.showInputDialog("Código do Professor: ");
    }
    
    public Professor(String pNome, String pCodigo) {
        super(pNome); 
        codigo = pCodigo; 
    }
    
    
    private void solicitarNomeProfessor() {
        nomeProf = JOptionPane.showInputDialog("Nome do Professor: ");
    }
    
    
    public String imprimePessoa() {
        String nomePessoa = super.getNome(); 
        
        if (nomePessoa == null || nomePessoa.isEmpty()) {
            nomePessoa = "N/A"; 
        }
        if (nomeProf == null || nomeProf.isEmpty()) {
        	nomeProf = "N/A"; 
        }
        return "Nome: " + nomePessoa + "\nCPF: " + super.getDoc() +
        		"\nData de Nascimento: " + super.getDtnascimento().imprimeData() +
        		"\nNome do Professor: " + nomeProf +
        		"\nCódigo do Professor: " + codigo;
    }
}
