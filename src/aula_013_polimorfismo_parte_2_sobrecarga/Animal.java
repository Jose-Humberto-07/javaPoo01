package aula_013_polimorfismo_parte_2_sobrecarga;

public abstract class Animal {
	protected double peso;
	protected int idade;
	protected int membros;
	public Animal() {
		super();
	}
	public Animal(double peso, int idade, int membros) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
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
	public abstract void emitirSom();
}
