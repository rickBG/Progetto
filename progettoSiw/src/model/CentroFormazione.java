package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CentroFormazione {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(unique = true, nullable = false)
	private String indirizzo;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(unique = true,nullable = false)
	private int telefono;

	@Column(nullable = false)
	private int capMaxAllievi;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Responsabile responsabile;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Azienda azienda;

	@OneToMany(mappedBy = "centroFormazione")
	private List<Attivita> attivita;

	public CentroFormazione(Long id, String nome, String indirizzo, String email, int telefono, int capMaxAllievi) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.capMaxAllievi = capMaxAllievi;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCapMaxAllievi() {
		return capMaxAllievi;
	}

	public void setCapMaxAllievi(int capMaxAllievi) {
		this.capMaxAllievi = capMaxAllievi;
	}
}
