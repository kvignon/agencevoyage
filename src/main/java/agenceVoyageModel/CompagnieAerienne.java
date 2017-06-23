package agenceVoyageModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airline_company")
public class CompagnieAerienne {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String nom) {
		super();
		this.nom = nom;
	}
	
	
	
}
