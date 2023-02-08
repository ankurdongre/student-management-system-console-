import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent {
    public void updatestudent(){
        SelectStudent ss = new SelectStudent();
        Student student = new Student();
        System.out.println("Enter the Detail of Student:\n");
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
        try{
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            st.executeUpdate("update student set id = '"+
                    student.getId()+"' ,name = '"+
                    student.getName()+"' , email = '"+
                    student.getEmail()+"',address = '"+
                    student.getAddress()+"',current_course='"+
                    student.getCurrent_course()+"', year = '"+
                    student.getYear()+"',branch = '"+
                    student.getBranch()+"'where id = '"+student.getId()+"'");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        ss.selectStudnet(student.getId());
    }
}
