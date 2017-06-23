package agenceVoyage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import agenceVoyageDao.CompagnieAerienneDao;
import agenceVoyageDao.CompagnieAerienneDaoJpa;
import agenceVoyageDao.CompagnieAerienneVolDao;
import agenceVoyageDao.CompagnieAerienneVolDaoJpa;


//Singleton
public class Application {
	private static Application instance;

	private final EntityManagerFactory emf;
	private final CompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
	private final CompagnieAerienneVolDao compagnieAerienneVolDao= new CompagnieAerienneVolDaoJpa();
	private Application() {
		emf = Persistence.createEntityManagerFactory("tpFormation");
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public CompagnieAerienneDao getCompagnieAerienneDao() {
		return compagnieAerienneDao;
	}

	public static void setInstance(Application instance) {
		Application.instance = instance;
	}

	public CompagnieAerienneVolDao getCompagnieAerienneVolDao() {
		return compagnieAerienneVolDao;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}
}
