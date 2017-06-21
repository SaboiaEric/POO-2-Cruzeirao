package sistema.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import sistema.modelos.UsuarioTeste;

public class UsuarioTesteDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsuarioTestes");
	private EntityManager em = factory.createEntityManager();

	public UsuarioTeste getUsuarioTeste(String nomeUsuarioTeste, String senha) {

		try {
			UsuarioTeste usuarioTeste = (UsuarioTeste) em
					.createQuery("SELECT u from UsuarioTeste u where u.nomeUsuarioTeste = :name and u.senha = :senha")
					.setParameter("name", nomeUsuarioTeste).setParameter("senha", senha).getSingleResult();

			return usuarioTeste;
		} catch (NoResultException e) {
			return null;
		}
	}

	public boolean inserirUsuarioTeste(UsuarioTeste usuarioTeste) {
		try {
			em.persist(usuarioTeste);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletarUsuarioTeste(UsuarioTeste usuarioTeste) {
		try {
			em.remove(usuarioTeste);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
