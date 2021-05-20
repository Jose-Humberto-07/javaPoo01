package aula_011_heranca_parte_2;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//visitante
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(37);
		v1.setSexo("M");
		System.out.println(v1.toString());
		//aluno
		System.out.println();
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(11111);
		a1.setCurso("Informática");
		a1.setIdade(17);
		a1.setSexo("M");
		a1.pagarMensalidade();
		//bolsista
		System.out.println();
		Bolsista b1 = new Bolsista();
		b1.setNome("Jubileu");
		b1.setMatricula(1112);
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}

}
