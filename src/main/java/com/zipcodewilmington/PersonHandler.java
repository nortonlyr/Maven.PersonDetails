package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
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
            counter++;
        }

        result = names.toString();
        return result;
    }


    public String forEachLoop() {
        String result = "";
        StringBuilder names = new StringBuilder();

        for (Person s : personArray) {
            names.append(s);

        }

        result = names.toString();
        return result;


    }
        public Person[] getPersonArray() {


            return personArray;
        }
    }
