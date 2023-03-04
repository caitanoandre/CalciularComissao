package EtecZl.CalcularComissao;

public class MenuComissao {
	private Vendedor vendedor ;
	private  int  opcao;
	private ConversorNumeros conversor ;
	private EntradaSaidaDados io;
	private String mensagemMenu;
	
	public MenuComissao () {
		this.vendedor = new Vendedor ();
		this.opcao = -1;
		this.conversor = new ConversorNumeros();
		this.io = new EntradaSaidaDados();
		
	}
	public void execultarcomissao() {
		
		do {
			this.execultarPrincipal();
			this.avaliarOpcaoEscolhida();
		}while (this.opcao!=0);
		
	}
	private void execultarPrincipal() {
	String mensagemMenu ="Selecione opção"
			+"\n 1 - Criar Vendedor"
			+"\n 2 - Realizar Cálculo de Comissão do Vendedor"
			+"\n 3 - exibir Vendedor"
			+"\n 0 - Sair ";
	
	String entradaDados = io.entradaDados(mensagemMenu);
	this.opcao = conversor.stringToInt(entradaDados);

	}
public void avaliarOpcaoEscolhida() {
	switch (this.opcao) {
	
	case 1 :
	String mensagemEntrada ="digite o nome do vendedor";
	String valorEntrada = io.entradaDados(mensagemEntrada);
	vendedor.entrar(valorEntrada);
	break;
		
	case 2 : String mensagemEnt = "Informe salario ";
	String entradaVenda ="Informe valor vendido ";
	double salario = conversor.stringToDouble(io.entradaDados(mensagemEnt));
	double venda = conversor.stringToDouble(io.entradaDados(entradaVenda));
	double res = vendedor.Calcularcomissao(salario, venda);
	io.saidaDadosDouble(res);
	
	break;
	
	
	case 3: String mensagemVendedor ="O vendedor é:" + vendedor.getNome();
	io.saidaDados(mensagemVendedor);
	break;
	
	case 0: io.saidaDados("Finalizado Programa !");
	break;
	
	default:
	io.saidaDados("Opção Inválida");
	break;
		
			
	}}
}

	


