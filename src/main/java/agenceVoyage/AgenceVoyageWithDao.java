package agenceVoyage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import agenceVoyageDao.LoginDao;
import agenceVoyageDao.PassagerDao;
import agenceVoyageDao.ReservationDao;
import agenceVoyageModel.Login;
import agenceVoyageModel.Passager;
import agenceVoyageModel.Reservation;


public class AgenceVoyageWithDao {

	public static void main(String[] args) {
		
		PassagerDao passagerDao = Application.getInstance().getPassagerDao();
				
		Passager farid = new Passager("farid", "Elammari", new agenceVoyageModel.Adresse("3 rue Besson", "94110", "Arcueil", "France"));
		passagerDao.create(farid);
						
		ReservationDao reservationDao = Application.getInstance().getReservationDao();
		
		SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
		Date dateRes = null;
	
		try{
			dateRes=format.parse("04/05/2017");
			
		}catch(ParseException e){System.out.println("c'est ici le probleme "+e);}
		
		Reservation reserv1 = new Reservation(dateRes, 1);
		
		reservationDao.create(reserv1);
		
		LoginDao loginDao = Application.getInstance().getLoginDao();
		
		Login login1 = new Login("farid2b", "Farid2B2A", true);
		
		loginDao.create(login1);
		
	}

}
