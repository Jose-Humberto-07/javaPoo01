/**
 * 
 */
package aula_008_relacionamento_agregacao_continuacao_aula_07;


/**
 * @author humbe
 *
 */
public class TesteLutador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Lutador[] l = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);
		l[1] = new Lutador("Jacar�", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);
		l[2] = new Lutador("Silva ", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);
		l[3] = new Lutador("Le�o ", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);
		l[4] = new Lutador("Dr�cula", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);
		l[5] = new Lutador("Miojo", "Fran�a", 31, 1.75f, 68.9f,11, 2, 1);

		l[0].apresentar();
		System.out.println();
		l[0].status();
		System.out.println();
		
		
		l[1].apresentar();
		System.out.println();
		l[1].status();
		System.out.println();
		
		l[2].apresentar();
		System.out.println();
		l[2].status();
		System.out.println();
		
		l[3].apresentar();
		System.out.println();
		l[3].status();
		System.out.println();
		
		l[4].apresentar();
		System.out.println();
		l[4].status();
		System.out.println();
		
		l[5].apresentar();
		System.out.println();
		l[5].status();
		System.out.println();
		
		//Luta
		Luta ufc01 = new Luta();
		ufc01.marcarLuta(l[0], l[3]);
		ufc01.lutar();
		l[0].status();
		System.out.println();
		l[3].status();
	}

}
