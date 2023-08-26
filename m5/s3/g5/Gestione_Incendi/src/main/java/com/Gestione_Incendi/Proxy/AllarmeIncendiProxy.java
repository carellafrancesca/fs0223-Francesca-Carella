package com.Gestione_Incendi.Proxy;

public class AllarmeIncendiProxy implements AllarmeProxy{
	
	 private String urlAllarmeIncendi;

	 public void AllarmeProxy(String urlAllarmeIncendi) {
	      this.urlAllarmeIncendi = urlAllarmeIncendi;
	 }

	@Override
	public void sendAllarme(String idSonda, double lat, double lon, int livellodiFumo) {
		String url_Allarme = urlAllarmeIncendi + "/alarm?idsonda=" + idSonda +
                "&lat=" + lat + "&lon=" + lon + "&smokelevel=" + livellodiFumo;
	}
}
