
public abstract class Conta implements IConta{
	 protected int agencia;
	 protected int numero;
	 protected double saldo;
	 protected Cliente cliente;
	 private static final int AGENCIAPADRAO = 1;
	 private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIAPADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	 
	public int getAgencia() {
		return agencia;
	}
	public int getMumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
