package agenceVoyageDao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import agenceVoyageModel.Login;
import agenceVoyageModel.Ville;


@Repository
@Transactional
public class VilleDaoJpa implements VilleDao{

	@PersistenceContext
	// Recherche un bean spring de type EntityManagerFactory et appelle la
	// méthode .createEntityManager()
	private EntityManager em;
	
	@Override
	public List<Ville> findAll() {
		
		Query query = em.createQuery("from Ville");
		return query.getResultList();
	}

	@Override
	public Ville find(Long id) {
		
		return em.find(Ville.class, id);
	}

	@Override
	public void create(Ville obj) {

		em.persist(obj);
	}

	@Override
	public Ville update(Ville obj) {

		return em.merge(obj);
	}

	@Override
	public void delete(Ville obj) {

		em.remove(em.merge(obj));
	}

}
