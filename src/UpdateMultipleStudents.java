import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateMultipleStudents {


    List<Integer> updatemultiplestudent(int n) {
        List<Integer> idList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Enter the Detail of Student:" + (i + 1));
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Id of Student:" + (i + 1));
            student.setId(scan.nextInt());
            System.out.println("Enter the Name of Student:" + (i + 1));
            student.setName(scan.next());
            System.out.println("Enter the Address of Student:" + (i + 1));
            student.setAddress(scan.next());
            System.out.println("Enter the Email of Student:" + (i + 1));
            student.setEmail(scan.next());
            System.out.println("Enter the Branch of Student:" + (i + 1));
            student.setBranch(scan.next());
            System.out.println("Enter the Year of Student:" + (i + 1));
            student.setYear(scan.next());
            System.out.println("Enter the Current Course of Student:" + (i + 1));
            student.setCurrent_course(scan.next());
            System.out.println("\n\n");

            try {
                String url = "jdbc:mysql://localhost:3306/student_management_system";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();
                st.executeUpdate("update student set id = '" +
                        student.getId() + "' ,name = '" +
                        student.getName() + "' , email = '" +
                        student.getEmail() + "',address = '" +
                        student.getAddress() + "',current_course='" +
                        student.getCurrent_course() + "', year = '" +
                        student.getYear() + "',branch = '" +
                        student.getBranch() + "'where id = '" + student.getId() + "'");
                idList.add(student.getId());

            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return idList;
    }
}
