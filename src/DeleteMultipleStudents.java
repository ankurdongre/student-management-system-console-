import java.util.List;
public class DeleteMultipleStudents {
    DeleteStudent ds = new DeleteStudent();
    void deletemultiplestudents(List<Integer> id){
        for (int i = 0 ; i< id.size();i++){
            ds.deleteStudent(id.get(i));
        }
    }
}
