/**
 * 
 */
package aula_003_visibilidade_de_atributos_e_metodos;

/**
 * @author humbe
 *
 */
public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status(){
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar, pois estou tampada.");
		}else {
			System.out.println("Estou rabiscando, pois não estou tampada.");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
	
}
