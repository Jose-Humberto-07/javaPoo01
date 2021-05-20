package aula_010_heranca_parte_1;

public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	//construtor vazio
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	//construtor com parâmetros
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	//métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//métodos personalizados
	public void fazerAni() {
		this.idade++;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	
}
