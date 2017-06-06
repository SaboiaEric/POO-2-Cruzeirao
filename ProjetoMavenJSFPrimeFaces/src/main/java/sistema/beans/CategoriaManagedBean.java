package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.dao.CategoriaDAO;
import sistema.modelos.Categoria;

@ManagedBean(name = "CategoriaMB")
@ViewScoped
public class CategoriaManagedBean {

	private CategoriaDAO categoriaDAO = new CategoriaDAO();
    private Categoria categoria = new Categoria();
    
    public String envia() {
          
          categoria = categoriaDAO.getCategoria(categoria.getNome());
          if (categoria == null) {
                categoria = new Categoria();
                return null;
          } else {
                return "/main";
          }
    }

    public Categoria getCategoria() {
          return categoria;
    }

    public void setCategoria(Categoria categoria) {
          this.categoria = categoria;
    }
}
