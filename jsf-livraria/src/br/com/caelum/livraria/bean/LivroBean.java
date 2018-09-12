package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LivroBean {

	private Livro livro = new Livro();

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.titulo);
	}

	public Livro getLivro() {
		return livro;
	}

}
