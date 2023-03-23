// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля
// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их
// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

package java_seminar.homework6;

import java.util.ArrayList;

public class task {
    public static void main(String[] args) {
        Person person1 = new Person("Konstantin", "Khait", 27, "man", 1, 180, 80);
        Person person2 = new Person("Nikolay", "Dronov", 20, "man", 2, 184, 86);
        Person person3 = new Person("Julia", "Kuznecova", 30, "woman", 4, 170, 73);
        Person person4 = new Person("Ruslan", "Ivanov", 27, "man", 6, 176, 88);
        Person person5 = new Person("Roman", "Petrov", 18, "man", 7, 180, 79);
        
        Person [] arrPerson = {person1, person2, person3, person4, person5};

        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i].getAge() > 20){
                System.out.println(arrPerson[i].getFullName());
                
            }
        }
    }
}
