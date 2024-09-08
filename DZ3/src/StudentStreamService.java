
import java.util.*;

public class StudentStreamService {

    private StudentStream studentStreams;

    public List<StudentStream> getSortedStreamList(List<StudentStream> studentStreams){

        List<StudentStream>  studentStreamList = new ArrayList<>(studentStreams);
        studentStreamList.sort(new StreamComparator());
        return studentStreamList;
    }
 }
