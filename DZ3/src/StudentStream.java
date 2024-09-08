import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;


    public int getSizeOfStream() {
        return studentGroupList.size();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
}
