package sistema.DAO;

import sistema.modelos.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria,Integer>{

	@Override
	protected Class<Categoria> getClasseEntidade() {
		return Categoria.class;
	}

}
