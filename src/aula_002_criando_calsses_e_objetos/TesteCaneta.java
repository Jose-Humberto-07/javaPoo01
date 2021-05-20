/**
 * 
 */
package aula_002_criando_calsses_e_objetos;

/**
 * @author humbe
 *
 */
public class TesteCaneta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta c1 = new Caneta();
		//atributos
		System.out.println("Caneta 1");
		c1.modelo = "castelo";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		//c1.tampada = false;
		//métodos
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		Caneta c2 = new Caneta();
		System.out.println("Caneta 2");
		c2.modelo = "HOSTNET";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
