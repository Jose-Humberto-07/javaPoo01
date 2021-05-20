package aula_009_exercicio_pratico;

public class Livro implements Publicacao {
	//atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	//conatrutor vazio (padrão)
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	//construtor com parâmetros
	public Livro(String titulo, String autor, int totPaginas,int paginaAtual ,boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	//métodos getters e setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	//métodos personalizados
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, paginaAtual="
				+ paginaAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor + "]";
	}
	//interface
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int pagina) {
		this.paginaAtual = pagina;
	}
	@Override
	public void avancarPagina() {
		this.paginaAtual++;
	}
	@Override
	public void voltarPagina() {
		this.paginaAtual--;
		
	}
}
