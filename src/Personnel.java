public class Personnel extends Person {
    private int experience;

    public Personnel(String firstName, String lastName, int experience) {
        super(firstName, lastName);
        this.experience = experience;
    }

    public String showInfo() {
        return super.showInfo() + ", doświadczenie: " + experience;
    }
}
