import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        Lecturer lecturer = new Lecturer();
        Course course = new Course();

        System.out.print("Enter your Student name : ");
        String sName = scanner.nextLine();
        System.out.print("Enter your Degree name : ");
        String dName = scanner.nextLine();
        System.out.print("Enter your Following course name : ");
        String cName = scanner.nextLine();

        System.out.print("Enter your Lecturer name : ");
        String lName = scanner.nextLine();
        System.out.print("Enter Lecturer teaching course name : ");
        String ctName = scanner.nextLine();

        System.out.print("Enter your Course name : ");
        String courseName = scanner.nextLine();
        System.out.print("Enter your Course code: ");
        String courseCode = scanner.nextLine();

        student.setStudentName(sName);
        student.setDegreeName(dName);
        student.setCourseFollowing(cName);

        lecturer.setLecturerName(lName);
        lecturer.setCourseTeaching(ctName);

        course.setCourseCode(courseCode);
        course.setCourseName(courseName);

        System.out.println("Student name is "+student.getStudentName());
        System.out.println("Degree name is "+student.getDegreeName());
        System.out.println("FollowingCourse name is "+student.getCourseFollowing());

        System.out.println("Lecture name is "+lecturer.getLecturerName());
        System.out.println("Lecture teaching course name is "+lecturer.getCourseTeaching());

        System.out.println("Course name is "+course.getCourseName());
        System.out.println("Course code is "+course.getCourseCode());

    }
}
