import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Management_System {

    public static void main(String[] args) {
        int i = 5;
        while (i < 6) {
            InsertStudent insertstudent = new InsertStudent();
            SelectStudent selectstudent = new SelectStudent();
            UpdateStudent updatestudent = new UpdateStudent();
            DeleteStudent deleteStudent = new DeleteStudent();
            InsertMultipleStudents insertmultiplestudents = new InsertMultipleStudents();
            SelectMultipleStudents selectMultipleStudents = new SelectMultipleStudents();
            UpdateMultipleStudents updateMultipleStudents = new UpdateMultipleStudents();
            DeleteMultipleStudents deleteMultipleStudents = new DeleteMultipleStudents();
            SelectStudentAll selectStudentAll = new SelectStudentAll();
            DeleteStudentAll deleteStudentAll = new DeleteStudentAll();
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n");
            System.out.println("Enter your command(insert/select/select all/update/insert multiple/select multiple/delete/delete multiple), Enter 'stop' for end the Application :");
            String a = scan.nextLine();
            if (a.equals("insert")) {
                System.out.println("INSERT:");
                insertstudent.insertStudent();
            }
            if (a.equals("select")) {
                System.out.println("SELECT:");
                System.out.println("Enter the Id of Student:");
                selectstudent.selectStudent(scan.nextInt());
            }
            if (a.equals("update")) {
                updatestudent.updatestudent();
            }
            if (a.equals("delete")) {
                System.out.println("DELETE:");
                System.out.println("Enter the ID of student which you want to Delete:");
                int id = scan.nextInt();
                deleteStudent.deleteStudent(id);
            }
            if (a.equals("insert multiple")) {
                System.out.println("INSERT MULTIPLE:");
                System.out.println("Enter the number of students:");
                int n = scan.nextInt();
                insertmultiplestudents.insertmulstudent(n);
            }
            if (a.equals("select multiple")) {
                System.out.println("SELECT MULTIPLE:");
                List<Integer> ids = new ArrayList<>();
                System.out.println("Enter the total number of students:");
                int n = scan.nextInt();
                for(int j = 0 ; j< n ; j++){
                    System.out.println("Enter the id of student:"+(j+1));
                    ids.add(scan.nextInt());
                }
                selectMultipleStudents.selectmultiplestudent(ids);
            }
            if (a.equals("select all")) {
                System.out.println("SELECT All:");
                selectStudentAll.selectStudentAll();
            }

            if (a.equals("update multiple")) {
                System.out.println("UPDATE MULTIPLE:");
                System.out.println("Enter the number of Students:");
                int n = scan.nextInt();
                List<Integer> idList = updateMultipleStudents.updatemultiplestudent(n);
                selectMultipleStudents.selectmultiplestudent(idList);
            }
            if (a.equals("delete multiple")) {
                System.out.println("DELETE MULTIPLE:");
                System.out.println("Enter the number of Students:");
                int n = scan.nextInt();
                List<Integer> integerList = new ArrayList<>();
                for(int j = 0 ; j< n ; j++){
                    System.out.println("Enter the id of student:"+(j+1));
                    integerList.add(scan.nextInt());
                }
                deleteMultipleStudents.deletemultiplestudents(integerList);
            }
            if (a.equals("delete all")) {
                System.out.println("DELETE ALL:");
                deleteStudentAll.deleteStudentAll();
            }
            if (a.equals("stop")) {
                break;
            }
            i--;
        }
    }
}
