package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Azienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@OneToMany
	@JoinColumn(name = "responsabile_id")
	private List<Responsabile> responsabile;

	@OneToMany
	@JoinColumn(name = "centro_id")
	private List<CentroFormazione> centroFormazione;

	@OneToMany
	@JoinColumn(name = "allievo_id")
	private List<Allievo> allievo;

	public Azienda(Long id, String nome) {
		this.id = id;
		this.centroFormazione = new LinkedList<>();
		this.allievo = new LinkedList<>();
		this.nome = nome;
	}
}
