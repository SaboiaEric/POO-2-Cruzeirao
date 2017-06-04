package sistema.service;

import java.util.List;
import sistema.DAO.InscricaoDAO;
import sistema.modelos.Inscricao;


public class InscricaoService {
	
	InscricaoDAO inscricaoDAO = new InscricaoDAO();

	public Inscricao save(Inscricao inscricao ){
		
		inscricao  = inscricaoDAO.salvar(inscricao );
		inscricaoDAO.closeEntityManager();
		return inscricao ;
	}

	public List <Inscricao> getInscricoes()
	{
		List <Inscricao> list =  inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}
	public void update(Inscricao inscricao)
	{
		inscricaoDAO.salvar(inscricao);
		inscricaoDAO.closeEntityManager();
	}
	public void remove(Inscricao inscricao )
	{
		try{
		inscricao = inscricaoDAO.getById(Inscricao.class, (int)inscricao.getNumero());
		inscricaoDAO.remover(inscricao );
		inscricaoDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover a inscrição" + inscricao.getNumero());
		}
	}
}