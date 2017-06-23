package agenceVoyageModel;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Entity
@DiscriminatorValue(value="ClientEl")
public class ClientEl extends Client{
	@Column(name="Physicaltitle")
	@Enumerated(EnumType.STRING)
	private  TitrePhysique titre;
	@Column(name="firstname",length=255) 
	private String prenom;
	
	
	
	public ClientEl() {
		super();
	}
	
	
	public ClientEl(String titrePhysique, String prenom) {
		super();
		this.titre = titre;
		this.prenom = prenom;
	}


	public TitrePhysique getTitre() {
		return titre;
	}


	public void setTitre(TitrePhysique titre) {
		this.titre = titre;
	}


	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	
	
}
