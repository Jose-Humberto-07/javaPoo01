package aula_008_relacionamento_agregacao_continuacao_aula_07;

import java.util.Random;

public class Luta {
	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	//contrutor vazio (padrão)
	public Luta() {
		super();
	}
	//contrutor com parâmetros
	public Luta(Lutador desafiando, Lutador desafiante, int rounds, boolean aprovada) {
		super();
		this.desafiado = desafiando;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}
	
	//métodos getters e setters
	public Lutador getDesafiando() {
		return desafiado;
	}
	public void setDesafiando(Lutador desafiando) {
		this.desafiado = desafiando;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//métodos personalizados
		public void marcarLuta(Lutador l1, Lutador l2) {
			if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
			} else {
				this.aprovada = false;
				 this.desafiado = null;
				 this.desafiante = null;
			}
		}
		
		public void lutar() {
			if (this.aprovada) {
				System.out.println("### DEAFIADO ###");
				this.desafiado.apresentar();
				System.out.println();
				this.desafiante.apresentar();
				
				Random numeroRandom = new Random();
				int vencedor = numeroRandom.nextInt(3);
				System.out.println("========RESULTADO DA LUTA========");
				switch(vencedor) {
				case 0: //empate
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("Vitória do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: 
					System.out.println("Vitória do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				}
				System.out.println("=================================");
			}else {
				System.out.println("Não é posível realizar a luta.");
			}
		}
	
}
