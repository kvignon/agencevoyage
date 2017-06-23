package agenceVoyage;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import agenceVoyageDao.LoginDao;
import agenceVoyageDao.LoginDaoJpa;
import agenceVoyageDao.PassagerDao;
import agenceVoyageDao.PassagerDaoJpa;
import agenceVoyageDao.ReservationDao;
import agenceVoyageDao.ReservationDaoJpa;

public class Application {
	
	private static Application instance;

	private final EntityManagerFactory emf;
	private final PassagerDao passagerDao = new PassagerDaoJpa();
	private final ReservationDao reservationDao = new ReservationDaoJpa();
	private final LoginDao loginDao = new LoginDaoJpa();

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

	public PassagerDao getPassagerDao() {
		return passagerDao;
	}

	public ReservationDao getReservationDao() {
		return reservationDao;
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}
	
	

	
}
