/**
 * 
 */
package aula_004_metodos_getters_setters_construtor;

/**
 * @author humbe
 *
 */
public class TesteCaneta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Nick", 0.4f, "Preto", true);
		Caneta c2 = new Caneta("BBB", 0.7f, "Azul-Mamão", false);
		//c1.setModelo("Bic");
		//c1.modelo = "Bic";
		
		//c1.setPonta(0.5f);
		//c1.ponta = o.5f;
		
		
		//c1.status();
		//System.out.println();
		//os métodos getters e setters vão proteger o acesso aos atributos...
		//aqui em baixo em vez de usar o atributo, usei o método get(pegar, obter) 
		//para ter acesso ao atributo modelo e ponta, para mostrar na tela
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		
		
		//c1.status();
		//c1.setCor("Amarelo");
		//c1.setTampada(false);
		//System.out.println();
		
		c1.status();
		System.out.println();
		c2.status();
	}

}
