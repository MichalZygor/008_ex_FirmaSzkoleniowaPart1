public class Student extends Person {
    private int points;

    public Student(String firstName, String lastName, int points) {
        super(firstName, lastName);
        this.points = points;
    }

    public String showInfo() {
        return super.showInfo() + ", liczba punktów: " + points;
    }
}
