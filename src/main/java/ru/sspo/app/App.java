package ru.sspo.app;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Thom", "Yorke", 55);
        System.out.println("new Person: " + person);

        Gson gson = new Gson();
        String serializedPerson = gson.toJson(person);
        System.out.println("gson.toJson(person): " + serializedPerson);

        Person deserializedPerson = gson.fromJson(serializedPerson, Person.class);
        System.out.println("gson.fromJson(serializedPerson, Person.class): " + deserializedPerson);

    }
}
