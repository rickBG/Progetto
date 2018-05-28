# Progetto
Progetto di esame giugno 2018:   [Testa Damiano,Riccardo Bianchini]

Il progetto blabla...

Le specifiche seguite per lo sviluppo del SIW sono in linea con quelle per il progetto AVANZATO per l'appello di Giugno 2018;
Le tecnologie implementate sono:
  - Spring MVC
  - Spring boot 
  - Spring Security
  - JPA(Hibernate)

Informazioni e regole di dominio:
  bla bla bla
  

Casi d'uso:

  UC1: Registrazione allievo
  Attore Primario: responsabile
    
    Scenario principale di successo:
    1. Il responsabile accede alla pagina registrazione;
    2. inserisce i dati dell'allievo;
      2.1 Se i dati dell'allievo sono già presenti nel sistema, il sistema mostra i dati;
    3. Se i dati dell'allievo non sono presenti nel sistema, il responsabile compila i campi relativi alla registrazione ed il sistema
      registra l'allievo nel centro.
    
    
  UC2: Registrazione allievo attività
  Attore Primario: responsabile
    
    Scenario principale di successo:
    1. Il responsabile accede alla pagina "Visualizza tutte le attività";
      1.1 Il sistema mostra l'elenco delle attività disponibili (con data di svolgimento posteriore a quella odierna), affianco a         ciascuna delle quali è presente un bottone per prenotarsi;
      1.2 Il sistema mostra inoltre anche l'elenco delle attività passate (con data di svolgimento anteriore a quella odierna);
    2.  L'allievo decide l'attività da seguire;
      2.1 Il responsabile preme il bottone "iscriviti" relativo all'attività scelta dall'allievo;
    3. Il responsabile compila i campi obbligatori affinchè avvenga la registrazione;
    4. Il sistema registra l'allievo e collega l'allievo all'attività;
    5. L'allievo comprarià nella lista degli iscritti all'attività richiesta.
    
   UC3: Consultazione Attività
   Attore Primario: qualsiasi visitatore del sito
   
    Scenario principale di successo:
    1. Il visitatore accede alla pagina "Visualizza tutte le attività" e clicca sul bottone "attività concluse";
    2. Il visitatore inserisce la data dell'attività;
    3. Il sistema restituisce tutte le attività ordinate per orario.
   
   UC4: Aggiungi nuova attività
   Attore Primario: responsabile
   
     Scenario principale di successo:
     1. Il responsabile accede alla pagina "Inserisci attività";
     2. Il responsabile compila i campi relativi all'inserimento di una nuova attività;
     3. Il sistema verifica la correttezza dei dati ed aggiunge l'attività.
     
   UC5: Consultazione Allievo
   Attore Primario: responsabile azienda
   
     Scenario principale successo:
     1. Il responsabile azienda accede alla pagina "Visualizza allievi";
     2. Il sistema mostra l'elenco degli allievi registrati, affianco a ciascuno dei quali è presente un link "Visualizza scheda";
       2.1 Il responsabile azienda clicca su "Visualizza scheda";
       2.2 Il sistema mostra tutti i dati relativi all'alievo selezionato;
     3. Il responsabile azienda può ordinare l'elenco cliccando su ordina per(menu a tendina) scegliendo una tra le opzioni proposte
     (data iscrizione, nome, cognome, data di nascita);
     4. Il sistema mostra l'elenco ordinato secondo la richiesta.
     
   UC6: Consultazione Centro
   Attore Primario: responsabile azienda
   
     Scenario principale successo:
     1. Il responsabile azienda accede alla pagina "Visualizza centri";
     2. Il sistema mostra l'elenco dei centri, affianco a ciascuno dei quali è presente un link "Scheda tecnica";
       2.1 Il responsabile azienda sceglie un centro da consultare e clicca sul link;
       2.2 Il sistema mostra tutte le attività relative al centro. 
     3. Il responsabile azienda può ordinare l'elenco cliccando su ordina per(menu a tendina) scegliendo una tra le opzioni proposte
     (data iscrizione, nome, cognome, data di nascita);
     4. Il sistema mostra l'elenco ordinato secondo la richiesta.
