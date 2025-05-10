// Base class
class Person {
    private String firstName;
    private String lastName;
       // Constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Method to display details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}


// Derived class: Student
class Student extends Person {
    private String studentId;
    private String course;
    private String teacherName;
    Student(String firstName, String lastName, String studentId, String course, String teacherName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }
    public void displayDetails() {
        //super.displayDetails();
        System.out.println("Student Details:");
        System.out.println("First Name: " + super.getFirstName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Teacher Name: " + teacherName+"\n");
    }
}

// Derived class: Teacher
class Teacher extends Person {
    private String subjectName;
    private double salary;
    Teacher(String firstName, String lastName, String subjectName, double salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }
    public void displayDetails() {
        //super.displayDetails();
        System.out.println("Teacher Details:");
        System.out.println("First Name: " + super.getFirstName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Subject: " + subjectName);
        System.out.println("Salary: " + salary+"\n");
    }
}
// Main class to test the inheritance
public class InheritanceOfPerson {
    public static void main(String[] args) {
        Student student1 = new Student("Pavan", "kalyan", "S12345", "Java", "Mr.S.Lokesh");
        Student student2 = new Student("Uday", "kiran", "S54321", "Statistics", "Mr.N.kishore");
        Teacher teacher1 = new Teacher("Mrs.M.Dhana ", "Laskshmi", "Compiler Design", 60000);
        Teacher teacher2 = new Teacher("Mr.Anil", "Kumar", "C programming", 55000);
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        teacher2.displayDetails();
    }
}