package src1.com.campus.src1.com.src1.com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks,
            double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    // getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }

    @Override
    public void displayStudentInfo(boolean showMarks) {
        super.displayStudentInfo(showMarks);
    }

    @Override
    public void generatereport() {
        // implementation for generating report card for ScholarshipStudent
        System.out.println("generate report card for Scholarship student");
    }

    @Override
    public void eligbleForScholarship() {
        System.out.println("Eligible For Scholarship");
    }
}