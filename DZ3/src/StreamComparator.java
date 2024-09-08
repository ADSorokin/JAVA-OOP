import java.util.Comparator;

public class StreamComparator implements Comparator<StudentStream> {
    @Override
    public int compare(StudentStream o1, StudentStream o2) {

        if(o1.getSizeOfStream() > o2.getSizeOfStream())
            return  1;
        else if(o1.getSizeOfStream() < o2.getSizeOfStream())
            return  -1;
        else
            return 0;

        }

}

