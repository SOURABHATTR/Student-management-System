import java.util.HashMap;

public class Fetch {
    private HashMap<String, Store> studentData;

    // Constructor
    public Fetch(HashMap<String, Store> studentData) {
        this.studentData = studentData;
    }

    // Fetch student details by uniqueId
    public void fetchStudent(String uniqueId) {
        if (studentData.containsKey(uniqueId)) {
            Store student = studentData.get(uniqueId);
            System.out.println("Student Details:");
            System.out.println("Unique ID: " + student.getUniqueId());
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Semester: " + student.getSemester().toString());
            System.out.println("Branch: " + student.getBranch());
            System.out.println("Date of Birth: " + student.getDOB());
            System.out.print("Subjects: ");
            for (StringBuilder subject : student.getSubjects()) {
                System.out.print(subject.toString() + " ");
            }
            System.out.println();
        } else {
            System.out.println("No student found with the given Unique ID!");
        }
    }
}
