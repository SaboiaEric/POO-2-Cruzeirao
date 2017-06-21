package sistema.service;

import java.util.List;
import sistema.DAO.CampeonatoDAO;
import sistema.modelos.Campeonato;


public class CampeonatoService {
	
	CampeonatoDAO objectDAO = new CampeonatoDAO();

	public Campeonato save(Campeonato obj){
		obj = objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
		return obj ;
	}

	public List <Campeonato> getList()
	{
		List <Campeonato> list =  objectDAO.getAll(Campeonato.class);
		objectDAO.closeEntityManager();
		return list;
	}
	public void update(Campeonato obj)
	{
		objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
	}
	public void remove(Campeonato obj )
	{
		try{
			obj = objectDAO.getById(Campeonato.class, (int)obj.getCodigoCampeonato());
			objectDAO.remover(obj);
			objectDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover a inscrição" + obj.getCodigoCampeonato());
		}
	}
}