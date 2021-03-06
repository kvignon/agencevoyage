package agenceVoyageDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import agenceVoyageModel.Login;


@Repository
@Transactional
public class LoginDaoJpa implements LoginDao{
	
	@PersistenceContext
	// Recherche un bean spring de type EntityManagerFactory et appelle la
	// m�thode .createEntityManager()
	private EntityManager em;
	
	@Override 
	public List<Login> findAll() {

		Query query = em.createQuery("from Login");
		return query.getResultList();
	}

	@Override
	public Login find(Long id) {
		return em.find(Login.class, id);
	}

	@Override
	public void create(Login obj) {
		em.persist(obj);
	}

	@Override
	public Login update(Login obj) {

		return em.merge(obj);
	}

	@Override
	public void delete(Login obj) {
		em.remove(em.merge(obj));
		
	}
		
}

