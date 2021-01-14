package com.zipcodewilmington;

/**
 * Edited by Norton on 1/14/21.
 */
public class PersonHandler {

	private final Person[] personArray;

	public PersonHandler(Person[] personArray) {
		this.personArray = personArray;
	}

	public String whileLoop() {

		String result = "";
		int count = 0;

		while (count < personArray.length) {
			result += personArray[count];
			count++;
		}
		return result;
	}

	public String forLoop() {
		String result = "";

		StringBuilder names = new StringBuilder();
		int counter = 0;

		for (int i = 0; i < personArray.length; i++) {
			names.append(personArray[counter]);
			result += personArray[i];
		}

		return result;
	}

	public String forEachLoop() {
		String result = "";
		for (Person p : personArray) {
			result += p.toString();
		}
		return result;
	}

	public Person[] getPersonArray() {

		return personArray;
	}
}
