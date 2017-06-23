package agenceVoyageModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class Ville {

	@Id
	@GeneratedValue
	private Long ville_id;
	@Column(name="name")
	private String nom;
	
	public Ville() {
		super();
	}

	public Ville(String nom) {
		super();
		this.nom = nom;
	}
 
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getVille_id() {
		return ville_id;
	}

	public void setVille_id(Long ville_id) {
		this.ville_id = ville_id;
	}
	
	
}
