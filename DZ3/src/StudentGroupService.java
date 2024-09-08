import java.util.*;

public class StudentGroupService {
    private StudentGroup studentGroups;
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        Iterator<Student> iterator = studentGroups.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) &&
                    student.getMiddleName().equals(middleName) &&
                    student.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }

    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroups.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student>getSortedStudentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroups.getStudentList());
        studentList.sort(new StudentComparator());
                return studentList;


    }



}
