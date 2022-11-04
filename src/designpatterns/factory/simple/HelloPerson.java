package designpatterns.factory.simple;

public class HelloPerson {
    public static void main(String[] args) {
        Person person =  PersonFactory.getPerson(PersonType.Rural);
        System.out.println(person.getName());
    }
}
