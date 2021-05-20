package aula_010_heranca_parte_1;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	//métodos especiais
	public void cancelarMatr() {
		System.out.println("Matrícula será cancelada");
	}
	
}
