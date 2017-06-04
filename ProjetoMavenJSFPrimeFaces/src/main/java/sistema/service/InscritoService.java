package sistema.service;

import java.util.List;
import sistema.DAO.InscritoDAO;
import sistema.modelos.Inscrito;


public class InscritoService {
	
	InscritoDAO objectDAO = new InscritoDAO();

	public Inscrito save(Inscrito obj ){
		
		obj = objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
		return obj ;
	}

	public List <Inscrito> getList()
	{
		List <Inscrito> list =  objectDAO.getAll(Inscrito.class);
		objectDAO.closeEntityManager();
		return list;
	}
	public void update(Inscrito obj)
	{
		objectDAO.salvar(obj);
		objectDAO.closeEntityManager();
	}
	public void remove(Inscrito obj )
	{
		try{
			obj = objectDAO.getById(Inscrito.class, (int)obj.getCodigoInscrito());
			objectDAO.remover(obj);
			objectDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover a inscrição" + obj.getCodigoInscrito());
		}
	}
}