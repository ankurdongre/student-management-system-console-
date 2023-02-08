import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleStudents {
    void insertmulstudent(int n){
        InsertStudent is = new InsertStudent();
            for(int i = 0;i<n;i++) {
                System.out.println("\n\nFor Student no. :"+(i+1));
                is.insertStudent();
            }
    }
}
