package aula_012_polimorfismo_parte_1;

public abstract class Animal {
	//classe abstrata não pode ser instânciada por um objeto
	//atributos
	protected double peso;
	protected int idade;
	protected int membros;
	//construtor vazio
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	//construtor com parâmetros
	public Animal(double peso, int idade, int membros) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	//métodos getters e setters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	//métodos abstratos
	//esses métodos na classe abstrata devem ser apenas informados e
	//nas sub-classes é vão receber linhas de códigos;;;;
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
}
