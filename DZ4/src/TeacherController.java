import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private TeacherService service;
    private TeacherView view;
    public TeacherController(TeacherService service, TeacherView view) {
        this.service = service;
        this.view = view;
    }
    @Override
    public void addItem() {
        Teacher teacher = view.getTeacherDetailsFromUser();
        service.addItem(teacher);
    }

    public void updateItem(int index) {
        Teacher teacher = view.getTeacherDetailsFromUser();
        service.updateItem(index - 1, teacher);
    }

    public void displayAll() {
        List<Teacher> teachers = service.getAllItem();
        view.sendOnConsole(teachers);
    }




    @Override
    public void create(String firstName, String lastName, String middleName) {

    }




}
