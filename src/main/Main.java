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
		System.out.println("Die Zahl " + userinput + " sieht umgewandelt folgendermaßen aus: " + rechnen(userinput));
	}
	public static int inputcounter() {
		//Wunsch: den Input gleich als zahl zu setzen.
		//Anweisung: den Input (un)logischerweise erstmal als STRING zu setzen.
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte eine Zahl eingaben: ");
		return sc.nextInt();
	}
	public static String rechnen(int userinput) {
		String s = "";
		for (int i = 0; userinput != 0; i++) {
			while (userinput >= rom_values[i]) {
				userinput -= rom_values[i];
				s += rom_strings[i];
			}
		}

		return s;
	}

}
