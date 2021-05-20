/**
 * 
 */
package aula_005_exemplo_prático_conta_banco;

/**
 * @author humbe
 *
 */
public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//contrutor vazio
	public ContaBanco() {
		this.setDono(null);//this.dono = null;
		this.setSaldo(0);//this.saldo = 0 ;
		this.setStatus(false);//this.status = false;
	}
	
	//construtor da class
	public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
		
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}
	
	//métododos acessores e modificadores
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	//todo get booleano usa "is" e não "get"
	public boolean getStatus() {
		return status;
	}
	
	
	//métodos personalizados
	public void estadoAtual() {
		System.out.println("======================================");
		System.out.println("============Conta de Banco============");
		System.out.println("======================================");
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Nome do cliente: " + this.dono);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
		System.out.println("======================================");

	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		}else {
			if (tipo == "CP") {
			this.setSaldo(150);
			}
		}
		System.out.println("Conta aberta com sucesso.");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro.");
		}else {
			if (this.getSaldo() < 0) {
				System.out.println("Conta não pode sr fechada pois tem débito.");
			}else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			}
		}
	}
	//nesse caso vamos atribuir para o "set", o "get", o que get já tem valor.
	public void depositar(float valor) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada.");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na cont de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para sacar.");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada.");
		}
	}

	public void pagarMensalidade() {
		int valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		}else {
			if(this.getTipo() == "CP") {
				valor = 20;
			}
		}
		if (this.getStatus() == true) {
			this.setSaldo(getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar conta fechada.");
		}
	}
}
