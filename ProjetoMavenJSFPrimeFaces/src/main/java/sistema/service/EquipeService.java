package sistema.service;

import java.util.List;
import sistema.DAO.EquipeDAO;
import sistema.modelos.Equipe;


public class EquipeService {
	
	EquipeDAO objectDAO = new EquipeDAO();

	public Equipe save(Equipe obj){
		obj = objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
		return obj ;
	}

	public List <Equipe> getList()
	{
		List <Equipe> list =  objectDAO.getAll(Equipe.class);
		objectDAO.closeEntityManager();
		return list;
	}
	public void update(Equipe obj)
	{
		objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
	}
	public void remove(Equipe obj )
	{
		try{
			obj = objectDAO.getById(Equipe.class, (int)obj.getCodigoEquipe());
			objectDAO.remover(obj);
			objectDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover a inscrição" + obj.getCodigoEquipe());
		}
	}
}