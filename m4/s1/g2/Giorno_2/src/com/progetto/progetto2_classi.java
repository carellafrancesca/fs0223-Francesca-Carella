package com.progetto;

public class progetto2_classi {

	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(40, 60);
		Rettangolo r2 = new Rettangolo(30, 50);
		
		stampaRettangolo(r);
		stampaRettangolo(r2);
		
		stampaSomma(r,r2);
	};
	
	public static void stampaRettangolo(Rettangolo r) {
		int perimetro = r.perimetro();
		int area = r.area();
		System.out.println(perimetro);
		System.out.println(area);
	}
	
	public static void stampaSomma(Rettangolo r, Rettangolo r2) {
		int perimetro = r.perimetro();
		int area = r.area();
		int perimetro2 = r2.perimetro();
		int area2 = r2.area();
		
		int sommaPerimetro = perimetro + perimetro2;
		int sommaArea = area + area2;
		
		System.out.println(sommaPerimetro);
		System.out.println(sommaArea);
	}
}
