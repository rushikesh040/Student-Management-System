public class Main {
    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();

        //For Storing student data
        sms.addStudent(new Student(101,"Rahul",98.0,"Computer Science"));
        sms.addStudent(new Student(102,"Ranveer", 80.5,"Arts"));
        sms.addStudent(new Student(104,"Amol", 56.9, "Electrical"));
        sms.addStudent(new Student(102, "Rakesh", 75.0, "IT"));



        //For Display student data
        System.out.println();
        System.out.println("***  Student Data ***");
        sms.displayAllStudents();

        //For Search Student
        System.out.println();
        System.out.println("***  Fetch Data by ID ***");
        sms.searchStudent(101);
        sms.searchStudent(104);

        //For Update student data
        System.out.println();
        System.out.println("***  Updated Data by ID ***");
        sms.updateStudent(101,"Shubham", 99.4, "IT");
        sms.displayAllStudents();


        //For Delete student data
        System.out.println();
        System.out.println("***  Delete Data by ID ***");
        sms.deleteStudent(104);
        sms.displayAllStudents();
    }
}