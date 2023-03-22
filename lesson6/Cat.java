package java_seminar.lesson6;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    
    Cat(String catName, int catAge){
        name = catName;
        age = catAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return String.format("%s [%d]", name, age);
    }
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }  
        if(!(obj instanceof Cat)){
            return false;
        }
        
        Cat anotherCat = (Cat) obj;
        return Objects.equals(name, anotherCat.name) && age == anotherCat.age;
    }
}
