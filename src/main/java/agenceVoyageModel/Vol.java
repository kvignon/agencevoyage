package agenceVoyageModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vol {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;
	@Column
	private java.util.Date dateDepart;
	@Column
	private java.util.Date dateArrivee;
	@Column
	private java.util.Date heureDepart;
	@Column
	private java.util.Date heureArrivee;
	
	
	 @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="vol")
	  private Aeroport vol;
	

}
