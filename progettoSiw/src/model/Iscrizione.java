package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Iscrizione {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date data_iscrizione;

	@Column(nullable = false)
	private int orario_iscrizione;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name = "attivita")
	private List<Attivita> attivita;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name = "allievo")
	private Allievo allievo;

	public Iscrizione(Long id, Date data_iscrizione, int orario_iscrizione) {
		this.id = id;
		this.data_iscrizione = data_iscrizione;
		this.orario_iscrizione = orario_iscrizione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_iscrizione() {
		return data_iscrizione;
	}

	public void setData_iscrizione(Date data_iscrizione) {
		this.data_iscrizione = data_iscrizione;
	}

	public int getOrario_iscrizione() {
		return orario_iscrizione;
	}

	public void setOrario_iscrizione(int orario_iscrizione) {
		this.orario_iscrizione = orario_iscrizione;
	}


}
