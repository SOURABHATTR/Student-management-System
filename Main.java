import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Store> studentData = new HashMap<>();
        Fetch fetch = new Fetch(studentData);
        Update update = new Update(studentData);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Store Data");
            System.out.println("2. Fetch Data");
            System.out.println("3. Update Data");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter student details:");
                    System.out.print("Unique ID: ");
                    String uniqueId = scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Roll No: ");
                    int rollNo = Integer.parseInt(scanner.nextLine());

                    System.out.print("Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Semester: ");
                    StringBuilder semester = new StringBuilder(scanner.nextLine());

                    System.out.print("Branch: ");
                    String branch = scanner.nextLine();

                    System.out.print("Date of Birth (DD-MM-YYYY): ");
                    String dob = scanner.nextLine();

                    System.out.print("Subjects (comma separated): ");
                    String[] subjectsArray = scanner.nextLine().split(",");
                    ArrayList<StringBuilder> subjects = new ArrayList<>();
                    for (String subject : subjectsArray) {
                        subjects.add(new StringBuilder(subject.trim()));
                    }

                    // Storing student data in the HashMap
                    Store student = new Store(uniqueId, name, rollNo, course, semester, branch, dob, subjects);
                    studentData.put(uniqueId, student);

                    System.out.println("Student data stored successfully!");
                    break;

                case 2:
                    System.out.print("Enter Unique ID to fetch data: ");
                    String fetchUniqueId = scanner.nextLine();
                    fetch.fetchStudent(fetchUniqueId);
                    break;

                case 3:
                    System.out.print("Enter Unique ID to update data: ");
                    String updateUniqueId = scanner.nextLine();
                    update.updateStudent(updateUniqueId);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();  // Close the scanner before exiting
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
