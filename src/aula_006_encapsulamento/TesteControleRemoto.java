/**
 * 
 */
package aula_006_encapsulamento;

/**
 * @author humbe
 *
 */
public class TesteControleRemoto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.ligarMudo();
		c.desligarMudo();
		c.desligar();
		c.maisVolume();
		c.desligar();
		c.maisVolume();
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.play();
		c.desligar();
		c.play();
		c.abrirMenu();
	}

}
