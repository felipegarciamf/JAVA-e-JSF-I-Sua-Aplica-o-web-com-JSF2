package br.com.caelum.livraria.util;

public class RedirectView {
	
	private String viewName;
	
	public RedirectView(String viewName){
		this.viewName = viewName;
	}
	
	public String toString() {
		return viewName + "?faces-redirect=true";
	}

}
