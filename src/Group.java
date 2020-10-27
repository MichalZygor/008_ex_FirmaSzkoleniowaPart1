public class Group {
    private String name;
    private Personnel teacher;
    private Student[] students;

    public Group(String name, Personnel teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public void showInfo() {
        System.out.println("Nazwa grupy: " + name);
        System.out.println("Prowadzący: " + teacher.showInfo());
        System.out.println("Studenci:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].showInfo());
        }
    }
}
