package contaBanco;

import java.util.Scanner;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o saldo inicial: ");
		double saldoInicial = entrada.nextDouble();
		
		System.out.println("Informe o número da conta: ");
		int numeroConta = entrada.nextInt();
		
		System.out.println("Informe o número da agência: ");
		String numeroAgencia = entrada.next();
		
		System.out.println("Informe o nome do Cliente: ");
		String nomeCliente = entrada.next();
		
		ContaTerminal contaterminal = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, saldoInicial);
		
		System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoInicial + " já está disponível para saque\".");
	}

}
