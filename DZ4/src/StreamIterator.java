import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;
    private final List<StudentGroup> groupList ;

    public StreamIterator(StudentStream studentStream) {
        this.count = 0;
        this.groupList = studentStream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return count < groupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return groupList.get(count) ;
    }

    @Override
    public void remove() {
        groupList.remove(count);
    }
}
