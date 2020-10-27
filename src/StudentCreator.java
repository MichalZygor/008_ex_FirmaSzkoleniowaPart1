import java.util.Scanner;

public class StudentCreator {
    public static Student[] createFromInput() {

        // system.in

        //return  new Student("a", "b", 3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Jeżeli chcesz wpisać studentów podaj '1' lub '0' aby użyć predefiniowanych: ");
        if (scanner.nextInt() == 1) {
            return createManualStudents();
        } else {
            return createDefaultStudents();
        }
    }

    private static Student[] createManualStudents() {
        System.out.print("Podaj liczbę studentów do wprowadzenia: ");
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[scanner.nextInt()];
        int index = 0;
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu kwot!");
        while (index < students.length) {
            System.out.print("Podaj imię:");
            String firstName = scanner.next();
            System.out.print("Podaj nazwisko:");
            String lastName = scanner.next();
            System.out.print("Podaj liczbę punktów:");
            int points = scanner.nextInt();
            students[index] = new Student(firstName, lastName, points);
            index++;
        }
        return students;
    }

    private static Student[] createDefaultStudents() {
        Student[] students = new Student[5];
        students[0] = new Student("Jacek", "Sawicki", 4);
        students[1] = new Student("Ania", "Wielka", 3);
        students[2] = new Student("Kasia", "Toporek", 3);
        students[3] = new Student("Marek", "Kłos", 2);
        students[4] = new Student("Adam", "Czech", 1);
        return students;
    }

}
