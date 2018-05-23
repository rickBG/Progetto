package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("football-unit");
	EntityManager em = emf.createEntityManager();
	if(em!=null) em.close();
	if(emf!=null) emf.close();
	
//	//1)gestioneAllievo		1.allievo va in un centro
//	2.responsabile chiede dati necessari per l'iscrizione
//	3.responsabile inserisce i dati nel sistema e registra l'allievo
//	4.responsabile pu� modificare dati dell'allievo
//	5.responabile pu� cancellare dati dell'allievo
//
//2)gestioneIscrizioneAllievo   1.responsabile controlla se il centro ha ha gi� la massima capacit�,se si il sistema manda messaggio di errore
//	  2.responsabile accede al sistema e controlla se l'allievo � gi� registrato
//	 3.se si,responsabile recupera dati allievo
//	 4.responsabile informa l'allievo delle attivit� a cui pu� iscriversi e delle info relative ad ogni attivita
//	5.l'allievo sceglie l'attivit� a cui � interessato
//	6.l'allievo conferma l'iscrizione all'attivit�
//	7.il responsabile usa il sistema per iscrivere l'allievo all'attivit�
//
//
//
//
//3)gestionePagamentoAttivita	1 inserisce dati allievo per controllare pagamenti
//		2 contatta allievo e chiede di pagare attivit� non pagate
//		3 l'allievo paga ci� che � richiesto
//		4 il respgenerale usa il sistema per saldare il debito
//
//4)gestioneAttivitaDeiCentri  1.responsabile generale accede al sistema e visualizza i vari centri 
//		2.per ogni centro,usa il sistema per accedere alla sua lista di attivit�
//		3.modifica attivit� esistenti
//		4.
//
//5-gestioneRendimentoOgniCentro
    }
	
	
	
//	@NamedQuery(name="findAllCustomers", query = "SELECT c FROM Customer")
//	@Entity
//	public class Customer {
//
//		@Id
//		@GeneratedValue(strategy= GenerationType.AUTO)
//		private Long id;
//		
//		@Column(nullable=false)
//		private String name;
//		
//		@Column(nullable=false)
//		private String surname;
//		
//		public Customer() {
//			
//		}
//
//		public Customer(Long id, String firstName, String lastName) {
//			this.id = id;
//			this.name = firstName;
//			this.surname = lastName;
//		}
//		
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//		public String getFirstName() {
//			return name;
//		}
//
//		public void setFirstName(String firstName) {
//			this.name = firstName;
//		}
//
//		public String getLastName() {
//			return surname;
//		}
//
//		public void setLastName(String lastName) {
//			this.surname = lastName;
//		}
	
	
	
	
	
	
	
	
	
	
	
//	public interface CustomerRepository {
//		
//		public void save(Customer customer);
//		public Customer findByPrimary(Long id);
//		public List<Customer> findAll();
//		public void update(Customer customer);
//		public void delete(Customer customer);
//	}
	
	
	
	
	
	
	
//	public class CustomerJpaRepository implements CustomerRepository {
//		
//		private EntityManager em;
//		
//		public CustomerJpaRepository(EntityManager em) {
//			this.em = em;
//		}
//		
//		@Override
//		public void save(Customer customer) {
//			// TODO Auto-generated method stub
//			em.persist(customer);
//		}
//
//		@Override
//		public Customer findByPrimary(Long id) {
//			// TODO Auto-generated method stub
//			return em.find(Customer.class , id);
//		}
//
//		@Override
//		public List<Customer> findAll() {
//			// TODO Auto-generated method stub
//			return em.createNamedQuery("findAllCustomers", Customer.class).getResultList();
//		}
//
//		@Override
//		public void update(Customer customer) {
//			// TODO Auto-generated method stub
//			em.merge(customer);
//		}
//
//		@Override
//		public void delete(Customer customer) {
//			// TODO Auto-generated method stub
//			em.remove(customer);		
//		}
}

