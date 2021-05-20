/**
 * 
 */
package aula_003_visibilidade_de_atributos_e_metodos;

import aula_003_visibilidade_de_atributos_e_metodos.Caneta;

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
		
		/*
		 * //elementos internos privados podem ser se estiver dentro da classe principal
		 * e se estiver usando a classe caneta.
		 */		
		
		
		
		c1.modelo = "big cristal";
		c1.cor = "azul";
		//c1.ponta = 1.5;
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		
	}

}
