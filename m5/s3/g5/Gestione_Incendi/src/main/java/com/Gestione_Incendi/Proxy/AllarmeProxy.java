package com.Gestione_Incendi.Proxy;

public interface AllarmeProxy {
	void sendAllarme(String idSonda, double lat, double lon, int livellodiFumo);
}
