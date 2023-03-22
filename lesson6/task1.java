package java_seminar.lesson6;

public class task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 5);
        Cat cat2 = new Cat("Murzik", 5);
        //String name = cat.getName();

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
    }

}
