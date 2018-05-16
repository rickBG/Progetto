package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Azienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public Azienda(Long id) {
		this.id = id;
	}
}
