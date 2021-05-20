package aula_012_polimorfismo_parte_1;

public class Ave extends Animal{
	private String corPena;
	
	public Ave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ave(double peso, int idade, int membros) {
		super(peso, idade, membros);
		// TODO Auto-generated constructor stub
	}
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

}
