package aula_011_heranca_parte_2;


public class Aluno extends Pessoa{
	//atributos
	private int matricula;
	private String curso;
	//construtor com parâmetros
	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}
	//construtor vazio
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	//construtor da super class
	public Aluno(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	//métodos personalizados
	public void cancelarMatricula() {
		System.out.println("Matrícula será cancelada");
	}
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}
	//métodos (final) não podem ser sobrepostos
}