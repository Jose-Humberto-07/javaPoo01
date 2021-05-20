package aula_010_heranca_parte_1;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String setor, boolean trabalhando) {
		super();
		this.setor = setor;
		this.trabalhando = trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	//métodos personalizados
	public void mudaTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
}
