# GUIDA UTENTE CON ESEMPI DI TEST _(versione con estensione)_


Una volta trovati nella schermata principale del programma si potrà visualizzare il menù dove si avrà la possibilità di selezionare diverse scelte: <p>
- _Nuova scoperta_
- _Ricerca in archivio_
- _Crediti_
- _Segnala un problema_
- _GitHub_

![SQLCODE](menu.png)<p><br>

- _Nuova scoperta_: permette di effettuare una nuova ricerca in modo tale da trovare Pattern Frequenti e Pattern Emergenti sfruttando una tabella Target e una tabella Background.

- _Ricerca in archivio_: permette di effettuare una ricerca consultando file presenti su disco, in cui sono memorizzate le ricerche precedenti.

- _Crediti_: permette di visualizzare i crediti, mostrando gli autori del progetto e i vari dettagli.

- _Segnala un problema_: permette di visualizzare i contatti in modo tale da poter segnalare eventuali problemi.

- _GitHub_: permette di aprire il Browser e caricare la pagina della repository del progetto presente su GitHub.<p><br>


# _NUOVA SCOPERTA_

Per effettuare una nuova scoperta basterà cliccare sul bottone _"NUOVA SCOPERTA"_:<p>
![SQLCODE](selezionenuovascoperta.png)<p><br>

Nella finestra successiva si ha la possibilità di inserire i vari input o di tornare indietro nel menù.<p>
![SQLCODE](inserimentocampi.png)<p>
Una volta inseriti i dati premendo _"CONFERMA"_ si ha la possibilità di visualizzare i risultati. Nel caso in cui i dati inseriti non dovessero rispettare i vincoli indicati o dovessero esserci campi vuoti, questi dati non verrebbero accettati. Quindi sarebbe necessario aggiustarli per proseguire.<p><br>

# _NUOVA SCOPERTA - CASI POSSIBILI_

## Caso 1) Nuova ricerca, Tabella Target e Background esistenti, pattern frequenti ed emergenti ritrovati:

 <br>

- Dopo aver selezionato _"NUOVA SCOPERTA"_ dal menù:<p>
![SQLCODE](selezionenuovascoperta.png)<p><br>


- Inseriti i dati all'interno dei rispettivi campi:<p>
![SQLCODE](daticaso1.png)<p><br>


- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati: <p>
![SQLCODE](risultatocaso1.png)<p><br>


## Caso 2) Nuova ricerca, Tabella Target e Background non esistenti, pattern frequenti ed emergenti non ritrovati:
<br>

- Dopo aver selezionato _"NUOVA SCOPERTA"_ dal menù:<p>
![SQLCODE](selezionenuovascoperta.png)<p><br>

- Inseriti i dati all'interno dei rispettivi campi (indicando nel campo tabella Target e Background, due tabelle non esistenti):<p>
![SQLCODE](risultatocaso2.png)<p><br>

- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati (che in questo caso ci mostreranno due messaggi di errore, in quanto tabelle non esistenti e quindi _frequent pattern_ e _emerging pattern_ non ritrovati): <p>
![SQLCODE](errore1.png)<p><br>


## Caso 3) Nuova ricerca, tabella Target e Background esistenti e invertite, pattern frequenti ed emergenti ritrovati
<br>

- Dopo aver selezionato _"NUOVA SCOPERTA"_ dal menù:<p>
![SQLCODE](selezionenuovascoperta.png)<p><br>


- Inseriti i dati all'interno dei rispettivi campi (invertendo tabella target e tabella background):<p>
![SQLCODE](inversione.png)<p><br>


- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati: <p>
![SQLCODE](risultatoinversione.png)<p><br>


# _RICERCA IN ARCHIVIO_

Per effettuare una ricerca nell' archivio così da consultare file presenti su disco, sfruttando ricerche effettuate precedentemente, cliccare sul bottone _"RICERCA IN ARCHIVIO"_.

![SQLCODE](selezionericercaarchivio.png)<p><br>

Nella finestra successiva si ha la possibilità di inserire i vari input o di tornare indietro nel menù.<p>

![SQLCODE](inserimentocampi.png)<p>
Una volta inseriti i dati premendo _"CONFERMA"_ si ha la possibilità di visualizzare i risultati. Nel caso in cui i dati inseriti non dovessero rispettare i vincoli indicati o dovessero esserci campi vuoti, questi dati non verrebbero accettati. Quindi sarebbe necessario aggiustarli per proseguire.<p><br>


# _NUOVA SCOPERTA - CASI POSSIBILI_





## Caso 1) Ricerca in archivio, Tabella Target e Background esistenti, pattern frequenti ed emergenti ritrovati:
<br>

- Dopo aver selezionato _RICERCA IN ARCHIVIO_ dal menù:<p>
![SQLCODE](selezionericercaarchivio.png)<p><br>

- Inseriti i dati all'interno dei rispettivi campi:<p>
![SQLCODE](daticaso1.png)<p><br>


- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati: <p>
![SQLCODE](risultatocaso1.png)<p><br>

## Caso 2) Ricerca in archivio, Tabella Target non esistente e tabella Background non esistente, pattern frequenti ed emergenti non ritrovati:
<br>

- Dopo aver selezionato _RICERCA IN ARCHIVIO_ dal menù:<p>
![SQLCODE](selezionericercaarchivio.png)<p><br>

- Inseriti i dati all'interno dei rispettivi campi (indicando nel campo tabella Target e Background, due tabelle non esistenti):<p>
![SQLCODE](risultatocaso2.png)<p><br>

- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati (che in questo caso saranno due messaggi di errore in quanto non sono stati trovati i file) <p>
![SQLCODE](errore1.png)<p><br>

## Caso 3) Ricerca in archivio, tabella Target e Background esistenti, pattern frequenti ritrovati e pattern emergenti non ritrovati
<br>

- Dopo aver selezionato _RICERCA IN ARCHIVIO_ dal menù:<p>
![SQLCODE](selezionericercaarchivio.png)<p><br>

- Inseriti i dati all'interno dei rispettivi campi (indicando nel campo del grow rate un valore che non sia mai stato cercato):<p>
![SQLCODE](casogrowratetroppo.png)<p><br>

- Dopo aver cliccato su _"CONFERMA"_ si ottiene la stampa dei risultati (in questo caso avremo la stampa dei frequent pattern e il messaggio di errore per gli emerging pattern in quanto non trovati) <p>
![SQLCODE](frequenttrovatinoemerging.png)<p><br>


# _CREDITI_ 

Per visualizzare i crediti, e quindi per visualizzare chi ha contribuito al progetto e i dettagli di esso, basterà cliccare dal menù sulla voce _"CREDITI"_<p>
![SQLCODE](crediti.png)<p><br>

Dopo aver cliccato, si otterrà la pagina relativa ai crediti:<p>
![SQLCODE](risultatocrediti.png)<p><br>


# _SEGNALA UN PROBLEMA_

Per visualizzare i contatti di coloro che hanno realizzato il progetto così da poter inviare una segnalazione basterà cliccare dal menù sulla voce _"SEGNALA UN PROBLEMA"_:<p>
![SQLCODE](segnalaproblema.png)<p><br>

Dopo aver cliccato, si otterrà la pagina per segnalare un problema:<p>
![SQLCODE](risultatosegnalazione.png)<p><br>


# _GITHUB_

Per aprire il browser e visualizzare la pagina di GitHub dove è presente la repository del progetto basterà semplicemente sulla voce _"GitHub"_ in basso a destra.<p>
![SQLCODE](github.png)<p>

Dopodichè si aprirà il browser con la relativa pagina.<br>

---

# <br>_INFORMAZIONI UTILI_

Per uscire dall'applicazione basterà premere sulla _X_ in alto a destra.<p><br>

Questa è una guida realizzata per il progetto _"EP MINER"_ (versione con estensione).
L' obiettivo di questa guida è quella di fornire delle istruzioni chiare e precise per far si che l'utente possa utilizzare il sistema correttamente.<p><br>

Realizzato da: Raffaele Di Anna, Alessandro Carella, Alessandro Congedo.

---

Progetto: _EP MINER_ 2020-2021 Corso: Metodi Avanzati Di Programmazione




