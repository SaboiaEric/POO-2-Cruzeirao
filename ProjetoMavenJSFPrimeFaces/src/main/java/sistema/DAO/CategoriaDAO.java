package sistema.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import sistema.modelos.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria,Integer>{

	 private EntityManagerFactory factory = Persistence
             .createEntityManagerFactory("ProjetoMavenJSFPrimeFacesComJPA");
     private EntityManager em = factory.createEntityManager();

 	 public Categoria getCategoria(String nomeCategoria) {

       try {
             Categoria categoria = (Categoria) em
                        .createQuery(
                                    "SELECT u from Categoria u where u.nomeCategoria = :name")
                        .setParameter("name", nomeCategoria).getSingleResult();

             return categoria;
       } catch (NoResultException e) {
             return null;
       }
 	 }

 	 public boolean inserirCategoria(Categoria categoria) {
       try {
             em.persist(categoria);
             return true;
       } catch (Exception e) {
             e.printStackTrace();
             return false;
       }
     }

	@Override
	protected Class<Categoria> getClasseEntidade() {
		// TODO Auto-generated method stub
		return null;
	}  
 	 
 }
