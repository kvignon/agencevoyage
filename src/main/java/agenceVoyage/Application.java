package agenceVoyage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import agenceVoyageDao.FormationDao;
import agenceVoyageDao.FormationDaoJpa;
import agenceVoyageDao.MatiereDao;
import agenceVoyageDao.MatiereDaoJpa;


//Singleton
public class Application {
	private static Application instance;

	private final EntityManagerFactory emf;
	
	private Application() {
		emf = Persistence.createEntityManagerFactory("tpFormation");
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}
}
