package agenceVoyageModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="reservations")
public class Reservation {

	@Id
	@GeneratedValue
	private Long reservation_id;
	
	@Column(name="date")
	private Date date;
	@Column(name="number")
	private int numero;
	
	@Version
	private int version;
	 
	@ManyToOne
	@JoinColumn(name="passager_id")
	private Passager passager;
	 
	public Reservation() {
		super();
	}
	
	public Reservation(Date date, int numero) {
		super();
		this.date = date;
		this.numero = numero;
	}



	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	
	
	
	
}