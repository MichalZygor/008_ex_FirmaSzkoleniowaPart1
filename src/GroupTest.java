public class GroupTest {
    public static void main(String[] args) {
        Personnel teacher = new Personnel("Achim", "Górecki", 8);
        Student[] students = StudentCreator.createFromInput();
        Group group = new Group("Grupa średniozawansowana z fizyki", teacher, students);
        group.showInfo();
    }
}
