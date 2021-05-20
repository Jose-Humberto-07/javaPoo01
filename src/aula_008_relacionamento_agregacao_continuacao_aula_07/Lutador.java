/**
 * 
 */
package aula_008_relacionamento_agregacao_continuacao_aula_07;

/**
 * @author humbe
 *
 */
public class Lutador {
	//atributos
		private String nome;
		private String nacionalidade;
		private int idade;
		private float altura;
		private float peso;
		private String categoria;
		private int vitorias;
		private int derrotas;
		private int empates;
		//contrutor sem paramêtros
		public Lutador() {
			
		}
		//contrutor com parâmetros
		public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
				int vitorias, int derrotas, int empates) {
			super();
			this.nome = nome;
			this.nacionalidade = nacionalidade;
			this.idade = idade;
			this.altura = altura;
			this.setPeso(peso);
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
		}
		//métodos getters e setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
			this.setCategoria();
		}
		public String getCategoria() {
			return categoria;
		}
		//personalizado
		private void setCategoria() {
			if (this.getPeso() < 52.2) {
				this.categoria = "Inválido";
			}else {
				if(this.getPeso() < 70.3 ) {
					this.categoria = "Leve";
				}else {
					if (this.getPeso() < 83.9) {
						this.categoria = "Médio";
					}else {
						if (this.getPeso() < 1232) {
							this.categoria = "Pesado";
						}else {
							this.categoria = "Inválido";
						}
					}
				}
			}
		}
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
		//métodos personalizados
		public void apresentar() {
			System.out.println("=====================");
			System.out.println("======UFC COMBATE====");
			System.out.println("=====================");
			System.out.println("CHEGOUA A HORA! Apresentamos o lutador " + this.getNome());
			System.out.println("Nacionalidade: " + this.getNacionalidade());
			System.out.println("Idade: " + this.getIdade()+" anos");
			System.out.println("Altura: " + this.getAltura()+" m");
			System.out.println("Peso: " + this.getPeso() + " Kg");
			System.out.println("Vitórias: " + this.getVitorias());
			System.out.println("Derrotas: " + this.getDerrotas());
			System.out.println("Empates: " + this.getEmpates());
		}
		public void status() {
			System.out.println(this.getNome() + " é um peso " + this.categoria);
			System.out.println("Número de Vitórias: " + this.getVitorias());
			System.out.println("Número de Derrotas: " + this.getDerrotas());
			System.out.println("Número de Empates: " + this.getEmpates());
		}
		public void ganharLuta() {
			this.setVitorias(this.getVitorias() + 1);
		}
		public void perderLuta() {
			this.setDerrotas(this.getDerrotas() + 1);
		}
		public void empatarLuta() {
			this.setEmpates(this.getEmpates() + 1);
		}
}
