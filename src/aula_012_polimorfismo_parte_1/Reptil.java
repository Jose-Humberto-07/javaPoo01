package aula_012_polimorfismo_parte_1;

public class Reptil extends Animal{
	private String corEscama;
	
	public Reptil(String corEscama) {
		super();
		this.corEscama = corEscama;
	}

	public Reptil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptil(double peso, int idade, int membros) {
		super(peso, idade, membros);
		// TODO Auto-generated constructor stub
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
	}

}
