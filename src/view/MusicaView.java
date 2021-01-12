package view;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import controller.MusicaController;
import model.Musica;

@ManagedBean
@SessionScoped
public class MusicaView {

	private Musica musica;
	private MusicaController musicaController;
	private List<Musica> musicas;
	private Boolean renderizarEditar;

	@PostConstruct
	public void init() {
		musicaController = new MusicaController();
		renderizarEditar = true;
		atualizarListaMusicas();
		criarNovaMusica();
	}

	public void cadastrarMusica() {
		musicaController.cadastrar(musica);
		atualizarListaMusicas();
		criarNovaMusica();
	}

	public void editarMusica(Musica musica) {

		if (musica.getEditando()) {
			renderizarEditar = true;
			musica.setEditando(false);
			musicaController.cadastrar(musica);
			atualizarListaMusicas();
		} else {
			renderizarEditar = false;
			musica.setEditando(true);
		}
	}

	public void excluirMusica(Musica musica) {

		if (musica.getEditando()) {
			renderizarEditar = true;
		}

		musicaController.deletar(musica.getID());
		atualizarListaMusicas();
	}

	private void atualizarListaMusicas() {
		musicas = musicaController.listarMusicas();
	}

	private void criarNovaMusica() {
		musica = new Musica();
	}

	public Musica getMusica() {
		return musica;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public Boolean getRenderizarEditar() {
		return renderizarEditar;
	}
}