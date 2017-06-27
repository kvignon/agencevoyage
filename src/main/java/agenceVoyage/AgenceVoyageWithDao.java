package agenceVoyage;

import javassist.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AgenceVoyageWithDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

//		MatiereDao matiereDao = context.getBean(MatiereDao.class);
//		
//		Matiere jpa = new Matiere("JPA", Difficulte.FACILE);
//		
//		matiereDao.create(jpa);
//		
		context.close();
	}

}
