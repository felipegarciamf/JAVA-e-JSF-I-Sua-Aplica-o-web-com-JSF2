package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LivroBean {

	public void gravar() {
		System.out.println("Gravando livro");
	}
	
	
}
