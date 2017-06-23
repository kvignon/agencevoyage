package agenceVoyageModel;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aeroport {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;
	@Column(name="NumeroDeVol")
	private String nom;
	
	
	
	 @OneToMany(mappedBy = "vol")
	  private List<Vol> voyages;
}
