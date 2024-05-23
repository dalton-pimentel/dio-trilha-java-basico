package contaBanco;

public class ContaTerminal {
	
	int numero;
	String agencia; 
	String nomeCliente;
	double saldo;
	
	ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

}

