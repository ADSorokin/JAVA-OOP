import java.util.ArrayList;
import java.util.List;


public class TeacherService {



    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void updateTeacher(int index, Teacher newTeacher) {

        if (index >= 0 && index < teacherList.size()) {
            teacherList.set(index, newTeacher);
        }
        else System.out.println("Элемент не возможно обновить");
    }

    public void deleteTeacher(int index) {
        if (index >= 0 && index < teacherList.size()) {
            teacherList.remove(index);
        }
    }

    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teacherList);
    }
}
