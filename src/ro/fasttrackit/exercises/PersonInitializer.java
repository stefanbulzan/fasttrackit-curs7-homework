package ro.fasttrackit.exercises;

public class PersonInitializer {

    public static void main(String[] args) {
        Person person1 = new Person("Mark", 26, true);
        Person person2 = new Person("Laura", 26, true);
        Person person3 = new Person("Ioan", 50, false);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.isMarried());
    }
}
