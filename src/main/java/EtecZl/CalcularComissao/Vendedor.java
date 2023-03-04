package EtecZl.CalcularComissao;

public class Vendedor {
	private String Nome ;
	private double SalarioBase ;
   
  
	
	public Vendedor() {
		
this ("Null",0);
	}
	
public Vendedor (String Nome , double SalarioBase  ) {
	
this.Nome = Nome ;
this.SalarioBase  = SalarioBase ;


}



public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	this.Nome = nome;
}

public double getSalarioBase() {
	return SalarioBase;
}

public void setSalarioBase(double SalarioBase) {
	this.SalarioBase = SalarioBase;
}
public void entrar(String valor ) {
	if (valor!= null) {
		this.setNome(valor);
	}
	
}
public double Calcularcomissao (double SalarioBase, double Venda) {
	double Comissao =  Venda * (0.03 + ( SalarioBase * 0.00001)) ;
	return Comissao;
	
}}

