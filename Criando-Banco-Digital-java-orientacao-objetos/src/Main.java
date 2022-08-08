
public class Main {

	public static void main(String[] args) {
		Cliente mario = new Cliente();
		mario.setNome("Mario");
		
		Conta cc = new ContaCorrente(mario);
		Conta poupanca = new ContaPoupanca(mario);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		Cliente joao = new Cliente();
		mario.setNome("João");
		
		Conta dd = new ContaCorrente(joao);
		Conta poupanca1 = new ContaPoupanca(joao);
	
		
		dd.depositar(100);
		dd.transferir(100, poupanca1);
		
		Cliente sara = new Cliente();
		sara.setNome("Sara");
		
		
		Conta ee = new ContaCorrente(sara);
		Conta poupanca2 = new ContaPoupanca(sara);
		
		ee.depositar(100);
		ee.transferir(100, poupanca2);
		
		cc.imprirExtrato();
		poupanca.imprirExtrato();
		
		dd.imprirExtrato();
		poupanca1.imprirExtrato();
		
		ee.imprirExtrato();
		poupanca2.imprirExtrato();
		
		imprimirListaClientes();
	}

}
