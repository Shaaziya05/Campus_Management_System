package src1.com.campus.src1.com.src1.com.campus.app;
import java.util.Scanner;

import src1.com.campus.src1.com.src1.com.campus.model.ScholarshipStudent;
import src1.com.campus.src1.com.src1.com.campus.model.Student;
import src1.com.campus.src1.com.src1.com.campus.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.println("Enter student Department: ");
        String department = sc.nextLine();
        System.out.println("Number of Subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for " + numSubjects + " subjects: ");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter Scholarship Percentage: ");
        double scholarshipPercentage = sc.nextDouble();
        sc.nextLine(); // consume the newline character
        Student student = new ScholarshipStudent(id, name, age, department, marks, scholarshipPercentage);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();

    }

    
}
