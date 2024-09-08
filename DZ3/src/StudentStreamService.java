
import java.util.*;

public class StudentStreamService {

    private StudentStream studentStreams;

    public List<StudentStream> getSortedStreamList(){

        List<StudentStream>  studentStreamList = new ArrayList<>();
        studentStreamList.sort(new StreamComparator());
        return studentStreamList;
    }
 }
