package agenceVoyageModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="AeroVille")
public class AeroportVille {
	
	@Id
	@GeneratedValue	private Long aeroVille_id;
	@Id
	@GeneratedValue	private Long aeroport_id;
	
	@Version
	private int version;
	
	@ManyToOne
	@JoinColumn(name="aeroport_id")
	private Aeroport aeroport;
	
	@ManyToOne
	@JoinColumn(name="aeroVille_id")
	private Ville ville;

	public AeroportVille() {
			super();
		}
	
	public AeroportVille(Aeroport aeroport, Ville ville) {
			super();
			this.aeroport = aeroport;
			this.ville = ville;
	}


	
public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Long getAeroVille_id() {
		return aeroVille_id;
	}

	public void setAeroVille_id(Long aeroVille_id) {
		this.aeroVille_id = aeroVille_id;
	}
	
}
