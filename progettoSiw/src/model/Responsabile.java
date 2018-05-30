package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Responsabile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String ruolo;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Azienda azienda;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "responsabile")
	private CentroFormazione centroFormazione;


	public Responsabile(Long id, String nome, String ruolo) {
		this.id = id;
		this.nome = nome;
		this.ruolo = ruolo;
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

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}	
}
