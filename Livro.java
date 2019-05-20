public class Livro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;

	public Livro(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.setLivro(_titulo, _autor, _numeroPaginas, _anoEdicao);
	}
	public String getAutor() {
		return this.autor;
	}
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	public void setLivro (String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.titulo = _titulo;
		this.autor = _autor;
		this.numeroPaginas = _numeroPaginas;
		this.anoEdicao = _anoEdicao;
	}
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + this.getAutor() + ", numeroPaginas=" + this.getNumeroPaginas() + ", anoEdicao="
				+ this.getAnoEdicao() + "]";
	}	
}