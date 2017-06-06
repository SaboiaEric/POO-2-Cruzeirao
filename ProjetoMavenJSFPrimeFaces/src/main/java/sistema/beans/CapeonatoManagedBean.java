package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.dao.CampeonatoDAO;
import sistema.modelos.Campeonato;

@ManagedBean(name = "CampeonatoMB")
@ViewScoped
public class CapeonatoManagedBean {
   
        private CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
        private Campeonato campeonato = new Campeonato();
        
        public String envia() {
              
              campeonato = campeonatoDAO.getCampeonato(campeonato.getNome());
              if (campeonato == null) {
                    campeonato = new Campeonato();
                    return null;
              } else {
                    return "/main";
              }
        }
   
        public Campeonato getCampeonato() {
              return campeonato;
        }
   
        public void setCampeonato(Campeonato campeonato) {
              this.campeonato = campeonato;
        }
  }