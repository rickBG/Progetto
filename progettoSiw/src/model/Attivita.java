package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attivita {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date data;

	@Column(nullable = false)
	private int orario;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private CentroFormazione centroFormazione;
	
	@ManyToMany(mappedBy="attivita")
	private List<Iscrizione> iscrizioni;

	public Attivita(Long id, String nome, Date data, int orario) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.orario = orario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getOrario() {
		return orario;
	}

	public void setOrario(int orario) {
		this.orario = orario;
	}	
}
