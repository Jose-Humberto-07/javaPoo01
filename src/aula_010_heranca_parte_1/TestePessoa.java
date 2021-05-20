package aula_010_heranca_parte_1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		Funcionario funcio = new Funcionario();
		
		pes.setNome("Pedro");
		aluno.setNome("Maria");
		prof.setNome("Cláudio");
		funcio.setNome("Fabiana");
		
		pes.setSexo("M");
		aluno.setSexo("F");
		funcio.setIdade(25);
		
		funcio.mudaTrabalho();
		aluno.cancelarMatr();
		
		System.out.println(pes.toString());
		System.out.println(aluno.toString());
		System.out.println(prof.toString());
		System.out.println(funcio.toString());
		
		
	}
}
