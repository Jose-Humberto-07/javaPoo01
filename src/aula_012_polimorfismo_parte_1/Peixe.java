package aula_012_polimorfismo_parte_1;

public class Peixe extends Animal{
	private String corEscama;
	
	
	public Peixe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peixe(double peso, int idade, int membros) {
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
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Soltou uma bolha");
	}

}
