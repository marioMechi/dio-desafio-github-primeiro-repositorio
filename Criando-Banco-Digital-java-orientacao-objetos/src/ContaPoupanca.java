
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void imprirExtrato() {
		System.out.println("===Extrato Conta Poupan�a===");
		super.imprimirInfosComuns();
	}

}
