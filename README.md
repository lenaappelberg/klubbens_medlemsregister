## Klubbens medlemsregister
Vi bygger ett medlemsregister i Java. Användaren ska kunna lägga till medlemmar, lista dem och söka på namn.

**Använd JDK 25 för att köra projektet.**

### Planering och arbetsfördelning
Vi delade upp arbetet så här:

* Lena ansvarar för Main.java och menyn.
* Madina ansvarar för Medlem.java och Register.java.
* Sven ansvarar för tester och dokumentation och samlar gruppens gemensamma svar i README.

### Samarbete i Git
* Vi jobbar på egna brancher och skriver tydliga commit-meddelanden.
* Vi pushar våra ändringar och meddelar gruppen när vi mergar till main.
* Vi hämtar senaste main innan vi skapar nästa branch.
* Vi pratar med varandra innan vi ändrar i någon annans fil.

### Arbetshistorik

#### 23 oktober 2026
* Lena skapade vårt GitHub-repo och bjöd in Sven och Madina. Hon la även till .gitignore och Main.java.
* Sven skapade README.md med gruppens beslut om arbetsfördelning och regler.
* Madina skapade Medlem.java och Register.java.

#### 26 oktober 2026
* Madinas Medlem.java och Register.java mergades till main.
* Lenas meny med sökfunktion mergades till main.
* Sven kör tester löpande och uppdaterar dokumentationen.

### Nuläge och eventuella kvarvarande åtgärder
Testad version: 42b052f (2026-10-26)

* Programmet startar med Java 25 men inte i Java 21.  
Åtgärd: Lagt till "använd JDK 25 för att köra projektet" i README.md.

* Namn med mellanslag kraschar.
* Bokstäver som menyval/medlemsnummer kraschar.  
Beslut: Vi tolkar instruktionen som att det inte är ett krav för uppgiften.

* README behöver kompletteras med: 
    * hur vi planerade delstegen före kodningen
    * förklaring av klass och objekt
  
    * Ett problem vi löste tillsammans: Jag fick tidigare fel i koden
 eftersom en klammerparentes låg på fel plats. Jag rattade felet och kunde sedan fortsätta. 
  Jag testade också funktionerna i konsolen för att kontrollera att de fungerade.
  
    * vår reflektion om AI och externa hjälpmedel: Jag använde ChatGPT för att få enkla förklaringar
  av Java. Jag fick även hjälp att förstå felmeddelanden. Jag skrev och testade min kod i 
  IntelliJ och kontrollerade resultatet sjalv. 
    
