package EtecZl.CalcularComissao;
import javax.swing.JOptionPane;
public class EntradaSaidaDados {
	public String entradaDados(String mensagemEntrada) {
		return JOptionPane.showInputDialog(mensagemEntrada);
	}
	
public void saidaDados(String mensagemSaida) {
	JOptionPane.showMessageDialog(null,mensagemSaida);
	
}
public void saidaDadosDouble(double mensagemSaida) {
	JOptionPane.showMessageDialog(null,mensagemSaida);
	
}
}
