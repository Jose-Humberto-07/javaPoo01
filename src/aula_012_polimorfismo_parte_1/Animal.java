package aula_012_polimorfismo_parte_1;

public abstract class Animal {
	//classe abstrata n�o pode ser inst�nciada por um objeto
	//atributos
	protected double peso;
	protected int idade;
	protected int membros;
	//construtor vazio
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	//construtor com par�metros
	public Animal(double peso, int idade, int membros) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	//m�todos getters e setters
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
	//m�todos abstratos
	//esses m�todos na classe abstrata devem ser apenas informados e
	//nas sub-classes � v�o receber linhas de c�digos;;;;
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
}
