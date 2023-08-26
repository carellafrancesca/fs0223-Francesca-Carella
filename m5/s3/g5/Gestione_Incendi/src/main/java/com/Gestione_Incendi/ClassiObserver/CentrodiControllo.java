package com.Gestione_Incendi.ClassiObserver;

import java.util.Observable;
import java.util.Observer;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class CentrodiControllo implements Observer{
	
	@Override
	public void update(Observable o, Object sonda) {
		Sonda s = (Sonda) o;
		long idSonda = s.getIdSonda();
		double latitude = s.getLatitudine();
		double longitude = s.getLongitudine();
		int livellodiFumo = s.getLivelloFumo();	
		
		String notifica = "Incendio: Sonda " + idSonda + " - Latitudine: " + latitude + " Longitudine: " + longitude + " Livello di Fumo: " + livellodiFumo;
        String urlAllarme = "http://host/alarm?sensorId="+idSonda+"&lat="+latitude+"&lon="+longitude+"&smokeLevel="+livellodiFumo+"]";
        System.out.println(notifica);

	}
}
