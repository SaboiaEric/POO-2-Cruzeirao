package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;

@ManagedBean(name = "CategoriaMB")
@SessionScoped
public class CategoriaManagedBean {

	private Categoria categoria = new Categoria();
	private CategoriaService service = new CategoriaService();

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public CategoriaService getService() {
		return service;
	}

	public void setService(CategoriaService service) {
		this.service = service;
	}

	public void salvar() {
		service.save(categoria);
		categoria = new Categoria();

	}
	
	public List<Categoria> getCategorias() {
		return service.getList();
	}
}
