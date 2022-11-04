package designpatterns.factory.simple;

public class PersonFactory {
    public static Person getPerson(PersonType personType) {
        return switch (personType) {
            case Rural -> new Villager();
            case Urban -> new CityPerson();
        };
    }
}
