package aula_004_metodos_getters_setters_construtor;

public class Caneta {
	
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	//contrutor vazio
	//no contrutor eu posso atribuir valores padr�es para come�arem quando objeto for criado.
	// nesse caso aqui ele t� mandando a caneta ser tampada e azul (valores padr�es que eu coloquei nesse construtor)
	public Caneta() {
		this.tampar();
		this.cor = "Azul";

	}
	
	//contrutor com par�metros
	public Caneta(String modelo, float ponta, String cor, boolean tampada) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}

	
	//get � o m�todo acessor, vou acessar o valor
	// vou obter o valor, vou pegar o valor...
	//get n�o precisa de par�metro
	
	
	
	//set � o m�todo modificador, vou modificar o valor, vou atribuir, vou informar, vou dar o valor
	//set precisa de par�metro
	
	public String getModelo() {
		return modelo;
	}
	
	

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta:" + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
	}
	
	
}
