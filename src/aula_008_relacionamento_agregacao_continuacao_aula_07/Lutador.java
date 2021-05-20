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
		//contrutor sem param�tros
		public Lutador() {
			
		}
		//contrutor com par�metros
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
		//m�todos getters e setters
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
				this.categoria = "Inv�lido";
			}else {
				if(this.getPeso() < 70.3 ) {
					this.categoria = "Leve";
				}else {
					if (this.getPeso() < 83.9) {
						this.categoria = "M�dio";
					}else {
						if (this.getPeso() < 1232) {
							this.categoria = "Pesado";
						}else {
							this.categoria = "Inv�lido";
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
		//m�todos personalizados
		public void apresentar() {
			System.out.println("=====================");
			System.out.println("======UFC COMBATE====");
			System.out.println("=====================");
			System.out.println("CHEGOUA A HORA! Apresentamos o lutador " + this.getNome());
			System.out.println("Nacionalidade: " + this.getNacionalidade());
			System.out.println("Idade: " + this.getIdade()+" anos");
			System.out.println("Altura: " + this.getAltura()+" m");
			System.out.println("Peso: " + this.getPeso() + " Kg");
			System.out.println("Vit�rias: " + this.getVitorias());
			System.out.println("Derrotas: " + this.getDerrotas());
			System.out.println("Empates: " + this.getEmpates());
		}
		public void status() {
			System.out.println(this.getNome() + " � um peso " + this.categoria);
			System.out.println("N�mero de Vit�rias: " + this.getVitorias());
			System.out.println("N�mero de Derrotas: " + this.getDerrotas());
			System.out.println("N�mero de Empates: " + this.getEmpates());
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
