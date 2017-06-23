package agenceVoyage;

import agenceVoyageDao.CompagnieAerienneDao;
import agenceVoyageDao.CompagnieAerienneVolDao;
import agenceVoyageModel.CompagnieAerienne;
import agenceVoyageModel.CompagnieAerienneVol;

public class AgenceVoyageWithDao {

	public static void main(String[] args) {
		CompagnieAerienneDao compagnieAerienneDao= Application.getInstance().getCompagnieAerienneDao();
		CompagnieAerienneVolDao compagnieAerienneVolDao= Application.getInstance().getCompagnieAerienneVolDao();
		
		CompagnieAerienne transavia= new CompagnieAerienne("Transavia");
		compagnieAerienneDao.create(transavia);
		
		CompagnieAerienneVol essai = new CompagnieAerienneVol("numéro1");
		compagnieAerienneVolDao.create(essai);
	}

}
