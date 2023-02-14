import java.util.List;
public class SelectMultipleStudents {
    SelectStudent ss = new SelectStudent();

    void selectmultiplestudent(List<Integer> ids) {
        for (int i = 0; i < ids.size(); i++) {
            System.out.println("\n");
            ss.selectStudent(ids.get(i));
            System.out.println("\n\n");
        }
    }
}
