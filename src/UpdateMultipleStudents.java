import java.util.ArrayList;
import java.util.List;
public class UpdateMultipleStudents {
    List<Integer> updatemultiplestudent(int n) {
        List<Integer> idList = new ArrayList<>();
        UpdateStudent us = new UpdateStudent();
        for (int i = 0; i < n; i++) {
            System.out.println("\n\nFor Student no. :"+(i+1));
            us.updatestudent();
        }
        return idList;
    }
}
