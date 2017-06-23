package agenceVoyageModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="login")
public class Login {
	
	@Version
	private int version;

	@Id
	@GeneratedValue
	private Long login_id;
	
	@Column(name="login")
	private String login;
	@Column(name="password")
	private String motDePasse;
	@Column(name="admin")
	private boolean admin;	
	
	public Login() {
		super();
	}

	public Login(String login, String motDePasse, boolean admin) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}


	public Long getLogin_id() {
		return login_id;
	}


	public void setLogin_id(Long login_id) {
		this.login_id = login_id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
	
	
}
