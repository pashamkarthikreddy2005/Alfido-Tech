import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class StudentManagementSystem {
    private List<Student> studentList;
    private Scanner scanner;

    public StudentManagementSystem() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudentFromInput() {
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading int

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading int

        System.out.println("Enter student course:");
        String course = scanner.nextLine();

        Student newStudent = new Student(id, name, age, course);
        studentList.add(newStudent);
        System.out.println("Student added: " + newStudent.getName());
    }

    public void displayStudents() {
        System.out.println("Students in the system:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
            System.out.println(); // Add an extra newline character between students
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. Add a new student\n2. Display all students\n3. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sms.addStudentFromInput();
                    break;
                case 2:
                    sms.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
