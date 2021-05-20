package aula_011_heranca_parte_2;

public class Bolsista extends Aluno{
	private float bolsa;
	
	
	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Overrride
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista, pagamento facilitado");
	}
}
