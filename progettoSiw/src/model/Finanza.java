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
public class Finanza {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@OneToMany
	@JoinColumn(name = "finanza_responsabileUfficiale_id")
	private List<ResponsabileUfficiale> responsabileUfficiale;

	@OneToMany
	@JoinColumn(name = "finanza_id")
	private List<CentroOperativo> centroOperativo;

	@OneToMany
	@JoinColumn(name = "finanza_id")
	private List<AllievoFinanziere> allievoFinanziere;

	public Finanza(Long id, String nome) {
		this.id = id;
		this.centroOperativo = new LinkedList<>();
		this.allievoFinanziere = new LinkedList<>();
		this.responsabileUfficiale = new LinkedList<>();
		this.nome = nome;
	}
}
