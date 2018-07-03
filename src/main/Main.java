package main;

import java.util.Scanner;

public class Main {
	/*Bereite die Berechnung mithilfe der Zwei Arrays vor. Damit wird danach gerechnet. Die Arrays werden absichtlich von groß nach 
	klein gestaffelt*/
	static String rom_strings[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	static int rom_values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	
	//START
	public static void main(String[] args) {
		//Initialisierte "userinput". Dort wird die Zahl gespeichert, die der Benutzer haben möchte.
		int userinput;
		/*Hier wird die Eingabe angefordert und auf Fehler geprüft. Ist der Wert kleiner als 0 und größer als 3999 fragt er erneut
		nach einer Zahl. */
		do {
			userinput = inputcounter();
		} while (userinput <= 0 || userinput > 3999);
		/*Hier wird der Output gegeben.
		Der letzte Teil (rechnen(userinput)) führt die Funktion rechnen, am Ende des Dokumentes, aus.*/
		System.out.println("Die Zahl " + userinput + " sieht umgewandelt folgendermaßen aus: " + rechnen(userinput));
	}
	/*@return Gebe die Zahl zurück, die der Benutzer in den Scanner eingegeben hat.
	@see java.util.Scanner*/
	public static int inputcounter() {
		//Hier wird der Scanner eingerichtet.
		Scanner sc = new Scanner(System.in);
		/*Hier wird die Anweisung gegeben, eine Zahl einzugeben. 
		Der Schönheit halber: kein println*/
		System.out.print("Bitte eine Zahl eingaben: ");
		/*Hier wird DIREKT ein Integer angefordert. Das Return setzt in der Main-Funktion den Integer userinput. (
		Return = gebe zurück und beende diese Funktion.
		ist die Funktion jedoch kein int/String/double/etc., sondern ein Void, wird nichts zurückgegeben, sondern nur beendet.
		ist die Funktion die Main-Funktion (public static void main) wird das Programm beendet.*/
		return sc.nextInt();
	}
	/*Warum Public --> Was anderes "haben wir noch nicht gelernt" ich persönlich hätte private benutzt
	warum static? Weil es immer benötigt wird und somit direkt beim Start in den RAM geladen wird.
	@return Gebe den String zurück, der die Römischen Zahlen beinhaltet.*/
	public static String rechnen(int userinput) {
		/*Beginne das Berechnen
		Erstelle einen String 's', der die Zeichenfolge der Römischen Zahlen erstellt.*/
		String s = "";
		//Hier wird die Schleife solange wiederholt, bis der Input des Benutzers 0 ist.
		for (int i = 0; userinput != 0; i++) {11000
			/*Innerhalb dieser Schleife wird geprüft, ob eine Zahl größer oder gleich einem Wert ist. Beginnend mit dem Wert im Array 0
			(also 1000)
			Trifft dies nicht mehr zu, sorgt die for-Schleife dafür, dass die nächste Zahl im obigen Array geprüft wird. (also die nächste. in dem Beispiel die 900)
			Dies wiederholt sich solange, bis die Zahl, die vom Benutzer eingegeben wurde 0 beträgt. */
			while (userinput >= rom_values[i]) {
				/*Hier wird die jeweilige Zahl abgezogen
				Das userinput -= ... kann man auch so umschreiben: userinput = userinput-...*/
				userinput -= rom_values[i];
				/*Hier wird der Römische Buchstabe in meinen obigen String hinzugefügt.
				Das s += kann auch so umgeschrieben werden: s=s+...*/
				s += rom_strings[i];
			}
		}
		//Hier gebe ich den Wert zurück, der in Zeile 13 angefordert wurde.
		return s;
	}

}
