package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/* Scrivere un programma che simula lo scrutinio di una votazione
		 All'avvio il programma presenta un elenco di candidati tra cui scegliere
		 Successivamente chiede quale candidato è stato scelto.
		 Dopo ogni scelta chiede se si vuole inserire un'altra votazione
 	   Alla fine dell'inserimento, il programma mostra per ogni candidato quanti voti sono stati ottenuti; */
	
	Scanner sc=new Scanner(System.in);
	
	HashMap<String, Integer> pagelle=new HashMap<>();
	
	pagelle.put("Farroni", 0);
	pagelle.put("Di Gennaro", 0);
	pagelle.put("Zera", 0);
	pagelle.put("Carnevale", 0);
	pagelle.put("Spadoni", 0);
	
	System.out.println("Questi sono i condidati fra i quali scegliere: "); 
			
	for(String v:pagelle.keySet()) // Nel caso del forEach per gli HashMap si aggiunge  .keySet --> var:HashMap.keySet()
	System.out.print(v + " ");
	
	System.out.println("\nA chi vogliamo dare un voto?");
	
	String nomeScelto, risposta;
	
	do {
		
		nomeScelto=sc.nextLine();
		
			if(pagelle.containsKey(nomeScelto)) // Nel caso degli HashMap si aggiunge Key al contains --> containsKey
				pagelle.put(nomeScelto, pagelle.get(nomeScelto) + 1);
			else
				System.out.println("Nome non presente nella classe");
			
		System.out.println("Vuoi inserire un'altra votazione?");
		
		risposta=sc.nextLine();
		
			if(risposta.equals("si"))
				System.out.println("Inserisci un altro nome");
	
	} while (risposta.equals("si"));
	
	System.out.println("Risultati");
	
	for(String v:pagelle.keySet())
		System.out.print(v + " " + pagelle.get(v) + " ");
		
	//System.out.println("Ecco le pagelle degli studenti con il n° di voti hanno ricevuto:\n " 
	//+ pagelle);
	

	}

}
