/**
 * 
 */
package aula_006_encapsulamento;

/**
 * @author humbe
 *
 */
public class ControleRemoto implements Controlador{
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//contrutor sem param�tro para come�ar com um valor padr�o quando for criado um objeto.
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	//m�todos getters e setters
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//m�todos abstratos
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}
	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("========MENU=======");
		System.out.println("Est� ligado? " + this.isLigado());
		System.out.println("Est� tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}
	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando Menu.");
	}
	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.isLigado() == true) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Imposs�vel aumentar volume.");
		}
	}
	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Imposs�vel diminuir volume.");
		}
	}
	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}
	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.isLigado() && this.isTocando() == false) {
			this.setTocando(true);
		}else {
			System.out.println("N�o conseguir reproduzir");
		}
	}
	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("N�o consefuir pausar.");
		}
	}
	
	
}
