package aula_013_polimorfismo_parte_2_sobrecarga;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro c = new Cachorro();
		
		c.reagir("Olá, cheguei");
		c.reagir("vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5);
		c.reagir(17, 4.0);
		c.reagir(3, "atacar");
	}

}
