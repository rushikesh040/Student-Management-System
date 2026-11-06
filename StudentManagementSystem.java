import java.util.*;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>(); 
    private Set<Integer> studentIds = new HashSet<>();
    private Map<Integer, Student> studentMap = new HashMap<>();


    public void addStudent(Student s) {
        int id = s.getStudentId();

        if (studentIds.add(id)) {
            students.add(s);
            studentMap.put(id, s);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Duplicate student ID.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Student list is empty...");
        } else {
            for (Student se : students) {
                System.out.println(se);
            }
        }
    }


    public void searchStudent(int id) {
        Student s = studentMap.get(id);

        if (s != null) {
            System.out.println("Student found..!");
            System.out.println(s);
        } else {
            System.out.println("Student not found..!");
        }
    }

    public void updateStudent(int studentId, String studentName, double studentMarks, String department) {
        Student s = studentMap.get(studentId);

        if (s != null) {
            s.setStudentName(studentName);
            s.setStudentMarks(studentMarks);
            s.setDepartment(department);

            System.out.println("Student updated successfully.!");
        } else {
            System.out.println("Student not found..!");
        }
    }


    public void deleteStudent(int studentId) {
        Student s = studentMap.get(studentId);

        if (s != null) {
            students.remove(s);
            studentIds.remove(studentId);
            studentMap.remove(studentId);
            System.out.println("Student deleted successfully..!");

        } else {
            System.out.println("Student not found..!");
        }


    }
}


