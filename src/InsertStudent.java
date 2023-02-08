import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent{
    void insertStudent(){
        Student student = new Student();
        System.out.println("Enter the Details of Student:\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Id of Student:");
        student.setId(scan.nextInt());
        System.out.println("Enter the Name of Student:");
        student.setName(scan.next());
        System.out.println("Enter the Address of Student:");
        student.setAddress(scan.next());
        System.out.println("Enter the Email of Student:");
        student.setEmail(scan.next());
        System.out.println("Enter the Branch of Student:");
        student.setBranch(scan.next());
        System.out.println("Enter the Year of Student:");
        student.setYear(scan.next());
        System.out.println("Enter the Current Course of Student:");
        student.setCurrent_course(scan.next());
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String userName = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values ('" + student.getId() + "','" +
                    student.getName() + "','" +
                    student.getEmail() + "','" +
                    student.getAddress() + "','" +
                    student.getCurrent_course() + "','" +
                    student.getYear() + "','" +
                    student.getBranch() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
