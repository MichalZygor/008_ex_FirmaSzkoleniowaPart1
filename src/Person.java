public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String showInfo() {
        return "Imie: " + firstName + ", nazwisko: " + lastName;
    }
}
