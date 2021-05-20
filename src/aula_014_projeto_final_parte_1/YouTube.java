package aula_014_projeto_final_parte_1;

import aula_013_polimorfismo_parte_2_sobrecarga.Visualizacao;

public class YouTube {

	public static void main(String[] args) {
		Video v = new Video("aula poo");
		System.out.println(v.toString());
		System.out.println();
		Gafanhoto g = new Gafanhoto("Jubileu", 22, "M", "@juba");
		System.out.println(g.toString());
		System.out.println();
		System.out.println("Visualização");
		Visualizacao vis = new Visualizacao(g, v);
		vis.avaliar(50f);
		System.out.println(vis.toString());
		
	}

}
