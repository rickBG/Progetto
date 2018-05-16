package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Azienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Responsabile responsabile;

	@OneToMany(mappedBy = "azienda")
	private List<CentroFormazione> centroFormazione;

	public Azienda(Long id) {
		this.id = id;
	}
}
