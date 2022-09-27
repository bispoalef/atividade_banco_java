import java.util.ArrayList;

public class Cliente extends Conta {

	String nome;
	String dataNascimento;
	String cpf;
	ArrayList<String> extratoContaCorrente = new ArrayList<>();




	ArrayList<String> extratoContaPoupanca = new ArrayList<>();

	public Cliente(int agencia, int numeroConta, String nome,
			String dataNascimento, String cpf) {
		super(agencia, numeroConta);
		{
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.cpf = cpf;
		}
	}

	public String getExtratoContaCorrente() {
		return "Extrato conta corrente: \n " + extratoContaCorrente;
	}

	public void adicionarExtratoContaCorrente(String movimentacao) {
		this.extratoContaCorrente.add(movimentacao);
	}

	public String getExtratoContaPoupanca() {
		return "Extrato conta poupanca: \n " + extratoContaPoupanca;
	}

	public void adicionarExtratoContaPoupanca(String movimentacao) {
		this.extratoContaPoupanca.add(movimentacao);
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
