import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Update {
    private HashMap<String, Store> studentData;
    private Scanner scanner;

    // Constructor
    public Update(HashMap<String, Store> studentData) {
        this.studentData = studentData;
        this.scanner = new Scanner(System.in);
    }

    // Update student data by uniqueId
    public void updateStudent(String uniqueId) {
        if (studentData.containsKey(uniqueId)) {
            Store student = studentData.get(uniqueId);

            System.out.println("What do you want to update?");
            System.out.println("1. Semester");
            System.out.println("2. Subjects");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter new Semester: ");
                    String newSemester = scanner.nextLine();
                    student.setSemester(new StringBuilder(newSemester));
                    System.out.println("Semester updated successfully!");
                    break;
                case 2:
                    System.out.println("Enter new Subjects (comma separated): ");
                    String[] newSubjectsArray = scanner.nextLine().split(",");
                    ArrayList<StringBuilder> newSubjects = new ArrayList<>();
                    for (String subject : newSubjectsArray) {
                        newSubjects.add(new StringBuilder(subject.trim()));
                    }
                    student.setSubjects(newSubjects);
                    System.out.println("Subjects updated successfully!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("No student found with the given Unique ID!");
        }
    }
}
