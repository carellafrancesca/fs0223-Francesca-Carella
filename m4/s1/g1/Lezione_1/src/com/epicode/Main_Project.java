package com.epicode;

public class Main_Project {

	public static void main(String[] args) {
		// istruzioni del mio progetto
		
		/*
		 * commenti multilinea
		 * 
		 */
		
		/**
		 * 
		 * @author Francesca Carella
		 *	 Commenti per JAVADOC 
		 * 		 
		 */
		
		boolean b = true; //true/false
		
		char c = 'c'; //per i caratteri, '' (apici singoli)
		
		int i = 25; //valore numerico non decimale
		
		double d = 25.5; //valore numerico decimale
		
		String s = "ciao";//per le stringhe "" (doppi apici)
	
		int val1 = 10;
		int val2; //dichiarato una variabile
		val2 = 10; //inizializzato una variabile
		
		final int VAL3 = 15; //va inizializzata subito
		//FINAL = CONST
		
		/*let arr = [];
		arr.push('Ciao');
		let arr = new Array();*/
		
		//in Java va definito il numero di elementi in un array e che tipo di elemento 
		int[] arrNum = new int[5];//creo un array di valori numerici di dimensione fissa con indice da 0 a n-1(in questo caso 4)
		arrNum[0] = 25;
		arrNum[1] = 10;
		
		System.out.println(arrNum[1]); //equivalente di console log
				
		String[] arrString = new String[3];
		
		char[] arrChar = {'a','b','c'};
		//creo un array e lo popolo con dei valori
		
		for (int j = 0; j < arrChar.lenght; j++) {
			System.out.println(arrChar[j]);
		}
		
		int num1 = 25;
		int num2 = num1;
		long num3 = 193;
		int num4 = (int) num3;
		double num5 = num4; //193.0
		int num6 = (int) num5; //193 = ti taglia quello che c'è dopo il punto

		int cj = 10/3; //3 = la parte dei decimali viene persa
		int resto = 10%3; //1 (tre con il resto di uno)
		
		num1 = num1 + 5;
		num1 += 5;
		//sono uguali (si può fare con tutti gli operatori)
		
		num1 = num1 % 5;
		num1 %= 5;
		
		boolean condizione1 = 5 > 0 && 5 < 10; //true
		boolean condizion2 = 5 > 10 || 5 < 10 ; //basta che una delle due condizioni sia true, tutto diventa true
		boolean condizione3 = !(5 > 10); //false
		boolean condizione4 = 5 > 0 ^ 5 < 10; // true && false => true

		int res = somma(25, 10);
		
		// Inserire un valore da tastiera
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Inserisci il tuo nome: ");
				String nome = sc.nextLine();
				System.out.print("Inserisci il tuo cognome: ");
				String cognome = sc.nextLine();
				System.out.println("Ciao " + nome + " " + cognome);
				
				// Istruzioni GIT
				// git clone https://linkrepogit
				
				// git init
				// git add .
				// git commit -m 'messaggio'
				// git branch -M main
				// git remote add origin https://linkrepogit
				// git push -u origin main
				
				// git add .
				// git commit -m 'messaggio'
				// git push
				
				// git pull
	}
		
		public static int somma(int x, int y) {
			int result = x + y;
			return result;		} //METODO IN JAVA
		
		public static void stampaSomma(int x, int y) {
			int result = x + y;
			System.out.println(result);
		}
		
		
}
