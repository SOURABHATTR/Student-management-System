import java.util.ArrayList;

public class Store {
    String uniqueId;
    String name;
    int rollNo;
    String Course;
    StringBuilder Semester;
    String Branch;
    String DOB;
    ArrayList<StringBuilder> Subject;

    // Constructor
    Store(String uniqueId, String name, int rollNo, String Course, StringBuilder Semester, String Branch, String DOB, ArrayList<StringBuilder> Subject) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.rollNo = rollNo;
        this.Course = Course;
        this.Semester = Semester;
        this.Branch = Branch;
        this.DOB = DOB;
        this.Subject = Subject;
    }

    // Getters
    public String getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return Course;
    }

    public StringBuilder getSemester() {
        return Semester;
    }

    public String getBranch() {
        return Branch;
    }

    public String getDOB() {
        return DOB;
    }

    public ArrayList<StringBuilder> getSubjects() {
        return Subject;
    }

    // Setters for mutable fields (Semester and Subject)
    public void setSemester(StringBuilder semester) {
        this.Semester = semester;
    }

    public void setSubjects(ArrayList<StringBuilder> Subject) {
        this.Subject = Subject;
    }
}
