## Todo Kanban Board / Friday exercise

Do the following steps to setup the project:

Mac:
1. Create a spring initializer backend module (name="backend", with "Spring Web" enabled)
2. Install Node.js (https://nodejs.org/en/download/) or via brew in your terminal ( `brew install node` )
3. run the `build-frontend-mac.sh` script
4. start the server and open your browser on http://localhost:8080 to see the frontend
5. Happy hacking 👩‍💻 👨‍💻

(Win:
1. Create a spring initializer backend module (name="backend", with "Spring Web" enabled)
2. Install Node.js (https://nodejs.org/en/download/)
3. run the `build-frontend-win.ps1` script
4. If you run into Problems running the script, try running `Set-ExecutionPolicy -ExecutionPolicy Unrestricted` as admin.
5. start the server and open your browser on http://localhost:8080 to see the frontend
6. Happy hacking 👩‍💻 👨‍💻)

## Aufgabenstellung - Backend entwickeln:
Implementiert die HTTP-Endpunkte, die Euer Frontend benötigt.
Geht dabei Schritt für Schritt die Endpunkte durch und schreibt auch Tests für eure Methoden.


# Bonusaufgaben

### Bonus 1 - ChatGPT-API:
Lasst ChatGPT bei jedem neuen ToDo-Item eine Rechtschreib- und Grammatikkorrektur der Ticket-Texte durchführen.
Schreibt auch dafür Integrationstests (die ChatGPT mit MockWebServer mocken!).


### Bonus 2 - Monitoring:
Fügt eine aktuelle Dependency zu JavaMelody zu Eurem Backend hinzu. Eurer Backend sollte nun unter /monitoring ein Dashboard anzeigen, das Euch über die Performance Eures Backends informiert.

Klickt einige Male im Frontend herum und schaut Euch die Messwerte Eures Backends an.

Könnt Ihr Euch eine Situation vorstellen, in der das Monitoring Eures Backends hilfreich sein könnte?


### Bonus 3 -  ChatGPT-Initialisierung:
Schreibt einen neuen Endpunkt "POST /initialize/{Themengebiet}" um ca 20-30 neue Todo-Items von der ChatGPT-API generieren zu lassen.

Schreibt auch hier Integrationstests (die ChatGPT mit MockWebServer mocken!).


### Bonus 4 - Undo-Endpunkt:
Implementiert einen HTTP-Endpunkt im Backend unter /undo, der die letzte Änderung rückgängig macht.

Eine Anpassung im Frontend ist nicht notwendig. Ruft den Endpunkt einfach via Postman auf und schaut, ob die letzte Änderung rückgängig gemacht wurde.

Schreibt gute Integrationstests für diesen Endpunkt.

Es soll auch möglich sein den Endpunkt mehrfach aufzurufen, um mehrere Änderungen rückgängig zu machen.


### Bonus 5 - Redo-Endpunkt:
Schreibt nun auch einen /redo-Endpunkt um ein vorheriges Undo wieder rückgängig zu machen.
