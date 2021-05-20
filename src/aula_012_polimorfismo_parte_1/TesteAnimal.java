package aula_012_polimorfismo_parte_1;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m = new Mamifero(12.3, 2, 4);
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setCorPelo("Marron");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println();
		a.alimentar();
		a.locomover();
		a.emitirSom();
		r.locomover();
		System.out.println();
		Canguru c = new Canguru();
		c.locomover();
	}

}
