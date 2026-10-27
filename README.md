# Gruppexamination: Klubbens medlemsregister
Vi har byggt ett medlemsregister i Java. Användaren ska kunna lägga till medlemmar, lista dem och söka på namn.

**Obs! Använd JDK 25 för att köra projektet.**

## Del 3: Gemensam README.md

### 1. Datalogiskt tänkande: Hur bröt ni ner uppgiften i delsteg och en att-göra-lista innan ni började skriva Java-koden?
Vi bröt ner uppgiften i delsteg genom att dela upp arbetet så här:

* Lena ansvarar för Main.java och menyn.
* Madina ansvarar för Medlem.java och Register.java.
* Sven ansvarar för tester och dokumentation och samlar gruppens gemensamma svar i README.

README.md blev en sorts att-göra-lista med arbetsfördelning, historik och testdata.

### 2. Klass vs Objekt: Varför är Medlem en egen klass och inte bara variabler i Main? Vad representerar ett objekt i er app?
Medlem är en klass eftersom det ska finnas flera medlemmar men med olika variabelvärden. Om Medlem var en grupp av variabler skulle man behöva skriva om samma variabelnamn. Med klass behöver man endast skapa ett nytt objektnamn och förändra värdet på variablerna inuti objektet. Exempel på objekt i programmet är "Medlem medlem" inom klassen Register och Medlem nymedlem.

### 3. Samarbete i Git: Vilken samarbetsstrategi valde ni (parprogrammering eller branches) och hur gjorde ni för att inte skriva över varandras arbete?
Vi valde att arbeta på egna branches och delade upp ansvaret för filerna. Vi skriver tydliga commit-meddelanden, pushar våra ändringar och meddelar gruppen när vi mergar till main. Vi hämtar senaste main innan vi skapar nästa branch. Vi pratar med varandra innan vi ändrar i någon annans fil för att undvika att skriva över varandras arbete.

### 4. Ett problem ni löste: Beskriv ett problem som uppstod och hur ni löste det tillsammans. Det kan vara en bugg/krock i koden eller Git, men även en utmaning kring planering och samarbete.
Vi hade ett missförstånd i chatten och mergade en fil som inte var uppdaterad med det senaste från main. GitHub kände av konflikten men vi gjorde fel val vilket ledde till att filen i main skrevs över. Det gick lätt att återställa eftersom vi jobbar med egna branches.

### 5. Reflektion kring AI och externa hjälpmedel (ca 3–5 meningar): Har ni använt AI-verktyg eller andra källor under arbetet?
Madina använde ChatGPT för att få enkla förklaringar av Java och hjälp att förstå felmeddelanden. Hon skrev och testade sin kod i IntelliJ och kontrollerade själv resultatet. Lena använde w3s java tutorial/hjälpmedel när hon glömde hur hon skulle anropa en konstruktor i main, för att sen ange det nya objektet som parameter i metoden läggtillmedlem. Sven använde cheat sheet för git och markdown-formatering. Han tog hjälp av Gemini för att kontrollera att hans testresultat stämde.

## Tidigare tester och beslut
Testad version: 42b052f (2026-10-26)

Programmet startar med Java 25 men inte i Java 21. Vi har därför angett JDK 25 som körmiljö.

Kända fel:
* Namn med mellanslag kraschar.
* Bokstäver som menyval/medlemsnummer kraschar.  

Vi tolkar instruktionen som att det inte är ett krav att lösa dessa fel för uppgiften.

## Arbetshistorik

### 23 oktober 2026
* Lena skapade vårt GitHub-repo och bjöd in Sven och Madina. Hon la även till .gitignore och Main.java.
* Sven skapade README.md med gruppens beslut om arbetsfördelning och regler.
* Madina skapade Medlem.java och Register.java.

### 26 oktober 2026
* Madinas Medlem.java och Register.java mergades till main.
* Lenas meny med sökfunktion mergades till main.
* Sven kör tester löpande och uppdaterar dokumentationen.

### 27 oktober 2026
* Vi svarade på frågorna som hörde till examinationen och sammanställde svaren i README.md.