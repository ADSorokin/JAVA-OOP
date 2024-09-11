import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private TeacherService service;
    private TeacherView view;
    public TeacherController(TeacherService service, TeacherView view) {
        this.service = service;
        this.view = view;
    }

    public void addTeacher() {
        Teacher teacher = view.getTeacherDetailsFromUser();
        service.addTeacher(teacher);
    }

    public void updateTeacher(int index) {
        Teacher teacher = view.getTeacherDetailsFromUser();
        service.updateTeacher(index - 1, teacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = service.getAllTeachers();
        view.sendOnConsole(teachers);
    }




    @Override
    public void create(String firstName, String lastName, String middleName) {

    }
}
