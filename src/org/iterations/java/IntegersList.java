package org.iterations.java;

public class IntegersList {
	
	//Campo privato che memorizza l'array di numeri interi
	private int[] numbers;
	//Campo privato che memorizza l'indice corrente per l'iterazione sull'array
	private int  index;
	
	//Costruttore che accetta un array di interi come parametro e lo assegna al campo NUMBERS
	public IntegersList(int[] numbers) {
		this.numbers = numbers;
	}
	
	//Costruttore senza parametri che inizializza NUMBERS come array vuoto
	public IntegersList() {
		this.numbers = new int[0];
	}
	
	//Metodo che restituisce l'elemento successico dell'array
	public int getElementoSuccessivo() {
		int value = 0;
		if (this.index < numbers.length) {
			value = numbers[index];
			this.index++;
		}
		return value;
	}
	
	//Metodo che verifica se ci sono ancora elementi da iterare nell'array, restituendo true o false
	public boolean hasAncoraElementi() {
		return (this.index < numbers.length);
	}
	
	//Metodo che aggiunge un nuovo elemento all'array NUMBERS
	public void addElemento(int newNumber) {
		int[] newNumbers = new int[this.numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		newNumbers[numbers.length] = newNumber;
		this.numbers = newNumbers;
	}
	
	//Metodo Getter che restituisce l'array NUMBERS
	public int[] getNumbers() {
		return this.numbers;
	}
	
	//Metodo Getter che restituisce INDEX
	public int getIndex() {
		return this.index;
	}
}
