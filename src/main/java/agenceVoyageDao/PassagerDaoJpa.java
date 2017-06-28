package agenceVoyageDao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import agenceVoyageModel.Login;
import agenceVoyageModel.Passager;


@Repository
@Transactional
public class PassagerDaoJpa implements PassagerDao{

	@PersistenceContext
	// Recherche un bean spring de type EntityManagerFactory et appelle la
	// m�thode .createEntityManager()
	private EntityManager em;
	
	@Override
	public List<Passager> findAll() {

		Query query = em.createQuery("from Passager");
		return query.getResultList();
	}

	@Override
	public Passager find(Long id) {
		return em.find(Passager.class, id);
	
	}

	@Override
	public void create(Passager obj) {

		em.persist(obj);
		
	}

	@Override
	public Passager update(Passager obj) {
	
		return em.merge(obj);
	}

	@Override
	public void delete(Passager obj) {

		em.remove(em.merge(obj));
	}
	

}
