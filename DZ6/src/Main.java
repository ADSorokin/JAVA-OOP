import controller.TeacherController;
import controller.UserController;
import service.TeacherService;
import service.UserService;
import view.TeacherView;
import view.UserView;


public class Main {
    public static void main(String[] args) {
        UserService service = new TeacherService();
        UserView view = new TeacherView();
        UserController controller = new TeacherController(service,  view);


        controller.addItem();
        controller.addItem();
        controller.addItem();
        controller.displayAll();
        controller.updateItem(3);
        controller.displayAll();
    }
}