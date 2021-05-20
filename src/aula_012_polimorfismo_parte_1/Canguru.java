package aula_012_polimorfismo_parte_1;

public class Canguru extends Mamifero{

	@Override
	public void locomover() {
		super.locomover();
		System.out.println("Saltando");
	}
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}

}
