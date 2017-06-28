package testAgenceVoyage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import agenceVoyageDao.LoginDao;
import agenceVoyageDao.PassagerDao;
import agenceVoyageDao.ReservationDao;
import agenceVoyageDao.VilleDao;
import agenceVoyageModel.Adresse;
import agenceVoyageModel.Login;
import agenceVoyageModel.Passager;
import agenceVoyageModel.Reservation;
import agenceVoyageModel.Ville;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestUnitAgenceVoyage {
		
		@Autowired
		private LoginDao loginDao;
		
		@Autowired
		private PassagerDao passagerDao;
		
		@Autowired
		private ReservationDao reservationDao;
		
		@Autowired
		private VilleDao villeDao;

		@Test
		public void testLogin() {
			
			Login log =new Login("farid", "farid2b2a", true);
			loginDao.create(log);
			
			Login logFind = loginDao.find(log.getLogin_id());
			
			Assert.assertEquals("farid", logFind.getLogin());
			Assert.assertEquals("farid2b2a", log.getMotDePasse());
			Assert.assertEquals(true, log.getAdmin());
			
			logFind.setLogin("elamari");
			
			Login logUpdate = loginDao.update(logFind);
			
			logFind = loginDao.find(logUpdate.getLogin_id());
			
			Assert.assertEquals("elamari", logFind.getLogin());
			
			List<Login> logs = loginDao.findAll();
			
			loginDao.delete(logFind);
			
			logFind = loginDao.find(logFind.getLogin_id());
			
			Assert.assertNull(logFind);
			
			List<Login> loginPostDelete = loginDao.findAll();
			
			Assert.assertEquals(1, logs.size() - loginPostDelete.size());
			
		}

		@Test
		public void testReservation() throws ParseException {
			
			SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
			
			Reservation reservation = new Reservation(sdf.parse("02/05/2017"), 1);
			
			reservationDao.create(reservation);
			
			Reservation reservationfind = reservationDao.find(reservation.getReservation_id());
			
			Assert.assertEquals("02/05/2017", sdf.format(reservationfind.getDate()));
			Assert.assertEquals(1, reservationfind.getNumero());
			
			reservationfind.setDate(sdf.parse("22/05/2017"));
			reservationfind.setNumero(2);
			
			Reservation reservationUpdate =reservationDao.update(reservationfind);
			
			reservationfind = reservationDao.find(reservationUpdate.getReservation_id());
			
			Assert.assertEquals("22/05/2017", sdf.format(reservationfind.getDate()));
			Assert.assertEquals(2, reservationfind.getNumero());
			
			List<Reservation> reservations = reservationDao.findAll();
			
			reservationDao.delete(reservationfind);

			reservationfind = reservationDao.find(reservationfind.getReservation_id());
			
			Assert.assertNull(reservationfind);
			
			List<Reservation> reservationPostDelete = reservationDao.findAll();
			
			Assert.assertEquals(1, reservations.size() - reservationPostDelete.size());
			
			
	}
		@Test
		public void testPassager() throws ParseException {
			


			Passager passager = new Passager("elamari", "farid", new Adresse( "110", "rue dede","202020","paris"));

			passagerDao.create(passager);

			Passager passagerFind = passagerDao.find(passager.getPassager_id());

			
			Assert.assertEquals("elamari", passagerFind.getNom());
			Assert.assertEquals("farid", passagerFind.getPrenom());

			passagerFind.setNom("kevin");
			passagerFind.setPrenom("baba");

			Passager passagerUpdate = passagerDao.update(passagerFind);

			passagerFind = passagerDao.find(passagerUpdate.getPassager_id());

			Assert.assertEquals("kevin", passagerFind.getNom());
			Assert.assertEquals("baba", passagerFind.getPrenom());

		
			List<Passager> passagers = passagerDao.findAll();
			
			passagerDao.delete(passagerFind);

			passagerFind = passagerDao.find(passagerFind.getPassager_id());
			
			Assert.assertNull(passagerFind);
			
			List<Passager> passagerPostDelete = passagerDao.findAll();
			
			Assert.assertEquals(1, passagers.size() - passagerPostDelete.size());
			
			
		}
	
		@Test
		public void testVille() throws ParseException {
			

			
			Ville ville = new Ville("Paris");
			
			villeDao.create(ville);
			
			Ville villeFind = villeDao.find(ville.getVille_id());
			
			Assert.assertEquals("Paris", villeFind.getNom());
			
			
			villeFind.setNom("Marseille");
			
			
			Ville villeUpdate = villeDao.update(villeFind);
			
			villeFind = villeDao.find(villeUpdate.getVille_id());
			
			
			
			Assert.assertEquals("Marseille", villeFind.getNom());
			
			
			
			List<Ville> Villes = villeDao.findAll();
			
			villeDao.delete(villeFind);

			villeFind = villeDao.find(villeFind.getVille_id());
			
			Assert.assertNull(villeFind);
			
			List<Ville> villePostDelete = villeDao.findAll();
			
			Assert.assertEquals(1, Villes.size() - villePostDelete.size());
		}
}
	

