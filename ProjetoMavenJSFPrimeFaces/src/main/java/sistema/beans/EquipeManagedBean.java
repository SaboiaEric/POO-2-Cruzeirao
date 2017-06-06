package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

import sistema.modelos.Equipe;
import sistema.service.EquipeService;;

@ManagedBean
@ViewScoped
public class EquipeManagedBean {
	
	private Equipe equipe = new Equipe();
	private EquipeService service = new EquipeService();
	
	public void salvar()
	{
		service.save(equipe);
		equipe = new Equipe();
		
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		return service.getList();
	}

}
