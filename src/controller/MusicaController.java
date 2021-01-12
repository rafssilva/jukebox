package controller;

import java.util.ArrayList;
import java.util.List;
import model.BancoDeDados;
import model.Musica;

public class MusicaController {

	public void cadastrar(Musica musica) {
		BancoDeDados.catalogoMusicas.put(musica.getID(), musica);
	}

	public void deletar(Long ID) {
		BancoDeDados.catalogoMusicas.remove(ID);
	}

	public List<Musica> listarMusicas() {
		return new ArrayList<>(BancoDeDados.catalogoMusicas.values());
	}
}