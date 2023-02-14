import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudentAll {
    void selectStudentAll() {
        Student student = new Student();
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while (rs.next()) {
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
                student.setAddress(rs.getString(4));
                student.setCurrent_course(rs.getString(5));
                student.setYear(rs.getString(6));
                student.setBranch(rs.getString(7));
                System.out.println("Id:"+student.getId()+"\n"+
                        "Name:"+student.getName()+"\n"+
                        "Email:"+student.getEmail()+"\n"+
                        "Address:"+student.getAddress()+"\n"+
                        "Current Course:"+student.getCurrent_course()+"\n"+
                        "Year:"+student.getYear()+"\n"+
                        "Branch:"+student.getBranch());
                System.out.println("\n\n");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
