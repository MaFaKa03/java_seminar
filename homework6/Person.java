package java_seminar.homework6;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String sex;
    private int id;
    private int growth;
    private int weight;

    Person(String namePerson, 
            String surnamePerson, 
            int agePerson,
            String sexPerson,
            int idPerson,
            int growthPerson,
            int weightPerson){

                name = namePerson;
                surname = surnamePerson;
                age = agePerson;
                sex = sexPerson;
                id = idPerson;
                growth = growthPerson;
                weight = weightPerson;
            }

    public String toString(){

        return String.format("%s %s\n[%d]\n%s\n[%d]\n[%d]\n[%d] ", name, surname, age, sex, id, 
                            growth, weight);

    }
    public boolean equals(Object obj){
    
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }

        Person anothPerson = (Person) obj;
        return Objects.equals(id, anothPerson.id);

    }
    public int hashCode(){
        return Objects.hash(name, surname, age, sex, id, 
                            growth, weight);
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getFullName(){
        return name + " " + surname;
    }
}
