package aula_013_polimorfismo_parte_2_sobrecarga;

public class Cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase.equalsIgnoreCase("Ol�, cheguei")) {
			System.out.println("Abanar e latir");
		}else {
			System.out.println("Rosnar");
		}
	}
	public void reagir(int hora, int minuto) {
		if (hora < 12) {
			System.out.println("Abanar");
		}else if (hora >= 18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e latir");
		}
	}
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		}else {
			System.out.println("Rosnar e latir");
		}
	}
	public void reagir(int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		}else {
			if (peso < 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}
	}
	public void reagir(int idade, String atacar) {
		if (idade > 5 && atacar.equals("atacar")) {
			System.out.println("corre menino que eu vou te pegar");
		}else {
			System.out.println("vou ficar quieto");
		}
	}

}
