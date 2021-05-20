package aula_012_polimorfismo_parte_1;

public class Mamifero extends Animal{
	private String corPelo;
	
	public Mamifero(String corPelo) {
		super();
		this.corPelo = corPelo;
	}

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(double peso, int idade, int membros) {
		super(peso, idade, membros);
		// TODO Auto-generated constructor stub
	}
	//métodos getters e setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	//métodos personalizados implementados da classe abstrara
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}
	
}
