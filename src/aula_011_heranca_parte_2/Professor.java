package aula_011_heranca_parte_2;


public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String especialidade, float salario) {
		super();
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	//métodos personazados
	public void receberSalario(float aumento) {
		this.salario += aumento;
	}
}
