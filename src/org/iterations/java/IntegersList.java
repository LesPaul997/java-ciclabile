package org.iterations.java;

public class IntegersList {
	
	private int[] numbers;
	private int  index;
	
	public IntegersList(int[] numbers) {
		this.numbers = numbers;
	}
	
	public IntegersList() {
		this.numbers = new int[0];
	}
	
	public int getElementoSuccessivo() {
		int value = 0;
		if (this.index < numbers.length) {
			value = numbers[index];
			this.index++;
		}
		return value;
	}
	
	public boolean hasAncoraElementi() {
		return (this.index < numbers.length);
	}
	
	public void addElemento(int newNumber) {
		int[] newNumbers = new int[this.numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		newNumbers[numbers.length] = newNumber;
		this.numbers = newNumbers;
	}
	
	public int[] getNumbers() {
		return this.numbers;
	}
	
	public int getIndex() {
		return this.index;
	}
}
