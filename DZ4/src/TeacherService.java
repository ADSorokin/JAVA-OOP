import java.util.ArrayList;
import java.util.List;


public class TeacherService implements UserService<Teacher> {



    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<>();
    }






    public void updateItem(int index, Teacher teacher) {

        if (index >= 0 && index < teacherList.size()) {
            teacherList.set(index, teacher);
        }
        else System.out.println("Элемент не возможно обновить");
    }


    @Override
    public void addItem(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void deleteItem(int index) {
        if (index >= 0 && index < teacherList.size()) {
            teacherList.remove(index);
        }
        else System.out.println("Элемент не возможно удалить ");
    }

    public List<Teacher> getAllItem() {
        return new ArrayList<>(teacherList);
    }


}
