package agenceVoyageModel;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;


@Entity
@Table(name="passagers")
public class Passager {
	
	@Id
	@GeneratedValue
	private Long passager_id;
	@Column(name="name")
	private String nom; 
	@Column(name="firstName")
	private String prenom;
	
	@Embedded
	@Column(name="adress")
	private Adresse adr;

 	 
	@Version
	private int version;
	
	@OneToMany(mappedBy="passager")
	private List<Reservation> reservation = new ArrayList<>();
	
		

	public Passager() {
		super();
	}

	public Passager(String nom, String prenom, Adresse adr) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
	}

	public Long getPassager_id() {
		return passager_id;
	}

	public void setPassager_id(Long passager_id) {
		this.passager_id = passager_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	
	
	
	

}
