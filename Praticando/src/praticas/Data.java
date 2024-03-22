package praticas;

import javax.swing.JOptionPane;

public class Data {
	int dia, mes, ano;

	public Data() {
		dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
	}

	private String nomeMes(int mes) {
		String nomeMes = "";

		switch (mes) {
			
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Fevereiro";
			break;
		case 3:
			nomeMes = "Março";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
			break;
		default:
			nomeMes = "Mês Inválido";

		}

		return nomeMes;
	}

	public String imprimeData() {
		String formataMes = String.format("%02d", mes);
		String nomeMes = nomeMes(Integer.parseInt(formataMes));

		return "Dia:" + dia + "\nMês: " + nomeMes + "\nAno:" + ano;
	}

}
