package agenceVoyageModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline_company_fly")
public class CompagnieAerienneVol {
	@Id
	@GeneratedValue
	private Long id;
	
	private String numero;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public CompagnieAerienneVol() {
		super();
	}

	public CompagnieAerienneVol(String numero) {
		super();
		this.numero = numero;
	}
	
	
}
