package aula_009_exercicio_pratico;

public interface Publicacao {
	//métodos personalizados
	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhear(int pagina);
	public abstract void avancarPagina();
	public abstract void voltarPagina();
}
