package model;

public class Musica {

	private Long ID;
	private String nome;
	private String artista;
	private String genero;
	private Integer anoLancamento;
	private Boolean editando;

	private static Long contadorID = 1L;

	public Musica() {
		this.ID = contadorID;
		this.editando = false;
		contadorID++;
	}

	public Long getID() {
		return this.ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Boolean getEditando() {
		return editando;
	}

	public void setEditando(Boolean editando) {
		this.editando = editando;
	}
}