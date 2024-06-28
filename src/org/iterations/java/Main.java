package org.iterations.java;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Istanza di IntegersList inizializzata con un array di interi
		IntegersList listaInteri = new IntegersList(new int[] {22,56,35,98,5});
		
		//Estrazione degli elementi
		System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        //Verifica della presenza di elementi
        System.out.println(listaInteri.hasAncoraElementi());
        
        //Estrazione degli altri elementi
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        //Verifica e tentativo di estrazione con valore 0
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        //istanza del secondo oggetto partendo da un array vuoto
        IntegersList secondaLista = new IntegersList();
        
        //Verifica della lista vuota
        System.out.println(secondaLista.hasAncoraElementi());
	}
}
