import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private Object cliente;
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> imprimirListaClientes() {
		System.out.println("===Lista de Clienteas");
		//for(conta != null) {
			System.out.println(String.format("Titular: %s", ((Banco) this.cliente).getNome()));
		}
	}

