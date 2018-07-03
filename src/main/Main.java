package main;

import java.util.Scanner;

public class Main {
	static String rom_strings[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	static int rom_values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	public static void main(String[] args) {
		int userinput;
		do {
			userinput = inputcounter();
		} while (userinput <= 0 || userinput > 3999);
		//rechnen(userinput) führt die Funktion rechnen aus.
		System.out.println("Die Zahl " + userinput + " sieht umgewandelt folgendermaßen aus: " + rechnen(userinput));
	}
	public static int inputcounter() {
		//Wunsch: den Input gleich als zahl zu setzen.
		//Anweisung: den Input (un)logischerweise erstmal als STRING zu setzen.
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte eine Zahl eingaben: ");
		return sc.nextInt();
	}
	//Warum Public --> Was anderes "haben wir noch nicht gelernt" ich persönlich hätte private benutzt
	//warum static? Weil es immer benötigt wird und somit direkt beim Start in den RAM geladen wird.
	public static String rechnen(int userinput) {
		//Beginne das Berechnen
		//Erstelle einen String 's', der die Zeichenfolge der Römischen Zahlen erstellt.
		String s = "";
		//Hier wird die Schleife solange wiederholt, bis der Input des Benutzers 0 ist.
		for (int i = 0; userinput != 0; i++) {11000
			//Innerhalb dieser Schleife wird geprüft, ob eine Zahl größer oder gleich einem Wert ist. Beginnend mit dem Wert im Array 0
			// (also 1000)
			//Trifft dies nicht mehr zu, sorgt die for-Schleife dafür, dass die nächste Zahl im obigen Array geprüft wird. (also die nächste. in dem Beispiel die 900)
			//Dies wiederholt sich solange, bis die Zahl, die vom Benutzer eingegeben wurde 0 beträgt. 
			while (userinput >= rom_values[i]) {
				//Hier wird die jeweilige Zahl abgezogen
				//Das userinput -= ... kann man auch so umschreiben: userinput = userinput-...
				userinput -= rom_values[i];
				//Hier wird der Römische Buchstabe in meinen obigen String hinzugefügt.
				//Das s += kann auch so umgeschrieben werden: s=s+...
				s += rom_strings[i];
			}
		}
		//Hier gebe ich den Wert zurück, der in Zeile 13 angefordert wurde.
		return s;
	}

}
