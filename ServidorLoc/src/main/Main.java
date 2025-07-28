package main;
import servico.AnunciosLocService;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.Endpoint;
import modelos.Utilizador;
import persistencia.BancoDados;
public class Main {

	public static void main(String[] args) {
		Logger.getLogger("com.sun.xml.internal.ws").setLevel(Level.SEVERE);
		String url = "http://localhost:8080/AnunciosLocService";
        Endpoint.publish(url, new AnunciosLocService());
        System.out.println(" Servidor AnunciosLoc SOAP iniciado em: " + url);
        for (Utilizador u : BancoDados.utilizadores) {
    	    System.out.println("Utilizador: " + u.getEmail() + " | Senha: " + u.getSenha() + " | Tipo: " + u.getTipo());
    	}
	}
	

}
