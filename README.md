# chess-gamename
Klassen: (richtiger Name)
Board, King, Queen, Rook, Bishop, Knight, Pawn, (Rules), Game

Klasse Board:
Klasse Board enthält die Variable state vom Typ array(2d), dass int speichert
Methode updateBoard die Trackt, wo sich wann welche Figur auf dem Feld befindet und überschreibt state.

Klasse King: 
Methode: private movementOptions (zzgl Rochade und Ausgansposition des Königs und der Türme)
2D-Array soll mögliche felder, die der König betreten kann, zurückgeben.

Klasse Pawn
Enthält Methode promote, die überprüft, ob sich Pawn auf der letzen Reihe befindet und entscheidet, ob der Pawn promoten darf oder nicht.
Methode promote öffnet Methode updateBoard und ändert die Variable state am Index (x/y) und verändert in eine Zahl (Zahl steht für Figur)
Methoe movementOptions enthält en passant regeln

Klasse Game:
Enthält Methode run, die Methode draw, Methode update und Methode load aufruft.
Methode load: Enthält, was am Anfang generiert wird (auch zeiten für Spieler)
Methode draw: Zeichnet alles (figur, brett, movementoptions)
Methode update: Player input und Spiellogik (wird 60 mal pro sekunde abgerufen)
int variable player
timer schwarz und weiß

Klasse Fenster:
Beschreibt den Aufbau des Fensters usw.
