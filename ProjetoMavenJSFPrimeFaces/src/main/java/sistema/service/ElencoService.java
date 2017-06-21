package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Elenco;

public class ElencoService {

	private ArrayList <Elenco> elencos = new ArrayList<Elenco>();
	
	public ElencoService()
	{

	}
	
	public void salvar(Elenco elenco)
	{
		elencos.add(elenco);
	}
	

	public List <Elenco> getElencos()
	{
		
		return elencos;
		
	}
	
	
}
