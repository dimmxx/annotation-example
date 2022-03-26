package com.example;

public class App {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("john");
        person.setLastName("smith");
        person.setAge("30");
        person.setAddress("NY");

        ObjectToJsonConverter converter = new ObjectToJsonConverter();

        String result = converter.convertToJson(person);

        System.out.println(result);




    }

}
