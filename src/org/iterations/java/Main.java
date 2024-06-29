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
        
        //Aggiungo elementi nell'Array
        secondaLista.addElemento(101);
        secondaLista.addElemento(110);
        secondaLista.addElemento(89);
        secondaLista.addElemento(219);
        
        //Stampo la seconda lista
        System.out.println(Arrays.toString(secondaLista.getNumbers()));
        
        //Estrazione degli elementi della seconda lista
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        
        //Stampiamo index
        System.out.println("Index: " + secondaLista.getIndex());
        
        //Arrivati qui hasAncoraElementi stamperà false (Non ci sono elementi da mostare)
        System.out.println(secondaLista.hasAncoraElementi());
        
	}
}
