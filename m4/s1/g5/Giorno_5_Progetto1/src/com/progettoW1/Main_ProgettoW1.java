package com.progettoW1;

import java.util.Scanner;

import com.progettoW1.classi.Audio;
import com.progettoW1.classi.Immagine;
import com.progettoW1.classi.Video;

public class Main_ProgettoW1 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//AUDIO
		System.out.println("Titolo della canzone da inserire : ");
		String songTitle = scanner.nextLine();
		
		System.out.println("Durata della canzone : ");
		int duration = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Volume della canzone : ");
		int volume = scanner.nextInt();
		scanner.nextLine();
		
		Audio a = new Audio(songTitle, duration, volume); //Titolo, Durata, Volume
		a.AlzaVolume();
		System.out.println("Canzone con volume aumentato:" + " " + a.titolo + " " + a.volume);
		a.AbbassaVolume();
		System.out.println("Canzone con volume abbassato:" + " " + a.titolo + " " + a.volume);
		a.play();
		
		
		//VIDEO
		System.out.println("Titolo del video da inserire : ");
		String videoTitle = scanner.nextLine();
		
		System.out.println("Durata del video : ");
		int durationVideo = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Volume del video : ");
		int volumeVideo = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Luminosità del video : ");
		int luceVideo = scanner.nextInt();
		scanner.nextLine();
		
		Video v = new Video(videoTitle, durationVideo, volumeVideo, luceVideo); //Titolo, Durata, Volume
		v.AlzaVolume();
		System.out.println("Video con volume aumentato:" + " " + v.titolo + " " + v.volume);
		v.AbbassaVolume();
		System.out.println("Video con volume abbassato:" + " " + v.titolo + " " + v.volume);
		v.play();
		
		v.AumentaLuminosità();
		System.out.println("Video con luminosità aumentata:" + " " + v.titolo + " " + v.luminosità);
		v.DiminuisciLuminostià();
		System.out.println("Video con luminosità abbassata:" + " " + v.titolo + " " + v.luminosità);
		v.show();
		
		
		//IMMAGINI		
		System.out.println("Titolo dell'immagine da inserire : ");
		String immagineTitle = scanner.nextLine();
		
		System.out.println("Livello luminosità : ");
		int luminosità = scanner.nextInt();
		scanner.nextLine();
		
		Immagine i = new Immagine(immagineTitle, luminosità); //Titolo, Luminosità
		i.AumentaLuminosità();
		System.out.println("Immagine con luminosità aumentata:" + " " + i.titolo + " " + i.luminosità);
		i.DiminuisciLuminostià();
		System.out.println("Immagine con luminosità abbassata:" + " " + i.titolo + " " + i.luminosità);
		i.show();
	
		
		//ARRAY
        int[] array = new int[5];
        
        for (int ar = 0; ar < 5; ar++) {
            System.out.print("Inserisci il valore per l'elemento " + (ar + 1) + ": ");
            array[ar] = scanner.nextInt();
        }
        
        int elemento = -1;
        
        while (elemento != 0) {
            System.out.print("Inserisci l'oggetto da eseguire : ");
            elemento = scanner.nextInt();

            if (elemento >= 1 && elemento <= 5) {
                System.out.println("Hai selezionato l'oggetto " + elemento);
            } else if (elemento != 0) {
                System.out.println("Non valido. Inserisci nuovamente l'oggetto");
            }
        }
        
        System.out.println("Fine.");
	}
	
}
