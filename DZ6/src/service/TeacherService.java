package service;

import entity.Teacher;

import java.util.ArrayList;
import java.util.List;


public class TeacherService implements UserService<Teacher> {



    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<>();
    }

    @Override
    public void updateItem(int index, Teacher teacher) {

        if (index > 0 && index <= teacherList.size()) {

        teacherList.set(index-1, teacher);
        }
        else System.out.println("Элемент не возможно обновить");
    }


    @Override
    public void addItem(Teacher teacher) {
        teacherList.add(teacher);
    }

    /**
     * данный метод Delete() сегрегирован и удален на уровне интерфейса сервиса тк не используется в конкретном приложении
     * */

//    public void deleteItem(int index) {
//        if (index > 0 && index <= teacherList.size()) {
//            teacherList.remove(index-1);
//        }
//        else System.out.println("Элемент не возможно удалить ");
//    }


    @Override
    public List<Teacher> getAllItem() {
        return new ArrayList<>(teacherList);
    }


}
