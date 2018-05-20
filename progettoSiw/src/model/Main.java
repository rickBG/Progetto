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
}

