package sistema.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import sistema.modelos.Campeonato;

public class CampeonatoDAO {
	   
    private EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("campeonato");
    private EntityManager em = factory.createEntityManager();

    public Campeonato getCampeonato(String nomeCampeonato) {

          try {
                Campeonato campeonato = (Campeonato) em
                           .createQuery(
                                       "SELECT u from Campeonato u where u.nomeCampeonato = :name")
                           .setParameter("name", nomeCampeonato).getSingleResult();

                return campeonato;
          } catch (NoResultException e) {
                return null;
          }
    }

  public boolean inserirCampeonato(Campeonato campeonato) {
          try {
                em.persist(campeonato);
                return true;
          } catch (Exception e) {
                e.printStackTrace();
                return false;
          }
    }
}