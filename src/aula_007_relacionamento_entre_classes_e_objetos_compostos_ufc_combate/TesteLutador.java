/**
 * 
 */
package aula_007_relacionamento_entre_classes_e_objetos_compostos_ufc_combate;

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
		Lutador[] l = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);
		l[1] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);
		l[2] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);
		l[3] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);
		l[4] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);
		l[5] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11, 2, 1);

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
	}

}
