package mysql.person;

public class Main {

    public static void main(String[] args) {
	Person person = new Person.Builder()
            .withID(123)
            .withName("Artur")
            .withSurname("King")
            .withAge(66)
            .build();
        System.out.println("person" + person);
    }
}
