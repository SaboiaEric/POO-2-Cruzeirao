package sistema.service;

import java.util.List;
import sistema.DAO.CategoriaDAO;
import sistema.modelos.Categoria;


public class CategoriaService {
	
	CategoriaDAO objectDAO = new CategoriaDAO();

	public Categoria save(Categoria obj){
		obj = objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
		return obj ;
	}

	public List <Categoria> getList()
	{
		List <Categoria> list =  objectDAO.getAll(Categoria.class);
		objectDAO.closeEntityManager();
		return list;
	}
	public void update(Categoria obj)
	{
		objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
	}
	public void remove(Categoria obj )
	{
		try{
			obj = objectDAO.getById(Categoria.class, (int)obj.getCodigoCategoria());
			objectDAO.remover(obj);
			objectDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover a inscrição" + obj.getCodigoCategoria());
		}
	}
}