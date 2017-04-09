package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Inscricao;;

public class InscricaoService {

	private ArrayList <Inscricao> incricoes = new ArrayList<Inscricao>();
	
	public InscricaoService()
	{

	}
	
	public void salvar(Inscricao inscricao)
	{
	    incricoes.add(inscricao);
	}
	

	public List <Inscricao> getInscricoes()
	{
		
		return incricoes;
		
	}
	
	
}
