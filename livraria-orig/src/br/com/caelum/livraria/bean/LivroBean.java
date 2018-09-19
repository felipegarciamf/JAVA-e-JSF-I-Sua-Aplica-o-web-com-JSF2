package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
@ViewScoped
public class LivroBean {

	private Livro livro = new Livro();

	private List<Autor> autores;
	private List<Livro> livros;
	
	
	public List<Livro> getLivros() {
		return new DAO(Livro.class).listaTodos();
	}

	private int autorId;

	public Livro getLivro() {
		return livro;
	}
	


	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

		if (livro.getAutores().isEmpty()) {
			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
		}

		new DAO<Livro>(Livro.class).adiciona(this.livro);
		
		this.livro = new Livro();
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public List<Autor> getAutores(){
		return new DAO<Autor>(Autor.class).listaTodos();
	}

	public int getAutorId() {
		return autorId;
	}
	
	public void setAutorId(int autorId) {
		this.autorId = autorId;
	}
	
	public void gravarAutor() {
		Autor autor = new DAO<Autor>(Autor.class).buscaPorId(this.autorId);
		this.livro.adicionaAutor(autor);
		System.out.println("livro escrito : " + autor.getNome());
		System.out.println(autor.getId());
		System.out.println(this.autorId);
	}
	
	public List<Autor> getAutoresDoLivro(){
		
		return this.livro.getAutores();
		
	}



}
