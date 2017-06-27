package agenceVoyageModel;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value = "ClientEl")
public class ClientEl extends Client {
	
	@Column(name = "Physicaltitle")
	@Enumerated(EnumType.STRING)
	private TitrePhysique titre;
	
	public ClientEl() {
		super();
	}



	public TitrePhysique getTitre() {
		return titre;
	}

	public void setTitre(TitrePhysique titre) {
		this.titre = titre;
	}

	
}
